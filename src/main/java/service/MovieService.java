package service;

import io.grpc.movie.proto.MovieGrpc;
import io.grpc.movie.proto.MovieOuterClass;
import io.grpc.stub.StreamObserver;




import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieService extends MovieGrpc.MovieImplBase {

  JSONParser jsonParser = new JSONParser();
  @Override
  public void getMovieListing(MovieOuterClass.Empty request, StreamObserver<MovieOuterClass.MovieListResponse> responseObserver) {
    MovieOuterClass.MovieListResponse.Builder response = MovieOuterClass.MovieListResponse.newBuilder();
//    response.setMoviesList()


  }

  @Override
  public void bookTicket(MovieOuterClass.BookTicketRequest request, StreamObserver<MovieOuterClass.BookTicketResponse> responseObserver) {
    String id =request.getMovieId();
    MovieOuterClass.BookTicketResponse.Builder bookTicketResponse = MovieOuterClass.BookTicketResponse.newBuilder();
    MovieOuterClass.ErroHandlingDetail.Builder errResponse = MovieOuterClass.ErroHandlingDetail.newBuilder();
    MovieOuterClass.MovieDetail.Builder movieDetail = MovieOuterClass.MovieDetail.newBuilder();

    String genre = new String();
    List<String> genre1 = new ArrayList<>();
    genre1.add("RomCom");
    String name = "";
    String errTitle = "";
    String errDescription = "";
    String errImage = "";
    String result = "";
    Map detail;
    try{
      FileReader reader = new FileReader("/Users/sahanaprasad/Desktop/movieRpc/src/main/movies/moviesDetails.json");
      Object obj = jsonParser.parse(reader);
      JSONObject movieList = (JSONObject) obj;

      detail = ((Map)movieList.get(request.getMovieId().toString()));
      System.out.println("Movie name : "+detail.get("movieName"));

      movieDetail.setDuration(((Long) detail.get("duration")).intValue())
              .setMovieId(request.getMovieId())
              .setRating(((Long) detail.get("rating")).intValue())
              .setYear(((Long) detail.get("year")).intValue())
              .addAllGenres((Iterable<String>) detail.get("genres"))
              .setStoryLine((String) detail.get("story_line"))
              .setPrice((String) detail.get("price"))
              .setMovieName((String) detail.get("movieName"))
              .setImageUrl((String) detail.get("image_url"));
     // bookTicketResponse.setBarCodeString("Sucess").setErrorHandlingDetails(errResponse).setMovieDetails(movieDetail);
      name = (String) detail.get("movieName");
      result = "Success";
    }catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    catch (Exception e) {
      errTitle = "NOT FOUND";
      errDescription = "Movie ID does not exist";
      errImage = "wertyui";
      errResponse.setTitle(errTitle).setDescription(errDescription).setImageUrl(errImage);
      result = "Failed";
    }

    bookTicketResponse.setBarCodeString(result).setErrorHandlingDetails(errResponse).setMovieDetails(movieDetail);
    //MovieOuterClass.Gen.Builder movieDetail = MovieOuterClass.MovieDetail.newBuilder();

    responseObserver.onNext(bookTicketResponse.build());
    responseObserver.onCompleted();
  }
}

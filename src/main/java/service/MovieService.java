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


    try{
      FileReader reader = new FileReader("/Users/shreyakishore/Downloads/movieRpc/src/main/movies/moviesDetails.json");
      Object obj = jsonParser.parse(reader);
      JSONObject movieList = (JSONObject) obj;
      System.out.println("Json fetched data : "+ movieList.get("1"));
    }catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ParseException e) {
      e.printStackTrace();
    }

    //MovieOuterClass.Gen.Builder movieDetail = MovieOuterClass.MovieDetail.newBuilder();
    errResponse.setTitle(" qwe").setDescription(" qwe").setImageUrl("qwe");
    movieDetail.setDuration(2).setMovieId("007").setRating(3).setYear(2000).addAllGenres(genre1)
            .setStoryLine("blah!").setPrice("599")
            .setImageUrl("www.xyz.com");
    bookTicketResponse.setBarCodeString("Sucess").setErrorHandlingDetails(errResponse).setMovieDetails(movieDetail);
    responseObserver.onNext(bookTicketResponse.build());
    responseObserver.onCompleted();
  }
}

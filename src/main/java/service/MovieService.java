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
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MovieService extends MovieGrpc.MovieImplBase {

    JSONParser jsonParser = new JSONParser();

    @Override
    public void getMovieListing(MovieOuterClass.Empty request, StreamObserver<MovieOuterClass.MovieListResponse> responseObserver) {

        MovieOuterClass.MovieListResponse.Builder response = MovieOuterClass.MovieListResponse.newBuilder();
        MovieOuterClass.MoviesType.Builder topRated = MovieOuterClass.MoviesType.newBuilder();
        MovieOuterClass.MoviesType.Builder upcoming = MovieOuterClass.MoviesType.newBuilder();
        MovieOuterClass.MoviesType.Builder nowInCinema = MovieOuterClass.MoviesType.newBuilder();
        MovieOuterClass.MovieDetail.Builder detailMovie = MovieOuterClass.MovieDetail.newBuilder();
        Map detail;
        topRated.setMovieCategory("Top Rated");
        upcoming.setMovieCategory("Coming Soon");
        nowInCinema.setMovieCategory("Now in Cinemas");

        for (int i = 1; i <= 5; i++) {
            try {
                FileReader reader = new FileReader("/Users/shreyakishore/Documents/gRPC/src/main/movies/moviesDetails.json");
//      FileReader reader = new FileReader("/Users/sahanaprasad/Desktop/movieRpc/src/main/movies/moviesDetails.json");
                Object obj = jsonParser.parse(reader);
                JSONObject movieList = (JSONObject) obj;
                detail = ((Map) movieList.get(String.valueOf(i)));

                detailMovie.setDuration((String) detail.get("duration")).setMovieId(String.valueOf(i))
                        .setRating(((Long) detail.get("rating")).intValue())
                        .setYear(((Long) detail.get("year")).intValue())
                        .setGenres((String) detail.get("genres"))
                        .setStoryLine((String) detail.get("story_line"))
                        .setPrice((String) detail.get("price"))
                        .setMovieName((String) detail.get("movieName"))
                        .setImageUrl((String) detail.get("image_url"));
                topRated.addMovieDetail(detailMovie);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 6; i <= 10; i++) {
            try {
                FileReader reader = new FileReader("/Users/shreyakishore/Documents/gRPC/src/main/movies/moviesDetails.json");
//      FileReader reader = new FileReader("/Users/sahanaprasad/Desktop/movieRpc/src/main/movies/moviesDetails.json");
                Object obj = jsonParser.parse(reader);
                JSONObject movieList = (JSONObject) obj;
                detail = ((Map) movieList.get(String.valueOf(i)));

                detailMovie.setDuration((String) detail.get("duration")).setMovieId(String.valueOf(i))
                        .setRating(((Long) detail.get("rating")).intValue())
                        .setYear(((Long) detail.get("year")).intValue())
                        .setGenres((String) detail.get("genres"))
                        .setStoryLine((String) detail.get("story_line"))
                        .setPrice((String) detail.get("price"))
                        .setMovieName((String) detail.get("movieName"))
                        .setImageUrl((String) detail.get("image_url"));
                upcoming.addMovieDetail(detailMovie);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 11; i <= 15; i++) {
            try {
                FileReader reader = new FileReader("/Users/shreyakishore/Documents/gRPC/src/main/movies/moviesDetails.json");
//      FileReader reader = new FileReader("/Users/sahanaprasad/Desktop/movieRpc/src/main/movies/moviesDetails.json");
                Object obj = jsonParser.parse(reader);
                JSONObject movieList = (JSONObject) obj;
                detail = ((Map) movieList.get(String.valueOf(i)));

                detailMovie.setDuration((String) detail.get("duration")).setMovieId(String.valueOf(i))
                        .setRating(((Long) detail.get("rating")).intValue())
                        .setYear(((Long) detail.get("year")).intValue())
                        .setGenres((String) detail.get("genres"))
                        .setStoryLine((String) detail.get("story_line"))
                        .setPrice((String) detail.get("price"))
                        .setMovieName((String) detail.get("movieName"))
                        .setImageUrl((String) detail.get("image_url"));
                nowInCinema.addMovieDetail(detailMovie);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        response.addMoviesList(topRated);
        response.addMoviesList(nowInCinema);
        response.addMoviesList(upcoming);
        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }

    @Override
    public void bookTicket(MovieOuterClass.BookTicketRequest request, StreamObserver<MovieOuterClass.BookTicketResponse> responseObserver) {
        String id = request.getMovieId();
        MovieOuterClass.BookTicketResponse.Builder bookTicketResponse = MovieOuterClass.BookTicketResponse.newBuilder();
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
        try {
            FileReader reader = new FileReader("/Users/shreyakishore/Documents/gRPC/src/main/movies/moviesDetails.json");
//      FileReader reader = new FileReader("/Users/sahanaprasad/Desktop/movieRpc/src/main/movies/moviesDetails.json");
            Object obj = jsonParser.parse(reader);
            JSONObject movieList = (JSONObject) obj;

            detail = ((Map) movieList.get(request.getMovieId().toString()));
//      System.out.println("Movie name : "+detail.get("movieName"));


            List couponsList = (List) movieList.get("Coupons");
            System.out.println("Coupons : " + couponsList);
            if (couponsList.contains(request.getCouponCode())) {
                movieDetail.setDuration((String) detail.get("duration"))
                        .setMovieId(request.getMovieId())
                        .setRating(((Long) detail.get("rating")).intValue())
                        .setYear(((Long) detail.get("year")).intValue())
                        .setGenres((String) detail.get("genres"))
                        .setStoryLine((String) detail.get("story_line"))
                        .setPrice((String) detail.get("price"))
                        .setMovieName((String) detail.get("movieName"))
                        .setImageUrl((String) detail.get("image_url"));
                name = (String) detail.get("movieName");
                result = "Success";
                bookTicketResponse.setBarCodeString(result).setMovieDetails(movieDetail);
            } else {
                MovieOuterClass.ErroHandlingDetail.Builder errResponse = MovieOuterClass.ErroHandlingDetail.newBuilder();

                errTitle = "NOT FOUND";
                errDescription = "Invalid Coupon";
                errImage = "wertyui";
                errResponse.setTitle(errTitle).setDescription(errDescription).setImageUrl(errImage);
                result = "Failed";
                bookTicketResponse.setBarCodeString(result).setErrorHandlingDetails(errResponse);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            MovieOuterClass.ErroHandlingDetail.Builder errResponse = MovieOuterClass.ErroHandlingDetail.newBuilder();
            errTitle = "NOT FOUND";
            errDescription = "Movie ID does not exist";
            errImage = "wertyui";
            errResponse.setTitle(errTitle).setDescription(errDescription).setImageUrl(errImage);
            result = "Failed";
            bookTicketResponse.setBarCodeString(result).setErrorHandlingDetails(errResponse);
        }
        //MovieOuterClass.Gen.Builder movieDetail = MovieOuterClass.MovieDetail.newBuilder();
        responseObserver.onNext(bookTicketResponse.build());
        responseObserver.onCompleted();
    }
}

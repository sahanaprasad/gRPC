package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.MovieService;

import java.io.IOException;

public class MovieServer {


   public static void main(String[] args) throws IOException, InterruptedException {

     Server server = ServerBuilder.forPort(9090).addService(new MovieService()).build();
     server.start();

     System.out.println("server listening on "+ server.getPort());

     server.awaitTermination();


  }
}

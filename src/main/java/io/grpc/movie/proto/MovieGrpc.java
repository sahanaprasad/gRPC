package io.grpc.movie.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: movie.proto")
public final class MovieGrpc {

  private MovieGrpc() {}

  public static final String SERVICE_NAME = "Movie";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.Empty,
      io.grpc.movie.proto.MovieOuterClass.MovieListResponse> getGetMovieListingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMovieListing",
      requestType = io.grpc.movie.proto.MovieOuterClass.Empty.class,
      responseType = io.grpc.movie.proto.MovieOuterClass.MovieListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.Empty,
      io.grpc.movie.proto.MovieOuterClass.MovieListResponse> getGetMovieListingMethod() {
    io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.Empty, io.grpc.movie.proto.MovieOuterClass.MovieListResponse> getGetMovieListingMethod;
    if ((getGetMovieListingMethod = MovieGrpc.getGetMovieListingMethod) == null) {
      synchronized (MovieGrpc.class) {
        if ((getGetMovieListingMethod = MovieGrpc.getGetMovieListingMethod) == null) {
          MovieGrpc.getGetMovieListingMethod = getGetMovieListingMethod = 
              io.grpc.MethodDescriptor.<io.grpc.movie.proto.MovieOuterClass.Empty, io.grpc.movie.proto.MovieOuterClass.MovieListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Movie", "GetMovieListing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.movie.proto.MovieOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.movie.proto.MovieOuterClass.MovieListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieMethodDescriptorSupplier("GetMovieListing"))
                  .build();
          }
        }
     }
     return getGetMovieListingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.BookTicketRequest,
      io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> getBookTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BookTicket",
      requestType = io.grpc.movie.proto.MovieOuterClass.BookTicketRequest.class,
      responseType = io.grpc.movie.proto.MovieOuterClass.BookTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.BookTicketRequest,
      io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> getBookTicketMethod() {
    io.grpc.MethodDescriptor<io.grpc.movie.proto.MovieOuterClass.BookTicketRequest, io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> getBookTicketMethod;
    if ((getBookTicketMethod = MovieGrpc.getBookTicketMethod) == null) {
      synchronized (MovieGrpc.class) {
        if ((getBookTicketMethod = MovieGrpc.getBookTicketMethod) == null) {
          MovieGrpc.getBookTicketMethod = getBookTicketMethod = 
              io.grpc.MethodDescriptor.<io.grpc.movie.proto.MovieOuterClass.BookTicketRequest, io.grpc.movie.proto.MovieOuterClass.BookTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Movie", "BookTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.movie.proto.MovieOuterClass.BookTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.movie.proto.MovieOuterClass.BookTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MovieMethodDescriptorSupplier("BookTicket"))
                  .build();
          }
        }
     }
     return getBookTicketMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieStub newStub(io.grpc.Channel channel) {
    return new MovieStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MovieBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MovieFutureStub(channel);
  }

  /**
   */
  public static abstract class MovieImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMovieListing(io.grpc.movie.proto.MovieOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.MovieListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMovieListingMethod(), responseObserver);
    }

    /**
     */
    public void bookTicket(io.grpc.movie.proto.MovieOuterClass.BookTicketRequest request,
        io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBookTicketMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMovieListingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.movie.proto.MovieOuterClass.Empty,
                io.grpc.movie.proto.MovieOuterClass.MovieListResponse>(
                  this, METHODID_GET_MOVIE_LISTING)))
          .addMethod(
            getBookTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.grpc.movie.proto.MovieOuterClass.BookTicketRequest,
                io.grpc.movie.proto.MovieOuterClass.BookTicketResponse>(
                  this, METHODID_BOOK_TICKET)))
          .build();
    }
  }

  /**
   */
  public static final class MovieStub extends io.grpc.stub.AbstractStub<MovieStub> {
    private MovieStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieStub(channel, callOptions);
    }

    /**
     */
    public void getMovieListing(io.grpc.movie.proto.MovieOuterClass.Empty request,
        io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.MovieListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMovieListingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookTicket(io.grpc.movie.proto.MovieOuterClass.BookTicketRequest request,
        io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookTicketMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MovieBlockingStub extends io.grpc.stub.AbstractStub<MovieBlockingStub> {
    private MovieBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieBlockingStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.movie.proto.MovieOuterClass.MovieListResponse getMovieListing(io.grpc.movie.proto.MovieOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMovieListingMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.movie.proto.MovieOuterClass.BookTicketResponse bookTicket(io.grpc.movie.proto.MovieOuterClass.BookTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getBookTicketMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MovieFutureStub extends io.grpc.stub.AbstractStub<MovieFutureStub> {
    private MovieFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MovieFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MovieFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.movie.proto.MovieOuterClass.MovieListResponse> getMovieListing(
        io.grpc.movie.proto.MovieOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMovieListingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.movie.proto.MovieOuterClass.BookTicketResponse> bookTicket(
        io.grpc.movie.proto.MovieOuterClass.BookTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBookTicketMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MOVIE_LISTING = 0;
  private static final int METHODID_BOOK_TICKET = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MovieImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MovieImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MOVIE_LISTING:
          serviceImpl.getMovieListing((io.grpc.movie.proto.MovieOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.MovieListResponse>) responseObserver);
          break;
        case METHODID_BOOK_TICKET:
          serviceImpl.bookTicket((io.grpc.movie.proto.MovieOuterClass.BookTicketRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.movie.proto.MovieOuterClass.BookTicketResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.movie.proto.MovieOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Movie");
    }
  }

  private static final class MovieFileDescriptorSupplier
      extends MovieBaseDescriptorSupplier {
    MovieFileDescriptorSupplier() {}
  }

  private static final class MovieMethodDescriptorSupplier
      extends MovieBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MovieMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MovieGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieFileDescriptorSupplier())
              .addMethod(getGetMovieListingMethod())
              .addMethod(getBookTicketMethod())
              .build();
        }
      }
    }
    return result;
  }
}

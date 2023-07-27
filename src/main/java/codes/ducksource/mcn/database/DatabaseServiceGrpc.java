package codes.ducksource.mcn.database;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: database.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DatabaseServiceGrpc {

  private DatabaseServiceGrpc() {}

  public static final String SERVICE_NAME = "service.DatabaseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.CreatePlayerRequest,
      codes.ducksource.mcn.database.Database.CreatePlayerResponse> getCreatePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreatePlayer",
      requestType = codes.ducksource.mcn.database.Database.CreatePlayerRequest.class,
      responseType = codes.ducksource.mcn.database.Database.CreatePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.CreatePlayerRequest,
      codes.ducksource.mcn.database.Database.CreatePlayerResponse> getCreatePlayerMethod() {
    io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.CreatePlayerRequest, codes.ducksource.mcn.database.Database.CreatePlayerResponse> getCreatePlayerMethod;
    if ((getCreatePlayerMethod = DatabaseServiceGrpc.getCreatePlayerMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getCreatePlayerMethod = DatabaseServiceGrpc.getCreatePlayerMethod) == null) {
          DatabaseServiceGrpc.getCreatePlayerMethod = getCreatePlayerMethod =
              io.grpc.MethodDescriptor.<codes.ducksource.mcn.database.Database.CreatePlayerRequest, codes.ducksource.mcn.database.Database.CreatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreatePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.CreatePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.CreatePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("CreatePlayer"))
              .build();
        }
      }
    }
    return getCreatePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.GetPlayerRequest,
      codes.ducksource.mcn.database.Database.GetPlayerResponse> getGetPlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPlayer",
      requestType = codes.ducksource.mcn.database.Database.GetPlayerRequest.class,
      responseType = codes.ducksource.mcn.database.Database.GetPlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.GetPlayerRequest,
      codes.ducksource.mcn.database.Database.GetPlayerResponse> getGetPlayerMethod() {
    io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.GetPlayerRequest, codes.ducksource.mcn.database.Database.GetPlayerResponse> getGetPlayerMethod;
    if ((getGetPlayerMethod = DatabaseServiceGrpc.getGetPlayerMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getGetPlayerMethod = DatabaseServiceGrpc.getGetPlayerMethod) == null) {
          DatabaseServiceGrpc.getGetPlayerMethod = getGetPlayerMethod =
              io.grpc.MethodDescriptor.<codes.ducksource.mcn.database.Database.GetPlayerRequest, codes.ducksource.mcn.database.Database.GetPlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.GetPlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.GetPlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("GetPlayer"))
              .build();
        }
      }
    }
    return getGetPlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.UpdatePlayerRequest,
      codes.ducksource.mcn.database.Database.UpdatePlayerResponse> getUpdatePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatePlayer",
      requestType = codes.ducksource.mcn.database.Database.UpdatePlayerRequest.class,
      responseType = codes.ducksource.mcn.database.Database.UpdatePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.UpdatePlayerRequest,
      codes.ducksource.mcn.database.Database.UpdatePlayerResponse> getUpdatePlayerMethod() {
    io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.UpdatePlayerRequest, codes.ducksource.mcn.database.Database.UpdatePlayerResponse> getUpdatePlayerMethod;
    if ((getUpdatePlayerMethod = DatabaseServiceGrpc.getUpdatePlayerMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getUpdatePlayerMethod = DatabaseServiceGrpc.getUpdatePlayerMethod) == null) {
          DatabaseServiceGrpc.getUpdatePlayerMethod = getUpdatePlayerMethod =
              io.grpc.MethodDescriptor.<codes.ducksource.mcn.database.Database.UpdatePlayerRequest, codes.ducksource.mcn.database.Database.UpdatePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.UpdatePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.UpdatePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("UpdatePlayer"))
              .build();
        }
      }
    }
    return getUpdatePlayerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.DeletePlayerRequest,
      codes.ducksource.mcn.database.Database.DeletePlayerResponse> getDeletePlayerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeletePlayer",
      requestType = codes.ducksource.mcn.database.Database.DeletePlayerRequest.class,
      responseType = codes.ducksource.mcn.database.Database.DeletePlayerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.DeletePlayerRequest,
      codes.ducksource.mcn.database.Database.DeletePlayerResponse> getDeletePlayerMethod() {
    io.grpc.MethodDescriptor<codes.ducksource.mcn.database.Database.DeletePlayerRequest, codes.ducksource.mcn.database.Database.DeletePlayerResponse> getDeletePlayerMethod;
    if ((getDeletePlayerMethod = DatabaseServiceGrpc.getDeletePlayerMethod) == null) {
      synchronized (DatabaseServiceGrpc.class) {
        if ((getDeletePlayerMethod = DatabaseServiceGrpc.getDeletePlayerMethod) == null) {
          DatabaseServiceGrpc.getDeletePlayerMethod = getDeletePlayerMethod =
              io.grpc.MethodDescriptor.<codes.ducksource.mcn.database.Database.DeletePlayerRequest, codes.ducksource.mcn.database.Database.DeletePlayerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeletePlayer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.DeletePlayerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  codes.ducksource.mcn.database.Database.DeletePlayerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DatabaseServiceMethodDescriptorSupplier("DeletePlayer"))
              .build();
        }
      }
    }
    return getDeletePlayerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DatabaseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceStub>() {
        @java.lang.Override
        public DatabaseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceStub(channel, callOptions);
        }
      };
    return DatabaseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DatabaseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceBlockingStub>() {
        @java.lang.Override
        public DatabaseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceBlockingStub(channel, callOptions);
        }
      };
    return DatabaseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DatabaseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DatabaseServiceFutureStub>() {
        @java.lang.Override
        public DatabaseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DatabaseServiceFutureStub(channel, callOptions);
        }
      };
    return DatabaseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPlayer(codes.ducksource.mcn.database.Database.CreatePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.CreatePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePlayerMethod(), responseObserver);
    }

    /**
     */
    default void getPlayer(codes.ducksource.mcn.database.Database.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.GetPlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPlayerMethod(), responseObserver);
    }

    /**
     */
    default void updatePlayer(codes.ducksource.mcn.database.Database.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePlayerMethod(), responseObserver);
    }

    /**
     */
    default void deletePlayer(codes.ducksource.mcn.database.Database.DeletePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.DeletePlayerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePlayerMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service DatabaseService.
   */
  public static abstract class DatabaseServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DatabaseServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service DatabaseService.
   */
  public static final class DatabaseServiceStub
      extends io.grpc.stub.AbstractAsyncStub<DatabaseServiceStub> {
    private DatabaseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPlayer(codes.ducksource.mcn.database.Database.CreatePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.CreatePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPlayer(codes.ducksource.mcn.database.Database.GetPlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.GetPlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePlayer(codes.ducksource.mcn.database.Database.UpdatePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.UpdatePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePlayer(codes.ducksource.mcn.database.Database.DeletePlayerRequest request,
        io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.DeletePlayerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePlayerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service DatabaseService.
   */
  public static final class DatabaseServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DatabaseServiceBlockingStub> {
    private DatabaseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public codes.ducksource.mcn.database.Database.CreatePlayerResponse createPlayer(codes.ducksource.mcn.database.Database.CreatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public codes.ducksource.mcn.database.Database.GetPlayerResponse getPlayer(codes.ducksource.mcn.database.Database.GetPlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public codes.ducksource.mcn.database.Database.UpdatePlayerResponse updatePlayer(codes.ducksource.mcn.database.Database.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePlayerMethod(), getCallOptions(), request);
    }

    /**
     */
    public codes.ducksource.mcn.database.Database.DeletePlayerResponse deletePlayer(codes.ducksource.mcn.database.Database.DeletePlayerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePlayerMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service DatabaseService.
   */
  public static final class DatabaseServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<DatabaseServiceFutureStub> {
    private DatabaseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DatabaseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DatabaseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<codes.ducksource.mcn.database.Database.CreatePlayerResponse> createPlayer(
        codes.ducksource.mcn.database.Database.CreatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<codes.ducksource.mcn.database.Database.GetPlayerResponse> getPlayer(
        codes.ducksource.mcn.database.Database.GetPlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<codes.ducksource.mcn.database.Database.UpdatePlayerResponse> updatePlayer(
        codes.ducksource.mcn.database.Database.UpdatePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePlayerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<codes.ducksource.mcn.database.Database.DeletePlayerResponse> deletePlayer(
        codes.ducksource.mcn.database.Database.DeletePlayerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePlayerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PLAYER = 0;
  private static final int METHODID_GET_PLAYER = 1;
  private static final int METHODID_UPDATE_PLAYER = 2;
  private static final int METHODID_DELETE_PLAYER = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PLAYER:
          serviceImpl.createPlayer((codes.ducksource.mcn.database.Database.CreatePlayerRequest) request,
              (io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.CreatePlayerResponse>) responseObserver);
          break;
        case METHODID_GET_PLAYER:
          serviceImpl.getPlayer((codes.ducksource.mcn.database.Database.GetPlayerRequest) request,
              (io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.GetPlayerResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PLAYER:
          serviceImpl.updatePlayer((codes.ducksource.mcn.database.Database.UpdatePlayerRequest) request,
              (io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.UpdatePlayerResponse>) responseObserver);
          break;
        case METHODID_DELETE_PLAYER:
          serviceImpl.deletePlayer((codes.ducksource.mcn.database.Database.DeletePlayerRequest) request,
              (io.grpc.stub.StreamObserver<codes.ducksource.mcn.database.Database.DeletePlayerResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codes.ducksource.mcn.database.Database.CreatePlayerRequest,
              codes.ducksource.mcn.database.Database.CreatePlayerResponse>(
                service, METHODID_CREATE_PLAYER)))
        .addMethod(
          getGetPlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codes.ducksource.mcn.database.Database.GetPlayerRequest,
              codes.ducksource.mcn.database.Database.GetPlayerResponse>(
                service, METHODID_GET_PLAYER)))
        .addMethod(
          getUpdatePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codes.ducksource.mcn.database.Database.UpdatePlayerRequest,
              codes.ducksource.mcn.database.Database.UpdatePlayerResponse>(
                service, METHODID_UPDATE_PLAYER)))
        .addMethod(
          getDeletePlayerMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              codes.ducksource.mcn.database.Database.DeletePlayerRequest,
              codes.ducksource.mcn.database.Database.DeletePlayerResponse>(
                service, METHODID_DELETE_PLAYER)))
        .build();
  }

  private static abstract class DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DatabaseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return codes.ducksource.mcn.database.Database.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DatabaseService");
    }
  }

  private static final class DatabaseServiceFileDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier {
    DatabaseServiceFileDescriptorSupplier() {}
  }

  private static final class DatabaseServiceMethodDescriptorSupplier
      extends DatabaseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DatabaseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DatabaseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DatabaseServiceFileDescriptorSupplier())
              .addMethod(getCreatePlayerMethod())
              .addMethod(getGetPlayerMethod())
              .addMethod(getUpdatePlayerMethod())
              .addMethod(getDeletePlayerMethod())
              .build();
        }
      }
    }
    return result;
  }
}

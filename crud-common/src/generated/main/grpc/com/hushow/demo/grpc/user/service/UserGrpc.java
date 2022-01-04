package com.hushow.demo.grpc.user.service;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *服务定义
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.1)",
    comments = "Source: user_service.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "com.example.common.grpc.user.dto.User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.SearchUserRequest,
      com.example.common.grpc.user.dto.UserResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.example.common.grpc.user.dto.SearchUserRequest.class,
      responseType = com.example.common.grpc.user.dto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.SearchUserRequest,
      com.example.common.grpc.user.dto.UserResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.SearchUserRequest, com.example.common.grpc.user.dto.UserResponse> getListMethod;
    if ((getListMethod = UserGrpc.getListMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getListMethod = UserGrpc.getListMethod) == null) {
          UserGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.example.common.grpc.user.dto.SearchUserRequest, com.example.common.grpc.user.dto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.common.grpc.user.dto.SearchUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.common.grpc.user.dto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.AddUserRequest,
      com.example.common.grpc.user.dto.UserResponse> getAddMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add",
      requestType = com.example.common.grpc.user.dto.AddUserRequest.class,
      responseType = com.example.common.grpc.user.dto.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.AddUserRequest,
      com.example.common.grpc.user.dto.UserResponse> getAddMethod() {
    io.grpc.MethodDescriptor<com.example.common.grpc.user.dto.AddUserRequest, com.example.common.grpc.user.dto.UserResponse> getAddMethod;
    if ((getAddMethod = UserGrpc.getAddMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAddMethod = UserGrpc.getAddMethod) == null) {
          UserGrpc.getAddMethod = getAddMethod =
              io.grpc.MethodDescriptor.<com.example.common.grpc.user.dto.AddUserRequest, com.example.common.grpc.user.dto.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.common.grpc.user.dto.AddUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.common.grpc.user.dto.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("add"))
              .build();
        }
      }
    }
    return getAddMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStub>() {
        @java.lang.Override
        public UserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStub(channel, callOptions);
        }
      };
    return UserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub>() {
        @java.lang.Override
        public UserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingStub(channel, callOptions);
        }
      };
    return UserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserFutureStub>() {
        @java.lang.Override
        public UserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserFutureStub(channel, callOptions);
        }
      };
    return UserFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *服务定义
   * </pre>
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *查询用户列表，以流式返回多个对象
     * </pre>
     */
    public void list(com.example.common.grpc.user.dto.SearchUserRequest request,
        io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     *添加用户信息，返回单个对象
     * </pre>
     */
    public void add(com.example.common.grpc.user.dto.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.example.common.grpc.user.dto.SearchUserRequest,
                com.example.common.grpc.user.dto.UserResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getAddMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.example.common.grpc.user.dto.AddUserRequest,
                com.example.common.grpc.user.dto.UserResponse>(
                  this, METHODID_ADD)))
          .build();
    }
  }

  /**
   * <pre>
   *服务定义
   * </pre>
   */
  public static final class UserStub extends io.grpc.stub.AbstractAsyncStub<UserStub> {
    private UserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     *查询用户列表，以流式返回多个对象
     * </pre>
     */
    public void list(com.example.common.grpc.user.dto.SearchUserRequest request,
        io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *添加用户信息，返回单个对象
     * </pre>
     */
    public void add(com.example.common.grpc.user.dto.AddUserRequest request,
        io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *服务定义
   * </pre>
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserBlockingStub> {
    private UserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *查询用户列表，以流式返回多个对象
     * </pre>
     */
    public java.util.Iterator<com.example.common.grpc.user.dto.UserResponse> list(
        com.example.common.grpc.user.dto.SearchUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *添加用户信息，返回单个对象
     * </pre>
     */
    public com.example.common.grpc.user.dto.UserResponse add(com.example.common.grpc.user.dto.AddUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *服务定义
   * </pre>
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractFutureStub<UserFutureStub> {
    private UserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *添加用户信息，返回单个对象
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.common.grpc.user.dto.UserResponse> add(
        com.example.common.grpc.user.dto.AddUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_ADD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((com.example.common.grpc.user.dto.SearchUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse>) responseObserver);
          break;
        case METHODID_ADD:
          serviceImpl.add((com.example.common.grpc.user.dto.AddUserRequest) request,
              (io.grpc.stub.StreamObserver<com.example.common.grpc.user.dto.UserResponse>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hushow.demo.grpc.user.service.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getAddMethod())
              .build();
        }
      }
    }
    return result;
  }
}

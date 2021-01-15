package io.grpc.examples.queryprocess;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: query_process.proto")
public final class QueryProcessGrpcGrpc {

  private QueryProcessGrpcGrpc() {}

  public static final String SERVICE_NAME = "queryprocess.QueryProcessGrpc";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<QpRequest,
      QpResponse> getProcessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Process",
      requestType = QpRequest.class,
      responseType = QpResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<QpRequest,
      QpResponse> getProcessMethod() {
    io.grpc.MethodDescriptor<QpRequest, QpResponse> getProcessMethod;
    if ((getProcessMethod = QueryProcessGrpcGrpc.getProcessMethod) == null) {
      synchronized (QueryProcessGrpcGrpc.class) {
        if ((getProcessMethod = QueryProcessGrpcGrpc.getProcessMethod) == null) {
          QueryProcessGrpcGrpc.getProcessMethod = getProcessMethod =
              io.grpc.MethodDescriptor.<QpRequest, QpResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Process"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QpRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  QpResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryProcessGrpcMethodDescriptorSupplier("Process"))
              .build();
        }
      }
    }
    return getProcessMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryProcessGrpcStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcStub>() {
        @Override
        public QueryProcessGrpcStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryProcessGrpcStub(channel, callOptions);
        }
      };
    return QueryProcessGrpcStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryProcessGrpcBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcBlockingStub>() {
        @Override
        public QueryProcessGrpcBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryProcessGrpcBlockingStub(channel, callOptions);
        }
      };
    return QueryProcessGrpcBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryProcessGrpcFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QueryProcessGrpcFutureStub>() {
        @Override
        public QueryProcessGrpcFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QueryProcessGrpcFutureStub(channel, callOptions);
        }
      };
    return QueryProcessGrpcFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class QueryProcessGrpcImplBase implements io.grpc.BindableService {

    /**
     */
    public void process(QpRequest request,
                        io.grpc.stub.StreamObserver<QpResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProcessMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProcessMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                QpRequest,
                QpResponse>(
                  this, METHODID_PROCESS)))
          .build();
    }
  }

  /**
   */
  public static final class QueryProcessGrpcStub extends io.grpc.stub.AbstractAsyncStub<QueryProcessGrpcStub> {
    private QueryProcessGrpcStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryProcessGrpcStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryProcessGrpcStub(channel, callOptions);
    }

    /**
     */
    public void process(QpRequest request,
                        io.grpc.stub.StreamObserver<QpResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueryProcessGrpcBlockingStub extends io.grpc.stub.AbstractBlockingStub<QueryProcessGrpcBlockingStub> {
    private QueryProcessGrpcBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryProcessGrpcBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryProcessGrpcBlockingStub(channel, callOptions);
    }

    /**
     */
    public QpResponse process(QpRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProcessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueryProcessGrpcFutureStub extends io.grpc.stub.AbstractFutureStub<QueryProcessGrpcFutureStub> {
    private QueryProcessGrpcFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected QueryProcessGrpcFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QueryProcessGrpcFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<QpResponse> process(
        QpRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProcessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROCESS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryProcessGrpcImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryProcessGrpcImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROCESS:
          serviceImpl.process((QpRequest) request,
              (io.grpc.stub.StreamObserver<QpResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryProcessGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryProcessGrpcBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return QueryProcessProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryProcessGrpc");
    }
  }

  private static final class QueryProcessGrpcFileDescriptorSupplier
      extends QueryProcessGrpcBaseDescriptorSupplier {
    QueryProcessGrpcFileDescriptorSupplier() {}
  }

  private static final class QueryProcessGrpcMethodDescriptorSupplier
      extends QueryProcessGrpcBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryProcessGrpcMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (QueryProcessGrpcGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryProcessGrpcFileDescriptorSupplier())
              .addMethod(getProcessMethod())
              .build();
        }
      }
    }
    return result;
  }
}

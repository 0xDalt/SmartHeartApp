package WarningService;

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
    comments = "Source: WarningService.proto")
public final class WarningServiceGrpc {

  private WarningServiceGrpc() {}

  public static final String SERVICE_NAME = "WarningService.WarningService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<WarningService.WarningServiceRequest,
      WarningService.WarningServiceResponse> getAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "alert",
      requestType = WarningService.WarningServiceRequest.class,
      responseType = WarningService.WarningServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<WarningService.WarningServiceRequest,
      WarningService.WarningServiceResponse> getAlertMethod() {
    io.grpc.MethodDescriptor<WarningService.WarningServiceRequest, WarningService.WarningServiceResponse> getAlertMethod;
    if ((getAlertMethod = WarningServiceGrpc.getAlertMethod) == null) {
      synchronized (WarningServiceGrpc.class) {
        if ((getAlertMethod = WarningServiceGrpc.getAlertMethod) == null) {
          WarningServiceGrpc.getAlertMethod = getAlertMethod = 
              io.grpc.MethodDescriptor.<WarningService.WarningServiceRequest, WarningService.WarningServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WarningService.WarningService", "alert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WarningService.WarningServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  WarningService.WarningServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WarningServiceMethodDescriptorSupplier("alert"))
                  .build();
          }
        }
     }
     return getAlertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WarningServiceStub newStub(io.grpc.Channel channel) {
    return new WarningServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WarningServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WarningServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WarningServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WarningServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WarningServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<WarningService.WarningServiceRequest> alert(
        io.grpc.stub.StreamObserver<WarningService.WarningServiceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getAlertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAlertMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                WarningService.WarningServiceRequest,
                WarningService.WarningServiceResponse>(
                  this, METHODID_ALERT)))
          .build();
    }
  }

  /**
   */
  public static final class WarningServiceStub extends io.grpc.stub.AbstractStub<WarningServiceStub> {
    private WarningServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarningServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarningServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarningServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<WarningService.WarningServiceRequest> alert(
        io.grpc.stub.StreamObserver<WarningService.WarningServiceResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getAlertMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class WarningServiceBlockingStub extends io.grpc.stub.AbstractStub<WarningServiceBlockingStub> {
    private WarningServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarningServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarningServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarningServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class WarningServiceFutureStub extends io.grpc.stub.AbstractStub<WarningServiceFutureStub> {
    private WarningServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WarningServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WarningServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WarningServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ALERT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WarningServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WarningServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ALERT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.alert(
              (io.grpc.stub.StreamObserver<WarningService.WarningServiceResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WarningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WarningServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return WarningService.WarningServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WarningService");
    }
  }

  private static final class WarningServiceFileDescriptorSupplier
      extends WarningServiceBaseDescriptorSupplier {
    WarningServiceFileDescriptorSupplier() {}
  }

  private static final class WarningServiceMethodDescriptorSupplier
      extends WarningServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WarningServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WarningServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WarningServiceFileDescriptorSupplier())
              .addMethod(getAlertMethod())
              .build();
        }
      }
    }
    return result;
  }
}

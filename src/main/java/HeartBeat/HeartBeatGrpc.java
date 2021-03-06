package HeartBeat;

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
    comments = "Source: heartbeat.proto")
public final class HeartBeatGrpc {

  private HeartBeatGrpc() {}

  public static final String SERVICE_NAME = "HeartBeat.HeartBeat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HeartBeat.HeartbeatRequest,
      HeartBeat.HeartbeatResponse> getGetRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRate",
      requestType = HeartBeat.HeartbeatRequest.class,
      responseType = HeartBeat.HeartbeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeartBeat.HeartbeatRequest,
      HeartBeat.HeartbeatResponse> getGetRateMethod() {
    io.grpc.MethodDescriptor<HeartBeat.HeartbeatRequest, HeartBeat.HeartbeatResponse> getGetRateMethod;
    if ((getGetRateMethod = HeartBeatGrpc.getGetRateMethod) == null) {
      synchronized (HeartBeatGrpc.class) {
        if ((getGetRateMethod = HeartBeatGrpc.getGetRateMethod) == null) {
          HeartBeatGrpc.getGetRateMethod = getGetRateMethod = 
              io.grpc.MethodDescriptor.<HeartBeat.HeartbeatRequest, HeartBeat.HeartbeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeartBeat.HeartBeat", "getRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartBeat.HeartbeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartBeat.HeartbeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeartBeatMethodDescriptorSupplier("getRate"))
                  .build();
          }
        }
     }
     return getGetRateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartBeatStub newStub(io.grpc.Channel channel) {
    return new HeartBeatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartBeatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeartBeatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartBeatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeartBeatFutureStub(channel);
  }

  /**
   */
  public static abstract class HeartBeatImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRate(HeartBeat.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<HeartBeat.HeartbeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetRateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeartBeat.HeartbeatRequest,
                HeartBeat.HeartbeatResponse>(
                  this, METHODID_GET_RATE)))
          .build();
    }
  }

  /**
   */
  public static final class HeartBeatStub extends io.grpc.stub.AbstractStub<HeartBeatStub> {
    private HeartBeatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartBeatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartBeatStub(channel, callOptions);
    }

    /**
     */
    public void getRate(HeartBeat.HeartbeatRequest request,
        io.grpc.stub.StreamObserver<HeartBeat.HeartbeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetRateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeartBeatBlockingStub extends io.grpc.stub.AbstractStub<HeartBeatBlockingStub> {
    private HeartBeatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartBeatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartBeatBlockingStub(channel, callOptions);
    }

    /**
     */
    public HeartBeat.HeartbeatResponse getRate(HeartBeat.HeartbeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetRateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeartBeatFutureStub extends io.grpc.stub.AbstractStub<HeartBeatFutureStub> {
    private HeartBeatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartBeatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartBeatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartBeatFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeartBeat.HeartbeatResponse> getRate(
        HeartBeat.HeartbeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetRateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeartBeatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeartBeatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RATE:
          serviceImpl.getRate((HeartBeat.HeartbeatRequest) request,
              (io.grpc.stub.StreamObserver<HeartBeat.HeartbeatResponse>) responseObserver);
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

  private static abstract class HeartBeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartBeatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HeartBeat.HeartBeatImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartBeat");
    }
  }

  private static final class HeartBeatFileDescriptorSupplier
      extends HeartBeatBaseDescriptorSupplier {
    HeartBeatFileDescriptorSupplier() {}
  }

  private static final class HeartBeatMethodDescriptorSupplier
      extends HeartBeatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeartBeatMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeartBeatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartBeatFileDescriptorSupplier())
              .addMethod(getGetRateMethod())
              .build();
        }
      }
    }
    return result;
  }
}

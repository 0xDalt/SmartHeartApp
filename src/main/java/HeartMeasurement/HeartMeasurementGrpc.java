package HeartMeasurement;

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
    comments = "Source: Heartmeasurement.proto")
public final class HeartMeasurementGrpc {

  private HeartMeasurementGrpc() {}

  public static final String SERVICE_NAME = "HeartMeasurement.HeartMeasurement";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<HeartMeasurement.HeartMeasurementRequest,
      HeartMeasurement.HeartMeasurementResponse> getRecordHeartMeasurementMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordHeartMeasurement",
      requestType = HeartMeasurement.HeartMeasurementRequest.class,
      responseType = HeartMeasurement.HeartMeasurementResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<HeartMeasurement.HeartMeasurementRequest,
      HeartMeasurement.HeartMeasurementResponse> getRecordHeartMeasurementMethod() {
    io.grpc.MethodDescriptor<HeartMeasurement.HeartMeasurementRequest, HeartMeasurement.HeartMeasurementResponse> getRecordHeartMeasurementMethod;
    if ((getRecordHeartMeasurementMethod = HeartMeasurementGrpc.getRecordHeartMeasurementMethod) == null) {
      synchronized (HeartMeasurementGrpc.class) {
        if ((getRecordHeartMeasurementMethod = HeartMeasurementGrpc.getRecordHeartMeasurementMethod) == null) {
          HeartMeasurementGrpc.getRecordHeartMeasurementMethod = getRecordHeartMeasurementMethod = 
              io.grpc.MethodDescriptor.<HeartMeasurement.HeartMeasurementRequest, HeartMeasurement.HeartMeasurementResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "HeartMeasurement.HeartMeasurement", "RecordHeartMeasurement"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartMeasurement.HeartMeasurementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  HeartMeasurement.HeartMeasurementResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new HeartMeasurementMethodDescriptorSupplier("RecordHeartMeasurement"))
                  .build();
          }
        }
     }
     return getRecordHeartMeasurementMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeartMeasurementStub newStub(io.grpc.Channel channel) {
    return new HeartMeasurementStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeartMeasurementBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HeartMeasurementBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeartMeasurementFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HeartMeasurementFutureStub(channel);
  }

  /**
   */
  public static abstract class HeartMeasurementImplBase implements io.grpc.BindableService {

    /**
     */
    public void recordHeartMeasurement(HeartMeasurement.HeartMeasurementRequest request,
        io.grpc.stub.StreamObserver<HeartMeasurement.HeartMeasurementResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRecordHeartMeasurementMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordHeartMeasurementMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                HeartMeasurement.HeartMeasurementRequest,
                HeartMeasurement.HeartMeasurementResponse>(
                  this, METHODID_RECORD_HEART_MEASUREMENT)))
          .build();
    }
  }

  /**
   */
  public static final class HeartMeasurementStub extends io.grpc.stub.AbstractStub<HeartMeasurementStub> {
    private HeartMeasurementStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartMeasurementStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartMeasurementStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartMeasurementStub(channel, callOptions);
    }

    /**
     */
    public void recordHeartMeasurement(HeartMeasurement.HeartMeasurementRequest request,
        io.grpc.stub.StreamObserver<HeartMeasurement.HeartMeasurementResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRecordHeartMeasurementMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeartMeasurementBlockingStub extends io.grpc.stub.AbstractStub<HeartMeasurementBlockingStub> {
    private HeartMeasurementBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartMeasurementBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartMeasurementBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartMeasurementBlockingStub(channel, callOptions);
    }

    /**
     */
    public HeartMeasurement.HeartMeasurementResponse recordHeartMeasurement(HeartMeasurement.HeartMeasurementRequest request) {
      return blockingUnaryCall(
          getChannel(), getRecordHeartMeasurementMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeartMeasurementFutureStub extends io.grpc.stub.AbstractStub<HeartMeasurementFutureStub> {
    private HeartMeasurementFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HeartMeasurementFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeartMeasurementFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HeartMeasurementFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<HeartMeasurement.HeartMeasurementResponse> recordHeartMeasurement(
        HeartMeasurement.HeartMeasurementRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRecordHeartMeasurementMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECORD_HEART_MEASUREMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeartMeasurementImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeartMeasurementImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_HEART_MEASUREMENT:
          serviceImpl.recordHeartMeasurement((HeartMeasurement.HeartMeasurementRequest) request,
              (io.grpc.stub.StreamObserver<HeartMeasurement.HeartMeasurementResponse>) responseObserver);
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

  private static abstract class HeartMeasurementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HeartMeasurementBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return HeartMeasurement.HeartMeasureImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HeartMeasurement");
    }
  }

  private static final class HeartMeasurementFileDescriptorSupplier
      extends HeartMeasurementBaseDescriptorSupplier {
    HeartMeasurementFileDescriptorSupplier() {}
  }

  private static final class HeartMeasurementMethodDescriptorSupplier
      extends HeartMeasurementBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HeartMeasurementMethodDescriptorSupplier(String methodName) {
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
      synchronized (HeartMeasurementGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HeartMeasurementFileDescriptorSupplier())
              .addMethod(getRecordHeartMeasurementMethod())
              .build();
        }
      }
    }
    return result;
  }
}

package RecordingsSerive;

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
    comments = "Source: RecordingService.proto")
public final class RecordingServiceGrpc {

  private RecordingServiceGrpc() {}

  public static final String SERVICE_NAME = "RecordingsSerive.RecordingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RecordingsSerive.RecordingServiceRequest,
      RecordingsSerive.RecordingServiceResponse> getRecordRecordingServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRecordingService",
      requestType = RecordingsSerive.RecordingServiceRequest.class,
      responseType = RecordingsSerive.RecordingServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<RecordingsSerive.RecordingServiceRequest,
      RecordingsSerive.RecordingServiceResponse> getRecordRecordingServiceMethod() {
    io.grpc.MethodDescriptor<RecordingsSerive.RecordingServiceRequest, RecordingsSerive.RecordingServiceResponse> getRecordRecordingServiceMethod;
    if ((getRecordRecordingServiceMethod = RecordingServiceGrpc.getRecordRecordingServiceMethod) == null) {
      synchronized (RecordingServiceGrpc.class) {
        if ((getRecordRecordingServiceMethod = RecordingServiceGrpc.getRecordRecordingServiceMethod) == null) {
          RecordingServiceGrpc.getRecordRecordingServiceMethod = getRecordRecordingServiceMethod = 
              io.grpc.MethodDescriptor.<RecordingsSerive.RecordingServiceRequest, RecordingsSerive.RecordingServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RecordingsSerive.RecordingService", "RecordRecordingService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingsSerive.RecordingServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingsSerive.RecordingServiceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecordingServiceMethodDescriptorSupplier("RecordRecordingService"))
                  .build();
          }
        }
     }
     return getRecordRecordingServiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecordingServiceStub newStub(io.grpc.Channel channel) {
    return new RecordingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecordingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RecordingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecordingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RecordingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class RecordingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *Client side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<RecordingsSerive.RecordingServiceRequest> recordRecordingService(
        io.grpc.stub.StreamObserver<RecordingsSerive.RecordingServiceResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordRecordingServiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecordRecordingServiceMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                RecordingsSerive.RecordingServiceRequest,
                RecordingsSerive.RecordingServiceResponse>(
                  this, METHODID_RECORD_RECORDING_SERVICE)))
          .build();
    }
  }

  /**
   */
  public static final class RecordingServiceStub extends io.grpc.stub.AbstractStub<RecordingServiceStub> {
    private RecordingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecordingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecordingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *Client side streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<RecordingsSerive.RecordingServiceRequest> recordRecordingService(
        io.grpc.stub.StreamObserver<RecordingsSerive.RecordingServiceResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordRecordingServiceMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RecordingServiceBlockingStub extends io.grpc.stub.AbstractStub<RecordingServiceBlockingStub> {
    private RecordingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecordingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecordingServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RecordingServiceFutureStub extends io.grpc.stub.AbstractStub<RecordingServiceFutureStub> {
    private RecordingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RecordingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecordingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RecordingServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_RECORD_RECORDING_SERVICE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecordingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecordingServiceImplBase serviceImpl, int methodId) {
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
        case METHODID_RECORD_RECORDING_SERVICE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRecordingService(
              (io.grpc.stub.StreamObserver<RecordingsSerive.RecordingServiceResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RecordingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecordingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RecordingsSerive.RecordServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RecordingService");
    }
  }

  private static final class RecordingServiceFileDescriptorSupplier
      extends RecordingServiceBaseDescriptorSupplier {
    RecordingServiceFileDescriptorSupplier() {}
  }

  private static final class RecordingServiceMethodDescriptorSupplier
      extends RecordingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecordingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (RecordingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecordingServiceFileDescriptorSupplier())
              .addMethod(getRecordRecordingServiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}

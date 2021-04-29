package RecordingService;

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

  public static final String SERVICE_NAME = "RecordingService.RecordingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<RecordingService.MedicalRecordRequest,
      RecordingService.MedicalRecordResponse> getGetMedicalRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMedicalRecords",
      requestType = RecordingService.MedicalRecordRequest.class,
      responseType = RecordingService.MedicalRecordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<RecordingService.MedicalRecordRequest,
      RecordingService.MedicalRecordResponse> getGetMedicalRecordsMethod() {
    io.grpc.MethodDescriptor<RecordingService.MedicalRecordRequest, RecordingService.MedicalRecordResponse> getGetMedicalRecordsMethod;
    if ((getGetMedicalRecordsMethod = RecordingServiceGrpc.getGetMedicalRecordsMethod) == null) {
      synchronized (RecordingServiceGrpc.class) {
        if ((getGetMedicalRecordsMethod = RecordingServiceGrpc.getGetMedicalRecordsMethod) == null) {
          RecordingServiceGrpc.getGetMedicalRecordsMethod = getGetMedicalRecordsMethod = 
              io.grpc.MethodDescriptor.<RecordingService.MedicalRecordRequest, RecordingService.MedicalRecordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RecordingService.RecordingService", "getMedicalRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.MedicalRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.MedicalRecordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecordingServiceMethodDescriptorSupplier("getMedicalRecords"))
                  .build();
          }
        }
     }
     return getGetMedicalRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RecordingService.PatientRecordsRequest,
      RecordingService.PatientRecordsResponse> getGetPatientRecordsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPatientRecords",
      requestType = RecordingService.PatientRecordsRequest.class,
      responseType = RecordingService.PatientRecordsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<RecordingService.PatientRecordsRequest,
      RecordingService.PatientRecordsResponse> getGetPatientRecordsMethod() {
    io.grpc.MethodDescriptor<RecordingService.PatientRecordsRequest, RecordingService.PatientRecordsResponse> getGetPatientRecordsMethod;
    if ((getGetPatientRecordsMethod = RecordingServiceGrpc.getGetPatientRecordsMethod) == null) {
      synchronized (RecordingServiceGrpc.class) {
        if ((getGetPatientRecordsMethod = RecordingServiceGrpc.getGetPatientRecordsMethod) == null) {
          RecordingServiceGrpc.getGetPatientRecordsMethod = getGetPatientRecordsMethod = 
              io.grpc.MethodDescriptor.<RecordingService.PatientRecordsRequest, RecordingService.PatientRecordsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "RecordingService.RecordingService", "getPatientRecords"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.PatientRecordsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.PatientRecordsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecordingServiceMethodDescriptorSupplier("getPatientRecords"))
                  .build();
          }
        }
     }
     return getGetPatientRecordsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<RecordingService.SetPatientBpmRequest,
      RecordingService.PatientResponse> getSetBpmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setBpm",
      requestType = RecordingService.SetPatientBpmRequest.class,
      responseType = RecordingService.PatientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<RecordingService.SetPatientBpmRequest,
      RecordingService.PatientResponse> getSetBpmMethod() {
    io.grpc.MethodDescriptor<RecordingService.SetPatientBpmRequest, RecordingService.PatientResponse> getSetBpmMethod;
    if ((getSetBpmMethod = RecordingServiceGrpc.getSetBpmMethod) == null) {
      synchronized (RecordingServiceGrpc.class) {
        if ((getSetBpmMethod = RecordingServiceGrpc.getSetBpmMethod) == null) {
          RecordingServiceGrpc.getSetBpmMethod = getSetBpmMethod = 
              io.grpc.MethodDescriptor.<RecordingService.SetPatientBpmRequest, RecordingService.PatientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "RecordingService.RecordingService", "setBpm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.SetPatientBpmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  RecordingService.PatientResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new RecordingServiceMethodDescriptorSupplier("setBpm"))
                  .build();
          }
        }
     }
     return getSetBpmMethod;
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
    public void getMedicalRecords(RecordingService.MedicalRecordRequest request,
        io.grpc.stub.StreamObserver<RecordingService.MedicalRecordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMedicalRecordsMethod(), responseObserver);
    }

    /**
     */
    public void getPatientRecords(RecordingService.PatientRecordsRequest request,
        io.grpc.stub.StreamObserver<RecordingService.PatientRecordsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPatientRecordsMethod(), responseObserver);
    }

    /**
     * <pre>
     *bpm and id from client side
     * </pre>
     */
    public void setBpm(RecordingService.SetPatientBpmRequest request,
        io.grpc.stub.StreamObserver<RecordingService.PatientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetBpmMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMedicalRecordsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                RecordingService.MedicalRecordRequest,
                RecordingService.MedicalRecordResponse>(
                  this, METHODID_GET_MEDICAL_RECORDS)))
          .addMethod(
            getGetPatientRecordsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                RecordingService.PatientRecordsRequest,
                RecordingService.PatientRecordsResponse>(
                  this, METHODID_GET_PATIENT_RECORDS)))
          .addMethod(
            getSetBpmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                RecordingService.SetPatientBpmRequest,
                RecordingService.PatientResponse>(
                  this, METHODID_SET_BPM)))
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
    public void getMedicalRecords(RecordingService.MedicalRecordRequest request,
        io.grpc.stub.StreamObserver<RecordingService.MedicalRecordResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetMedicalRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPatientRecords(RecordingService.PatientRecordsRequest request,
        io.grpc.stub.StreamObserver<RecordingService.PatientRecordsResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPatientRecordsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *bpm and id from client side
     * </pre>
     */
    public void setBpm(RecordingService.SetPatientBpmRequest request,
        io.grpc.stub.StreamObserver<RecordingService.PatientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetBpmMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     *Client side streaming
     * </pre>
     */
    public java.util.Iterator<RecordingService.MedicalRecordResponse> getMedicalRecords(
        RecordingService.MedicalRecordRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetMedicalRecordsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<RecordingService.PatientRecordsResponse> getPatientRecords(
        RecordingService.PatientRecordsRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPatientRecordsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *bpm and id from client side
     * </pre>
     */
    public RecordingService.PatientResponse setBpm(RecordingService.SetPatientBpmRequest request) {
      return blockingUnaryCall(
          getChannel(), getSetBpmMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     *bpm and id from client side
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<RecordingService.PatientResponse> setBpm(
        RecordingService.SetPatientBpmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSetBpmMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MEDICAL_RECORDS = 0;
  private static final int METHODID_GET_PATIENT_RECORDS = 1;
  private static final int METHODID_SET_BPM = 2;

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
        case METHODID_GET_MEDICAL_RECORDS:
          serviceImpl.getMedicalRecords((RecordingService.MedicalRecordRequest) request,
              (io.grpc.stub.StreamObserver<RecordingService.MedicalRecordResponse>) responseObserver);
          break;
        case METHODID_GET_PATIENT_RECORDS:
          serviceImpl.getPatientRecords((RecordingService.PatientRecordsRequest) request,
              (io.grpc.stub.StreamObserver<RecordingService.PatientRecordsResponse>) responseObserver);
          break;
        case METHODID_SET_BPM:
          serviceImpl.setBpm((RecordingService.SetPatientBpmRequest) request,
              (io.grpc.stub.StreamObserver<RecordingService.PatientResponse>) responseObserver);
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

  private static abstract class RecordingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecordingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return RecordingService.RecordServiceImpl.getDescriptor();
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
              .addMethod(getGetMedicalRecordsMethod())
              .addMethod(getGetPatientRecordsMethod())
              .addMethod(getSetBpmMethod())
              .build();
        }
      }
    }
    return result;
  }
}

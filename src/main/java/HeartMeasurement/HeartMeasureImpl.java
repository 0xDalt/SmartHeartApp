// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heartmeasurement.proto

package HeartMeasurement;

public final class HeartMeasureImpl {
  private HeartMeasureImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartMeasurement_HeartMeasurementResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartMeasurement_Patient_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartMeasurement_Patient_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartMeasurement_HeartMeasurementRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartMeasurement_HeartMeasurementRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026Heartmeasurement.proto\022\020HeartMeasureme" +
      "nt\"\221\001\n\030HeartMeasurementResponse\022A\n\006statu" +
      "s\030\003 \001(\01621.HeartMeasurement.HeartMeasurem" +
      "entResponse.Status\022\013\n\003bpm\030\004 \001(\005\"%\n\006Statu" +
      "s\022\013\n\007FAILURE\020\000\022\016\n\nSUCCESSFUL\020\001\"6\n\007Patien" +
      "t\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\022\021\n\triskLevel" +
      "\030\003 \001(\005\"E\n\027HeartMeasurementRequest\022*\n\007pat" +
      "ient\030\001 \003(\0132\031.HeartMeasurement.Patient2\203\001" +
      "\n\020HeartMeasurement\022o\n\026RecordHeartMeasure" +
      "ment\022).HeartMeasurement.HeartMeasurement" +
      "Request\032*.HeartMeasurement.HeartMeasurem" +
      "entResponseB\024B\020HeartMeasureImplP\001b\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HeartMeasurement_HeartMeasurementResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor,
        new java.lang.String[] { "Status", "Bpm", });
    internal_static_HeartMeasurement_Patient_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HeartMeasurement_Patient_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartMeasurement_Patient_descriptor,
        new java.lang.String[] { "Id", "Name", "RiskLevel", });
    internal_static_HeartMeasurement_HeartMeasurementRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_HeartMeasurement_HeartMeasurementRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartMeasurement_HeartMeasurementRequest_descriptor,
        new java.lang.String[] { "Patient", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
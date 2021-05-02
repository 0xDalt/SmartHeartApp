// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingService;

public final class RecordServiceImpl {
  private RecordServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecordingService_MedicalRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecordingService_MedicalRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecordingService_MedicalRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecordingService_MedicalRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecordingService_PatientRecordsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecordingService_PatientRecordsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecordingService_PatientRecordsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecordingService_PatientRecordsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RecordingService_MedicalRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RecordingService_MedicalRecordRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026RecordingService.proto\022\020RecordingServi" +
      "ce\"\266\001\n\025MedicalRecordResponse\022>\n\006status\030\001" +
      " \001(\0162..RecordingService.MedicalRecordRes" +
      "ponse.Status\0226\n\rmedicalRecord\030\002 \001(\0132\037.Re" +
      "cordingService.MedicalRecord\"%\n\006Status\022\013" +
      "\n\007FAILURE\020\000\022\016\n\nSUCCESSFUL\020\001\")\n\rMedicalRe" +
      "cord\022\n\n\002id\030\001 \001(\005\022\014\n\004name\030\002 \001(\t\"9\n\025Patien" +
      "tRecordsRequest\022\017\n\007min_bpm\030\001 \001(\005\022\017\n\007max_" +
      "bpm\030\002 \001(\005\"$\n\026PatientRecordsResponse\022\n\n\002i" +
      "d\030\001 \001(\005\"#\n\024MedicalRecordRequest\022\013\n\003ids\030\001" +
      " \003(\0052\335\001\n\020RecordingService\022f\n\021getMedicalR" +
      "ecords\022&.RecordingService.MedicalRecordR" +
      "equest\032\'.RecordingService.MedicalRecordR" +
      "esponse0\001\022a\n\ngetRecords\022\'.RecordingServi" +
      "ce.PatientRecordsRequest\032(.RecordingServ" +
      "ice.PatientRecordsResponse0\001B\025B\021RecordSe" +
      "rviceImplP\001b\006proto3"
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
    internal_static_RecordingService_MedicalRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RecordingService_MedicalRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecordingService_MedicalRecordResponse_descriptor,
        new java.lang.String[] { "Status", "MedicalRecord", });
    internal_static_RecordingService_MedicalRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RecordingService_MedicalRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecordingService_MedicalRecord_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_RecordingService_PatientRecordsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RecordingService_PatientRecordsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecordingService_PatientRecordsRequest_descriptor,
        new java.lang.String[] { "MinBpm", "MaxBpm", });
    internal_static_RecordingService_PatientRecordsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_RecordingService_PatientRecordsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecordingService_PatientRecordsResponse_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_RecordingService_MedicalRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RecordingService_MedicalRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RecordingService_MedicalRecordRequest_descriptor,
        new java.lang.String[] { "Ids", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

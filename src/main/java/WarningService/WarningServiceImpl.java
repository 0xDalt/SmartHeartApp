// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WarningService.proto

package WarningService;

public final class WarningServiceImpl {
  private WarningServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WarningService_WarningServiceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WarningService_WarningServiceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WarningService_WarningServiceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WarningService_WarningServiceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024WarningService.proto\022\016WarningService\"+" +
      "\n\025WarningServiceRequest\022\022\n\npatient_id\030\001 " +
      "\001(\005\"O\n\026WarningServiceResponse\022\022\n\npatient" +
      "_id\030\001 \001(\005\022\022\n\nrisk_level\030\002 \001(\005\022\r\n\005alert\030\003" +
      " \001(\t2l\n\016WarningService\022Z\n\005alert\022%.Warnin" +
      "gService.WarningServiceRequest\032&.Warning" +
      "Service.WarningServiceResponse(\0010\001B\026B\022Wa" +
      "rningServiceImplP\001b\006proto3"
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
    internal_static_WarningService_WarningServiceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WarningService_WarningServiceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WarningService_WarningServiceRequest_descriptor,
        new java.lang.String[] { "PatientId", });
    internal_static_WarningService_WarningServiceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_WarningService_WarningServiceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WarningService_WarningServiceResponse_descriptor,
        new java.lang.String[] { "PatientId", "RiskLevel", "Alert", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

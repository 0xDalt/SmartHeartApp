// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingService;

public interface MedicalRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RecordingService.MedicalRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RecordingService.MedicalRecordResponse.Status status = 1;</code>
   */
  int getStatusValue();
  /**
   * <code>.RecordingService.MedicalRecordResponse.Status status = 1;</code>
   */
  RecordingService.MedicalRecordResponse.Status getStatus();

  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>.RecordingService.MedicalRecord medicalRecord = 2;</code>
   */
  boolean hasMedicalRecord();
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>.RecordingService.MedicalRecord medicalRecord = 2;</code>
   */
  RecordingService.MedicalRecord getMedicalRecord();
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>.RecordingService.MedicalRecord medicalRecord = 2;</code>
   */
  RecordingService.MedicalRecordOrBuilder getMedicalRecordOrBuilder();
}

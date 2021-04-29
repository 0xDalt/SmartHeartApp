// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingService;

public interface MedicalRecordResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RecordingService.MedicalRecordResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.RecordingService.MedicalRecordResponse.Status status = 3;</code>
   */
  int getStatusValue();
  /**
   * <code>.RecordingService.MedicalRecordResponse.Status status = 3;</code>
   */
  RecordingService.MedicalRecordResponse.Status getStatus();

  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingService.MedicalRecord medicalRecords = 4;</code>
   */
  java.util.List<RecordingService.MedicalRecord> 
      getMedicalRecordsList();
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingService.MedicalRecord medicalRecords = 4;</code>
   */
  RecordingService.MedicalRecord getMedicalRecords(int index);
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingService.MedicalRecord medicalRecords = 4;</code>
   */
  int getMedicalRecordsCount();
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingService.MedicalRecord medicalRecords = 4;</code>
   */
  java.util.List<? extends RecordingService.MedicalRecordOrBuilder> 
      getMedicalRecordsOrBuilderList();
  /**
   * <pre>
   *list medical records
   * </pre>
   *
   * <code>repeated .RecordingService.MedicalRecord medicalRecords = 4;</code>
   */
  RecordingService.MedicalRecordOrBuilder getMedicalRecordsOrBuilder(
      int index);
}

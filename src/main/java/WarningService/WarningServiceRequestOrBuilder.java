// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WaringService.proto

package WarningService;

public interface WarningServiceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:WarningService.WarningServiceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .WarningService.Patient patient = 1;</code>
   */
  java.util.List<WarningService.Patient> 
      getPatientList();
  /**
   * <code>repeated .WarningService.Patient patient = 1;</code>
   */
  WarningService.Patient getPatient(int index);
  /**
   * <code>repeated .WarningService.Patient patient = 1;</code>
   */
  int getPatientCount();
  /**
   * <code>repeated .WarningService.Patient patient = 1;</code>
   */
  java.util.List<? extends WarningService.PatientOrBuilder> 
      getPatientOrBuilderList();
  /**
   * <code>repeated .WarningService.Patient patient = 1;</code>
   */
  WarningService.PatientOrBuilder getPatientOrBuilder(
      int index);
}

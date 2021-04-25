// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Heartmeasurement.proto

package HeartMeasurement;

/**
 * Protobuf type {@code HeartMeasurement.HeartMeasurementResponse}
 */
public  final class HeartMeasurementResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HeartMeasurement.HeartMeasurementResponse)
    HeartMeasurementResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeartMeasurementResponse.newBuilder() to construct.
  private HeartMeasurementResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartMeasurementResponse() {
    status_ = 0;
    bpm_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HeartMeasurementResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 24: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 32: {

            bpm_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return HeartMeasurement.HeartMeasureImpl.internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return HeartMeasurement.HeartMeasureImpl.internal_static_HeartMeasurement_HeartMeasurementResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            HeartMeasurement.HeartMeasurementResponse.class, HeartMeasurement.HeartMeasurementResponse.Builder.class);
  }

  /**
   * Protobuf enum {@code HeartMeasurement.HeartMeasurementResponse.Status}
   */
  public enum Status
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FAILURE = 0;</code>
     */
    FAILURE(0),
    /**
     * <code>SUCCESSFUL = 1;</code>
     */
    SUCCESSFUL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FAILURE = 0;</code>
     */
    public static final int FAILURE_VALUE = 0;
    /**
     * <code>SUCCESSFUL = 1;</code>
     */
    public static final int SUCCESSFUL_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Status valueOf(int value) {
      return forNumber(value);
    }

    public static Status forNumber(int value) {
      switch (value) {
        case 0: return FAILURE;
        case 1: return SUCCESSFUL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Status>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Status> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Status>() {
            public Status findValueByNumber(int number) {
              return Status.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return HeartMeasurement.HeartMeasurementResponse.getDescriptor().getEnumTypes().get(0);
    }

    private static final Status[] VALUES = values();

    public static Status valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Status(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:HeartMeasurement.HeartMeasurementResponse.Status)
  }

  public static final int STATUS_FIELD_NUMBER = 3;
  private int status_;
  /**
   * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
   */
  public HeartMeasurement.HeartMeasurementResponse.Status getStatus() {
    @SuppressWarnings("deprecation")
    HeartMeasurement.HeartMeasurementResponse.Status result = HeartMeasurement.HeartMeasurementResponse.Status.valueOf(status_);
    return result == null ? HeartMeasurement.HeartMeasurementResponse.Status.UNRECOGNIZED : result;
  }

  public static final int BPM_FIELD_NUMBER = 4;
  private int bpm_;
  /**
   * <code>int32 bpm = 4;</code>
   */
  public int getBpm() {
    return bpm_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (status_ != HeartMeasurement.HeartMeasurementResponse.Status.FAILURE.getNumber()) {
      output.writeEnum(3, status_);
    }
    if (bpm_ != 0) {
      output.writeInt32(4, bpm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != HeartMeasurement.HeartMeasurementResponse.Status.FAILURE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, status_);
    }
    if (bpm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, bpm_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof HeartMeasurement.HeartMeasurementResponse)) {
      return super.equals(obj);
    }
    HeartMeasurement.HeartMeasurementResponse other = (HeartMeasurement.HeartMeasurementResponse) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    result = result && (getBpm()
        == other.getBpm());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + BPM_FIELD_NUMBER;
    hash = (53 * hash) + getBpm();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static HeartMeasurement.HeartMeasurementResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(HeartMeasurement.HeartMeasurementResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HeartMeasurement.HeartMeasurementResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HeartMeasurement.HeartMeasurementResponse)
      HeartMeasurement.HeartMeasurementResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HeartMeasurement.HeartMeasureImpl.internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HeartMeasurement.HeartMeasureImpl.internal_static_HeartMeasurement_HeartMeasurementResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              HeartMeasurement.HeartMeasurementResponse.class, HeartMeasurement.HeartMeasurementResponse.Builder.class);
    }

    // Construct using HeartMeasurement.HeartMeasurementResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      bpm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return HeartMeasurement.HeartMeasureImpl.internal_static_HeartMeasurement_HeartMeasurementResponse_descriptor;
    }

    @java.lang.Override
    public HeartMeasurement.HeartMeasurementResponse getDefaultInstanceForType() {
      return HeartMeasurement.HeartMeasurementResponse.getDefaultInstance();
    }

    @java.lang.Override
    public HeartMeasurement.HeartMeasurementResponse build() {
      HeartMeasurement.HeartMeasurementResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public HeartMeasurement.HeartMeasurementResponse buildPartial() {
      HeartMeasurement.HeartMeasurementResponse result = new HeartMeasurement.HeartMeasurementResponse(this);
      result.status_ = status_;
      result.bpm_ = bpm_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof HeartMeasurement.HeartMeasurementResponse) {
        return mergeFrom((HeartMeasurement.HeartMeasurementResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(HeartMeasurement.HeartMeasurementResponse other) {
      if (other == HeartMeasurement.HeartMeasurementResponse.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.getBpm() != 0) {
        setBpm(other.getBpm());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      HeartMeasurement.HeartMeasurementResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (HeartMeasurement.HeartMeasurementResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
     */
    public HeartMeasurement.HeartMeasurementResponse.Status getStatus() {
      @SuppressWarnings("deprecation")
      HeartMeasurement.HeartMeasurementResponse.Status result = HeartMeasurement.HeartMeasurementResponse.Status.valueOf(status_);
      return result == null ? HeartMeasurement.HeartMeasurementResponse.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
     */
    public Builder setStatus(HeartMeasurement.HeartMeasurementResponse.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.HeartMeasurement.HeartMeasurementResponse.Status status = 3;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private int bpm_ ;
    /**
     * <code>int32 bpm = 4;</code>
     */
    public int getBpm() {
      return bpm_;
    }
    /**
     * <code>int32 bpm = 4;</code>
     */
    public Builder setBpm(int value) {
      
      bpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 bpm = 4;</code>
     */
    public Builder clearBpm() {
      
      bpm_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HeartMeasurement.HeartMeasurementResponse)
  }

  // @@protoc_insertion_point(class_scope:HeartMeasurement.HeartMeasurementResponse)
  private static final HeartMeasurement.HeartMeasurementResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new HeartMeasurement.HeartMeasurementResponse();
  }

  public static HeartMeasurement.HeartMeasurementResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartMeasurementResponse>
      PARSER = new com.google.protobuf.AbstractParser<HeartMeasurementResponse>() {
    @java.lang.Override
    public HeartMeasurementResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HeartMeasurementResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HeartMeasurementResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartMeasurementResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public HeartMeasurement.HeartMeasurementResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingService;

/**
 * Protobuf type {@code RecordingService.PatientRecordsRequest}
 */
public  final class PatientRecordsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RecordingService.PatientRecordsRequest)
    PatientRecordsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PatientRecordsRequest.newBuilder() to construct.
  private PatientRecordsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PatientRecordsRequest() {
    minBpm_ = 0;
    maxBpm_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PatientRecordsRequest(
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
          case 8: {

            minBpm_ = input.readInt32();
            break;
          }
          case 16: {

            maxBpm_ = input.readInt32();
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
    return RecordingService.RecordServiceImpl.internal_static_RecordingService_PatientRecordsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RecordingService.RecordServiceImpl.internal_static_RecordingService_PatientRecordsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RecordingService.PatientRecordsRequest.class, RecordingService.PatientRecordsRequest.Builder.class);
  }

  public static final int MIN_BPM_FIELD_NUMBER = 1;
  private int minBpm_;
  /**
   * <code>int32 min_bpm = 1;</code>
   */
  public int getMinBpm() {
    return minBpm_;
  }

  public static final int MAX_BPM_FIELD_NUMBER = 2;
  private int maxBpm_;
  /**
   * <code>int32 max_bpm = 2;</code>
   */
  public int getMaxBpm() {
    return maxBpm_;
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
    if (minBpm_ != 0) {
      output.writeInt32(1, minBpm_);
    }
    if (maxBpm_ != 0) {
      output.writeInt32(2, maxBpm_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (minBpm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, minBpm_);
    }
    if (maxBpm_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, maxBpm_);
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
    if (!(obj instanceof RecordingService.PatientRecordsRequest)) {
      return super.equals(obj);
    }
    RecordingService.PatientRecordsRequest other = (RecordingService.PatientRecordsRequest) obj;

    boolean result = true;
    result = result && (getMinBpm()
        == other.getMinBpm());
    result = result && (getMaxBpm()
        == other.getMaxBpm());
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
    hash = (37 * hash) + MIN_BPM_FIELD_NUMBER;
    hash = (53 * hash) + getMinBpm();
    hash = (37 * hash) + MAX_BPM_FIELD_NUMBER;
    hash = (53 * hash) + getMaxBpm();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RecordingService.PatientRecordsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingService.PatientRecordsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RecordingService.PatientRecordsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingService.PatientRecordsRequest parseFrom(
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
  public static Builder newBuilder(RecordingService.PatientRecordsRequest prototype) {
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
   * Protobuf type {@code RecordingService.PatientRecordsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RecordingService.PatientRecordsRequest)
      RecordingService.PatientRecordsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_PatientRecordsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_PatientRecordsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RecordingService.PatientRecordsRequest.class, RecordingService.PatientRecordsRequest.Builder.class);
    }

    // Construct using RecordingService.PatientRecordsRequest.newBuilder()
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
      minBpm_ = 0;

      maxBpm_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_PatientRecordsRequest_descriptor;
    }

    @java.lang.Override
    public RecordingService.PatientRecordsRequest getDefaultInstanceForType() {
      return RecordingService.PatientRecordsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public RecordingService.PatientRecordsRequest build() {
      RecordingService.PatientRecordsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RecordingService.PatientRecordsRequest buildPartial() {
      RecordingService.PatientRecordsRequest result = new RecordingService.PatientRecordsRequest(this);
      result.minBpm_ = minBpm_;
      result.maxBpm_ = maxBpm_;
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
      if (other instanceof RecordingService.PatientRecordsRequest) {
        return mergeFrom((RecordingService.PatientRecordsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RecordingService.PatientRecordsRequest other) {
      if (other == RecordingService.PatientRecordsRequest.getDefaultInstance()) return this;
      if (other.getMinBpm() != 0) {
        setMinBpm(other.getMinBpm());
      }
      if (other.getMaxBpm() != 0) {
        setMaxBpm(other.getMaxBpm());
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
      RecordingService.PatientRecordsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RecordingService.PatientRecordsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int minBpm_ ;
    /**
     * <code>int32 min_bpm = 1;</code>
     */
    public int getMinBpm() {
      return minBpm_;
    }
    /**
     * <code>int32 min_bpm = 1;</code>
     */
    public Builder setMinBpm(int value) {
      
      minBpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_bpm = 1;</code>
     */
    public Builder clearMinBpm() {
      
      minBpm_ = 0;
      onChanged();
      return this;
    }

    private int maxBpm_ ;
    /**
     * <code>int32 max_bpm = 2;</code>
     */
    public int getMaxBpm() {
      return maxBpm_;
    }
    /**
     * <code>int32 max_bpm = 2;</code>
     */
    public Builder setMaxBpm(int value) {
      
      maxBpm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_bpm = 2;</code>
     */
    public Builder clearMaxBpm() {
      
      maxBpm_ = 0;
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


    // @@protoc_insertion_point(builder_scope:RecordingService.PatientRecordsRequest)
  }

  // @@protoc_insertion_point(class_scope:RecordingService.PatientRecordsRequest)
  private static final RecordingService.PatientRecordsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RecordingService.PatientRecordsRequest();
  }

  public static RecordingService.PatientRecordsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PatientRecordsRequest>
      PARSER = new com.google.protobuf.AbstractParser<PatientRecordsRequest>() {
    @java.lang.Override
    public PatientRecordsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PatientRecordsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PatientRecordsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PatientRecordsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RecordingService.PatientRecordsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


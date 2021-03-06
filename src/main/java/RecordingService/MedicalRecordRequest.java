// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RecordingService.proto

package RecordingService;

/**
 * Protobuf type {@code RecordingService.MedicalRecordRequest}
 */
public  final class MedicalRecordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RecordingService.MedicalRecordRequest)
    MedicalRecordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MedicalRecordRequest.newBuilder() to construct.
  private MedicalRecordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MedicalRecordRequest() {
    ids_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MedicalRecordRequest(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              ids_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            ids_.add(input.readInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001) && input.getBytesUntilLimit() > 0) {
              ids_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              ids_.add(input.readInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        ids_ = java.util.Collections.unmodifiableList(ids_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return RecordingService.RecordServiceImpl.internal_static_RecordingService_MedicalRecordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return RecordingService.RecordServiceImpl.internal_static_RecordingService_MedicalRecordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RecordingService.MedicalRecordRequest.class, RecordingService.MedicalRecordRequest.Builder.class);
  }

  public static final int IDS_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> ids_;
  /**
   * <code>repeated int32 ids = 1;</code>
   */
  public java.util.List<java.lang.Integer>
      getIdsList() {
    return ids_;
  }
  /**
   * <code>repeated int32 ids = 1;</code>
   */
  public int getIdsCount() {
    return ids_.size();
  }
  /**
   * <code>repeated int32 ids = 1;</code>
   */
  public int getIds(int index) {
    return ids_.get(index);
  }
  private int idsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (getIdsList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(idsMemoizedSerializedSize);
    }
    for (int i = 0; i < ids_.size(); i++) {
      output.writeInt32NoTag(ids_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < ids_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(ids_.get(i));
      }
      size += dataSize;
      if (!getIdsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      idsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof RecordingService.MedicalRecordRequest)) {
      return super.equals(obj);
    }
    RecordingService.MedicalRecordRequest other = (RecordingService.MedicalRecordRequest) obj;

    boolean result = true;
    result = result && getIdsList()
        .equals(other.getIdsList());
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
    if (getIdsCount() > 0) {
      hash = (37 * hash) + IDS_FIELD_NUMBER;
      hash = (53 * hash) + getIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RecordingService.MedicalRecordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingService.MedicalRecordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RecordingService.MedicalRecordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RecordingService.MedicalRecordRequest parseFrom(
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
  public static Builder newBuilder(RecordingService.MedicalRecordRequest prototype) {
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
   * Protobuf type {@code RecordingService.MedicalRecordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RecordingService.MedicalRecordRequest)
      RecordingService.MedicalRecordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_MedicalRecordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_MedicalRecordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RecordingService.MedicalRecordRequest.class, RecordingService.MedicalRecordRequest.Builder.class);
    }

    // Construct using RecordingService.MedicalRecordRequest.newBuilder()
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
      ids_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return RecordingService.RecordServiceImpl.internal_static_RecordingService_MedicalRecordRequest_descriptor;
    }

    @java.lang.Override
    public RecordingService.MedicalRecordRequest getDefaultInstanceForType() {
      return RecordingService.MedicalRecordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public RecordingService.MedicalRecordRequest build() {
      RecordingService.MedicalRecordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RecordingService.MedicalRecordRequest buildPartial() {
      RecordingService.MedicalRecordRequest result = new RecordingService.MedicalRecordRequest(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        ids_ = java.util.Collections.unmodifiableList(ids_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.ids_ = ids_;
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
      if (other instanceof RecordingService.MedicalRecordRequest) {
        return mergeFrom((RecordingService.MedicalRecordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RecordingService.MedicalRecordRequest other) {
      if (other == RecordingService.MedicalRecordRequest.getDefaultInstance()) return this;
      if (!other.ids_.isEmpty()) {
        if (ids_.isEmpty()) {
          ids_ = other.ids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIdsIsMutable();
          ids_.addAll(other.ids_);
        }
        onChanged();
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
      RecordingService.MedicalRecordRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RecordingService.MedicalRecordRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> ids_ = java.util.Collections.emptyList();
    private void ensureIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        ids_ = new java.util.ArrayList<java.lang.Integer>(ids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public java.util.List<java.lang.Integer>
        getIdsList() {
      return java.util.Collections.unmodifiableList(ids_);
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public int getIdsCount() {
      return ids_.size();
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public int getIds(int index) {
      return ids_.get(index);
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public Builder setIds(
        int index, int value) {
      ensureIdsIsMutable();
      ids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public Builder addIds(int value) {
      ensureIdsIsMutable();
      ids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public Builder addAllIds(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, ids_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated int32 ids = 1;</code>
     */
    public Builder clearIds() {
      ids_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:RecordingService.MedicalRecordRequest)
  }

  // @@protoc_insertion_point(class_scope:RecordingService.MedicalRecordRequest)
  private static final RecordingService.MedicalRecordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RecordingService.MedicalRecordRequest();
  }

  public static RecordingService.MedicalRecordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MedicalRecordRequest>
      PARSER = new com.google.protobuf.AbstractParser<MedicalRecordRequest>() {
    @java.lang.Override
    public MedicalRecordRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MedicalRecordRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MedicalRecordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MedicalRecordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RecordingService.MedicalRecordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


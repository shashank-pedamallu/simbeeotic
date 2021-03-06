/*
 * Copyright (c) 2012, The President and Fellows of Harvard College.
 * All Rights Reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *
 *  1. Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *  3. Neither the name of the University nor the names of its contributors
 *     may be used to endorse or promote products derived from this software
 *     without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE UNIVERSITY AND CONTRIBUTORS ``AS IS'' AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED.  IN NO EVENT SHALL THE UNIVERSITY OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY
 * OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Control.proto

package filterd.protocol;

public final class Control {
  private Control() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public static final class Result extends
      com.google.protobuf.GeneratedMessage {
    // Use Result.newBuilder() to construct.
    private Result() {
      initFields();
    }
    private Result(boolean noInit) {}
    
    private static final Result defaultInstance;
    public static Result getDefaultInstance() {
      return defaultInstance;
    }
    
    public Result getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return filterd.protocol.Control.internal_static_filterd_protocol_Result_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return filterd.protocol.Control.internal_static_filterd_protocol_Result_fieldAccessorTable;
    }
    
    public enum Type
        implements com.google.protobuf.ProtocolMessageEnum {
      SUCCESS(0, 0),
      FAILURE(1, 1),
      ;
      
      
      public final int getNumber() { return value; }
      
      public static Type valueOf(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return FAILURE;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.valueOf(number)
      ;        }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return filterd.protocol.Control.Result.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final Type[] VALUES = {
        SUCCESS, FAILURE, 
      };
      public static Type valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      private final int index;
      private final int value;
      private Type(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      static {
        filterd.protocol.Control.getDescriptor();
      }
      
      // @@protoc_insertion_point(enum_scope:filterd.protocol.Result.Type)
    }
    
    // required .filterd.protocol.Result.Type type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private boolean hasType;
    private filterd.protocol.Control.Result.Type type_;
    public boolean hasType() { return hasType; }
    public filterd.protocol.Control.Result.Type getType() { return type_; }
    
    // optional string message = 2;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private boolean hasMessage;
    private java.lang.String message_ = "";
    public boolean hasMessage() { return hasMessage; }
    public java.lang.String getMessage() { return message_; }
    
    private void initFields() {
      type_ = filterd.protocol.Control.Result.Type.SUCCESS;
    }
    public final boolean isInitialized() {
      if (!hasType) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasType()) {
        output.writeEnum(1, getType().getNumber());
      }
      if (hasMessage()) {
        output.writeString(2, getMessage());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasType()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, getType().getNumber());
      }
      if (hasMessage()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getMessage());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static filterd.protocol.Control.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static filterd.protocol.Control.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static filterd.protocol.Control.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static filterd.protocol.Control.Result parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(filterd.protocol.Control.Result prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private filterd.protocol.Control.Result result;
      
      // Construct using filterd.protocol.Control.Result.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new filterd.protocol.Control.Result();
        return builder;
      }
      
      protected filterd.protocol.Control.Result internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new filterd.protocol.Control.Result();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return filterd.protocol.Control.Result.getDescriptor();
      }
      
      public filterd.protocol.Control.Result getDefaultInstanceForType() {
        return filterd.protocol.Control.Result.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public filterd.protocol.Control.Result build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private filterd.protocol.Control.Result buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public filterd.protocol.Control.Result buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        filterd.protocol.Control.Result returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof filterd.protocol.Control.Result) {
          return mergeFrom((filterd.protocol.Control.Result)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(filterd.protocol.Control.Result other) {
        if (other == filterd.protocol.Control.Result.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasMessage()) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              filterd.protocol.Control.Result.Type value = filterd.protocol.Control.Result.Type.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                setType(value);
              }
              break;
            }
            case 18: {
              setMessage(input.readString());
              break;
            }
          }
        }
      }
      
      
      // required .filterd.protocol.Result.Type type = 1;
      public boolean hasType() {
        return result.hasType();
      }
      public filterd.protocol.Control.Result.Type getType() {
        return result.getType();
      }
      public Builder setType(filterd.protocol.Control.Result.Type value) {
        if (value == null) {
          throw new NullPointerException();
        }
        result.hasType = true;
        result.type_ = value;
        return this;
      }
      public Builder clearType() {
        result.hasType = false;
        result.type_ = filterd.protocol.Control.Result.Type.SUCCESS;
        return this;
      }
      
      // optional string message = 2;
      public boolean hasMessage() {
        return result.hasMessage();
      }
      public java.lang.String getMessage() {
        return result.getMessage();
      }
      public Builder setMessage(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasMessage = true;
        result.message_ = value;
        return this;
      }
      public Builder clearMessage() {
        result.hasMessage = false;
        result.message_ = getDefaultInstance().getMessage();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:filterd.protocol.Result)
    }
    
    static {
      defaultInstance = new Result(true);
      filterd.protocol.Control.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:filterd.protocol.Result)
  }
  
  public static final class Connect extends
      com.google.protobuf.GeneratedMessage {
    // Use Connect.newBuilder() to construct.
    private Connect() {
      initFields();
    }
    private Connect(boolean noInit) {}
    
    private static final Connect defaultInstance;
    public static Connect getDefaultInstance() {
      return defaultInstance;
    }
    
    public Connect getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return filterd.protocol.Control.internal_static_filterd_protocol_Connect_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return filterd.protocol.Control.internal_static_filterd_protocol_Connect_fieldAccessorTable;
    }
    
    // required string objectName = 1;
    public static final int OBJECTNAME_FIELD_NUMBER = 1;
    private boolean hasObjectName;
    private java.lang.String objectName_ = "";
    public boolean hasObjectName() { return hasObjectName; }
    public java.lang.String getObjectName() { return objectName_; }
    
    // required uint32 port = 2;
    public static final int PORT_FIELD_NUMBER = 2;
    private boolean hasPort;
    private int port_ = 0;
    public boolean hasPort() { return hasPort; }
    public int getPort() { return port_; }
    
    private void initFields() {
    }
    public final boolean isInitialized() {
      if (!hasObjectName) return false;
      if (!hasPort) return false;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hasObjectName()) {
        output.writeString(1, getObjectName());
      }
      if (hasPort()) {
        output.writeUInt32(2, getPort());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (hasObjectName()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getObjectName());
      }
      if (hasPort()) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, getPort());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    public static filterd.protocol.Control.Connect parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static filterd.protocol.Control.Connect parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static filterd.protocol.Control.Connect parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static filterd.protocol.Control.Connect parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static filterd.protocol.Control.Connect parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(filterd.protocol.Control.Connect prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> {
      private filterd.protocol.Control.Connect result;
      
      // Construct using filterd.protocol.Control.Connect.newBuilder()
      private Builder() {}
      
      private static Builder create() {
        Builder builder = new Builder();
        builder.result = new filterd.protocol.Control.Connect();
        return builder;
      }
      
      protected filterd.protocol.Control.Connect internalGetResult() {
        return result;
      }
      
      public Builder clear() {
        if (result == null) {
          throw new IllegalStateException(
            "Cannot call clear() after build().");
        }
        result = new filterd.protocol.Control.Connect();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(result);
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return filterd.protocol.Control.Connect.getDescriptor();
      }
      
      public filterd.protocol.Control.Connect getDefaultInstanceForType() {
        return filterd.protocol.Control.Connect.getDefaultInstance();
      }
      
      public boolean isInitialized() {
        return result.isInitialized();
      }
      public filterd.protocol.Control.Connect build() {
        if (result != null && !isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return buildPartial();
      }
      
      private filterd.protocol.Control.Connect buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        if (!isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return buildPartial();
      }
      
      public filterd.protocol.Control.Connect buildPartial() {
        if (result == null) {
          throw new IllegalStateException(
            "build() has already been called on this Builder.");
        }
        filterd.protocol.Control.Connect returnMe = result;
        result = null;
        return returnMe;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof filterd.protocol.Control.Connect) {
          return mergeFrom((filterd.protocol.Control.Connect)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(filterd.protocol.Control.Connect other) {
        if (other == filterd.protocol.Control.Connect.getDefaultInstance()) return this;
        if (other.hasObjectName()) {
          setObjectName(other.getObjectName());
        }
        if (other.hasPort()) {
          setPort(other.getPort());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                return this;
              }
              break;
            }
            case 10: {
              setObjectName(input.readString());
              break;
            }
            case 16: {
              setPort(input.readUInt32());
              break;
            }
          }
        }
      }
      
      
      // required string objectName = 1;
      public boolean hasObjectName() {
        return result.hasObjectName();
      }
      public java.lang.String getObjectName() {
        return result.getObjectName();
      }
      public Builder setObjectName(java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  result.hasObjectName = true;
        result.objectName_ = value;
        return this;
      }
      public Builder clearObjectName() {
        result.hasObjectName = false;
        result.objectName_ = getDefaultInstance().getObjectName();
        return this;
      }
      
      // required uint32 port = 2;
      public boolean hasPort() {
        return result.hasPort();
      }
      public int getPort() {
        return result.getPort();
      }
      public Builder setPort(int value) {
        result.hasPort = true;
        result.port_ = value;
        return this;
      }
      public Builder clearPort() {
        result.hasPort = false;
        result.port_ = 0;
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:filterd.protocol.Connect)
    }
    
    static {
      defaultInstance = new Connect(true);
      filterd.protocol.Control.internalForceInit();
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:filterd.protocol.Connect)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_filterd_protocol_Result_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_filterd_protocol_Result_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_filterd_protocol_Connect_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_filterd_protocol_Connect_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rControl.proto\022\020filterd.protocol\"h\n\006Res" +
      "ult\022+\n\004type\030\001 \002(\0162\035.filterd.protocol.Res" +
      "ult.Type\022\017\n\007message\030\002 \001(\t\" \n\004Type\022\013\n\007SUC" +
      "CESS\020\000\022\013\n\007FAILURE\020\001\"+\n\007Connect\022\022\n\nobject" +
      "Name\030\001 \002(\t\022\014\n\004port\030\002 \002(\r"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_filterd_protocol_Result_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_filterd_protocol_Result_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_filterd_protocol_Result_descriptor,
              new java.lang.String[] { "Type", "Message", },
              filterd.protocol.Control.Result.class,
              filterd.protocol.Control.Result.Builder.class);
          internal_static_filterd_protocol_Connect_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_filterd_protocol_Connect_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_filterd_protocol_Connect_descriptor,
              new java.lang.String[] { "ObjectName", "Port", },
              filterd.protocol.Control.Connect.class,
              filterd.protocol.Control.Connect.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  public static void internalForceInit() {}
  
  // @@protoc_insertion_point(outer_class_scope)
}

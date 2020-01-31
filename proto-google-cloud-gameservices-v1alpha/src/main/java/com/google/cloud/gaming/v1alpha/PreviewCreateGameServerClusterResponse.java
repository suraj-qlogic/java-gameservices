/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gaming/v1alpha/game_server_clusters.proto

package com.google.cloud.gaming.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for
 * GameServerClustersService.PreviewCreateGameServerCluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse}
 */
public final class PreviewCreateGameServerClusterResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)
    PreviewCreateGameServerClusterResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use PreviewCreateGameServerClusterResponse.newBuilder() to construct.
  private PreviewCreateGameServerClusterResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PreviewCreateGameServerClusterResponse() {
    etag_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PreviewCreateGameServerClusterResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private PreviewCreateGameServerClusterResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              com.google.cloud.gaming.v1alpha.DeployedState.Builder subBuilder = null;
              if (deployedState_ != null) {
                subBuilder = deployedState_.toBuilder();
              }
              deployedState_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1alpha.DeployedState.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deployedState_);
                deployedState_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              etag_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.gaming.v1alpha.TargetState.Builder subBuilder = null;
              if (targetState_ != null) {
                subBuilder = targetState_.toBuilder();
              }
              targetState_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1alpha.TargetState.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetState_);
                targetState_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1alpha.GameServerClusters
        .internal_static_google_cloud_gaming_v1alpha_PreviewCreateGameServerClusterResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1alpha.GameServerClusters
        .internal_static_google_cloud_gaming_v1alpha_PreviewCreateGameServerClusterResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse.class,
            com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse.Builder.class);
  }

  public static final int DEPLOYED_STATE_FIELD_NUMBER = 1;
  private com.google.cloud.gaming.v1alpha.DeployedState deployedState_;
  /**
   *
   *
   * <pre>
   * The deployed state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];</code>
   *
   * @return Whether the deployedState field is set.
   */
  @java.lang.Deprecated
  public boolean hasDeployedState() {
    return deployedState_ != null;
  }
  /**
   *
   *
   * <pre>
   * The deployed state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];</code>
   *
   * @return The deployedState.
   */
  @java.lang.Deprecated
  public com.google.cloud.gaming.v1alpha.DeployedState getDeployedState() {
    return deployedState_ == null
        ? com.google.cloud.gaming.v1alpha.DeployedState.getDefaultInstance()
        : deployedState_;
  }
  /**
   *
   *
   * <pre>
   * The deployed state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  public com.google.cloud.gaming.v1alpha.DeployedStateOrBuilder getDeployedStateOrBuilder() {
    return getDeployedState();
  }

  public static final int ETAG_FIELD_NUMBER = 2;
  private volatile java.lang.Object etag_;
  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  public java.lang.String getEtag() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      etag_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ETag of the game server cluster.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  public com.google.protobuf.ByteString getEtagBytes() {
    java.lang.Object ref = etag_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      etag_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TARGET_STATE_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1alpha.TargetState targetState_;
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
   *
   * @return Whether the targetState field is set.
   */
  public boolean hasTargetState() {
    return targetState_ != null;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
   *
   * @return The targetState.
   */
  public com.google.cloud.gaming.v1alpha.TargetState getTargetState() {
    return targetState_ == null
        ? com.google.cloud.gaming.v1alpha.TargetState.getDefaultInstance()
        : targetState_;
  }
  /**
   *
   *
   * <pre>
   * The target state.
   * </pre>
   *
   * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
   */
  public com.google.cloud.gaming.v1alpha.TargetStateOrBuilder getTargetStateOrBuilder() {
    return getTargetState();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (deployedState_ != null) {
      output.writeMessage(1, getDeployedState());
    }
    if (!getEtagBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, etag_);
    }
    if (targetState_ != null) {
      output.writeMessage(3, getTargetState());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (deployedState_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDeployedState());
    }
    if (!getEtagBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, etag_);
    }
    if (targetState_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getTargetState());
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
    if (!(obj instanceof com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse other =
        (com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse) obj;

    if (hasDeployedState() != other.hasDeployedState()) return false;
    if (hasDeployedState()) {
      if (!getDeployedState().equals(other.getDeployedState())) return false;
    }
    if (!getEtag().equals(other.getEtag())) return false;
    if (hasTargetState() != other.hasTargetState()) return false;
    if (hasTargetState()) {
      if (!getTargetState().equals(other.getTargetState())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasDeployedState()) {
      hash = (37 * hash) + DEPLOYED_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getDeployedState().hashCode();
    }
    hash = (37 * hash) + ETAG_FIELD_NUMBER;
    hash = (53 * hash) + getEtag().hashCode();
    if (hasTargetState()) {
      hash = (37 * hash) + TARGET_STATE_FIELD_NUMBER;
      hash = (53 * hash) + getTargetState().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response message for
   * GameServerClustersService.PreviewCreateGameServerCluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)
      com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_PreviewCreateGameServerClusterResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_PreviewCreateGameServerClusterResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse.class,
              com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (deployedStateBuilder_ == null) {
        deployedState_ = null;
      } else {
        deployedState_ = null;
        deployedStateBuilder_ = null;
      }
      etag_ = "";

      if (targetStateBuilder_ == null) {
        targetState_ = null;
      } else {
        targetState_ = null;
        targetStateBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1alpha.GameServerClusters
          .internal_static_google_cloud_gaming_v1alpha_PreviewCreateGameServerClusterResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse build() {
      com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse buildPartial() {
      com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse result =
          new com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse(this);
      if (deployedStateBuilder_ == null) {
        result.deployedState_ = deployedState_;
      } else {
        result.deployedState_ = deployedStateBuilder_.build();
      }
      result.etag_ = etag_;
      if (targetStateBuilder_ == null) {
        result.targetState_ = targetState_;
      } else {
        result.targetState_ = targetStateBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse) {
        return mergeFrom(
            (com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse other) {
      if (other
          == com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
              .getDefaultInstance()) return this;
      if (other.hasDeployedState()) {
        mergeDeployedState(other.getDeployedState());
      }
      if (!other.getEtag().isEmpty()) {
        etag_ = other.etag_;
        onChanged();
      }
      if (other.hasTargetState()) {
        mergeTargetState(other.getTargetState());
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
      com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.gaming.v1alpha.DeployedState deployedState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.DeployedState,
            com.google.cloud.gaming.v1alpha.DeployedState.Builder,
            com.google.cloud.gaming.v1alpha.DeployedStateOrBuilder>
        deployedStateBuilder_;
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     *
     * @return Whether the deployedState field is set.
     */
    @java.lang.Deprecated
    public boolean hasDeployedState() {
      return deployedStateBuilder_ != null || deployedState_ != null;
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     *
     * @return The deployedState.
     */
    @java.lang.Deprecated
    public com.google.cloud.gaming.v1alpha.DeployedState getDeployedState() {
      if (deployedStateBuilder_ == null) {
        return deployedState_ == null
            ? com.google.cloud.gaming.v1alpha.DeployedState.getDefaultInstance()
            : deployedState_;
      } else {
        return deployedStateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public Builder setDeployedState(com.google.cloud.gaming.v1alpha.DeployedState value) {
      if (deployedStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deployedState_ = value;
        onChanged();
      } else {
        deployedStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public Builder setDeployedState(
        com.google.cloud.gaming.v1alpha.DeployedState.Builder builderForValue) {
      if (deployedStateBuilder_ == null) {
        deployedState_ = builderForValue.build();
        onChanged();
      } else {
        deployedStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public Builder mergeDeployedState(com.google.cloud.gaming.v1alpha.DeployedState value) {
      if (deployedStateBuilder_ == null) {
        if (deployedState_ != null) {
          deployedState_ =
              com.google.cloud.gaming.v1alpha.DeployedState.newBuilder(deployedState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deployedState_ = value;
        }
        onChanged();
      } else {
        deployedStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public Builder clearDeployedState() {
      if (deployedStateBuilder_ == null) {
        deployedState_ = null;
        onChanged();
      } else {
        deployedState_ = null;
        deployedStateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public com.google.cloud.gaming.v1alpha.DeployedState.Builder getDeployedStateBuilder() {

      onChanged();
      return getDeployedStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    @java.lang.Deprecated
    public com.google.cloud.gaming.v1alpha.DeployedStateOrBuilder getDeployedStateOrBuilder() {
      if (deployedStateBuilder_ != null) {
        return deployedStateBuilder_.getMessageOrBuilder();
      } else {
        return deployedState_ == null
            ? com.google.cloud.gaming.v1alpha.DeployedState.getDefaultInstance()
            : deployedState_;
      }
    }
    /**
     *
     *
     * <pre>
     * The deployed state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.DeployedState deployed_state = 1 [deprecated = true];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.DeployedState,
            com.google.cloud.gaming.v1alpha.DeployedState.Builder,
            com.google.cloud.gaming.v1alpha.DeployedStateOrBuilder>
        getDeployedStateFieldBuilder() {
      if (deployedStateBuilder_ == null) {
        deployedStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1alpha.DeployedState,
                com.google.cloud.gaming.v1alpha.DeployedState.Builder,
                com.google.cloud.gaming.v1alpha.DeployedStateOrBuilder>(
                getDeployedState(), getParentForChildren(), isClean());
        deployedState_ = null;
      }
      return deployedStateBuilder_;
    }

    private java.lang.Object etag_ = "";
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return The etag.
     */
    public java.lang.String getEtag() {
      java.lang.Object ref = etag_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        etag_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return The bytes for etag.
     */
    public com.google.protobuf.ByteString getEtagBytes() {
      java.lang.Object ref = etag_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        etag_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @param value The etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtag(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      etag_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEtag() {

      etag_ = getDefaultInstance().getEtag();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ETag of the game server cluster.
     * </pre>
     *
     * <code>string etag = 2;</code>
     *
     * @param value The bytes for etag to set.
     * @return This builder for chaining.
     */
    public Builder setEtagBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      etag_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1alpha.TargetState targetState_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.TargetState,
            com.google.cloud.gaming.v1alpha.TargetState.Builder,
            com.google.cloud.gaming.v1alpha.TargetStateOrBuilder>
        targetStateBuilder_;
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     *
     * @return Whether the targetState field is set.
     */
    public boolean hasTargetState() {
      return targetStateBuilder_ != null || targetState_ != null;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     *
     * @return The targetState.
     */
    public com.google.cloud.gaming.v1alpha.TargetState getTargetState() {
      if (targetStateBuilder_ == null) {
        return targetState_ == null
            ? com.google.cloud.gaming.v1alpha.TargetState.getDefaultInstance()
            : targetState_;
      } else {
        return targetStateBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public Builder setTargetState(com.google.cloud.gaming.v1alpha.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        targetState_ = value;
        onChanged();
      } else {
        targetStateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public Builder setTargetState(
        com.google.cloud.gaming.v1alpha.TargetState.Builder builderForValue) {
      if (targetStateBuilder_ == null) {
        targetState_ = builderForValue.build();
        onChanged();
      } else {
        targetStateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public Builder mergeTargetState(com.google.cloud.gaming.v1alpha.TargetState value) {
      if (targetStateBuilder_ == null) {
        if (targetState_ != null) {
          targetState_ =
              com.google.cloud.gaming.v1alpha.TargetState.newBuilder(targetState_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          targetState_ = value;
        }
        onChanged();
      } else {
        targetStateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public Builder clearTargetState() {
      if (targetStateBuilder_ == null) {
        targetState_ = null;
        onChanged();
      } else {
        targetState_ = null;
        targetStateBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public com.google.cloud.gaming.v1alpha.TargetState.Builder getTargetStateBuilder() {

      onChanged();
      return getTargetStateFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    public com.google.cloud.gaming.v1alpha.TargetStateOrBuilder getTargetStateOrBuilder() {
      if (targetStateBuilder_ != null) {
        return targetStateBuilder_.getMessageOrBuilder();
      } else {
        return targetState_ == null
            ? com.google.cloud.gaming.v1alpha.TargetState.getDefaultInstance()
            : targetState_;
      }
    }
    /**
     *
     *
     * <pre>
     * The target state.
     * </pre>
     *
     * <code>.google.cloud.gaming.v1alpha.TargetState target_state = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1alpha.TargetState,
            com.google.cloud.gaming.v1alpha.TargetState.Builder,
            com.google.cloud.gaming.v1alpha.TargetStateOrBuilder>
        getTargetStateFieldBuilder() {
      if (targetStateBuilder_ == null) {
        targetStateBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1alpha.TargetState,
                com.google.cloud.gaming.v1alpha.TargetState.Builder,
                com.google.cloud.gaming.v1alpha.TargetStateOrBuilder>(
                getTargetState(), getParentForChildren(), isClean());
        targetState_ = null;
      }
      return targetStateBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse)
  private static final com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse();
  }

  public static com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PreviewCreateGameServerClusterResponse> PARSER =
      new com.google.protobuf.AbstractParser<PreviewCreateGameServerClusterResponse>() {
        @java.lang.Override
        public PreviewCreateGameServerClusterResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new PreviewCreateGameServerClusterResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<PreviewCreateGameServerClusterResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PreviewCreateGameServerClusterResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1alpha.PreviewCreateGameServerClusterResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

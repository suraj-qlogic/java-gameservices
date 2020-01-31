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
// source: google/cloud/gaming/v1alpha/game_server_deployments.proto

package com.google.cloud.gaming.v1alpha;

public interface FetchDeploymentStateResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.FetchDeploymentStateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The details of a deployment in a given location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails details = 1;
   * </code>
   */
  java.util.List<com.google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails>
      getDetailsList();
  /**
   *
   *
   * <pre>
   * The details of a deployment in a given location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails details = 1;
   * </code>
   */
  com.google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails getDetails(
      int index);
  /**
   *
   *
   * <pre>
   * The details of a deployment in a given location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails details = 1;
   * </code>
   */
  int getDetailsCount();
  /**
   *
   *
   * <pre>
   * The details of a deployment in a given location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails details = 1;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.gaming.v1alpha.FetchDeploymentStateResponse
                  .DeployedFleetDetailsOrBuilder>
      getDetailsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The details of a deployment in a given location.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetails details = 1;
   * </code>
   */
  com.google.cloud.gaming.v1alpha.FetchDeploymentStateResponse.DeployedFleetDetailsOrBuilder
      getDetailsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @return A list containing the unavailable.
   */
  java.util.List<java.lang.String> getUnavailableList();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @return The count of unavailable.
   */
  int getUnavailableCount();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The unavailable at the given index.
   */
  java.lang.String getUnavailable(int index);
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unavailable = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unavailable at the given index.
   */
  com.google.protobuf.ByteString getUnavailableBytes(int index);
}

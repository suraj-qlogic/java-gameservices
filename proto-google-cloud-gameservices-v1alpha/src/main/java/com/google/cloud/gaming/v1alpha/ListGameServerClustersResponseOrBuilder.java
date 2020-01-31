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

public interface ListGameServerClustersResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gaming.v1alpha.ListGameServerClustersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of game server clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.GameServerCluster game_server_clusters = 1;</code>
   */
  java.util.List<com.google.cloud.gaming.v1alpha.GameServerCluster> getGameServerClustersList();
  /**
   *
   *
   * <pre>
   * The list of game server clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.GameServerCluster game_server_clusters = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerCluster getGameServerClusters(int index);
  /**
   *
   *
   * <pre>
   * The list of game server clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.GameServerCluster game_server_clusters = 1;</code>
   */
  int getGameServerClustersCount();
  /**
   *
   *
   * <pre>
   * The list of game server clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.GameServerCluster game_server_clusters = 1;</code>
   */
  java.util.List<? extends com.google.cloud.gaming.v1alpha.GameServerClusterOrBuilder>
      getGameServerClustersOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of game server clusters.
   * </pre>
   *
   * <code>repeated .google.cloud.gaming.v1alpha.GameServerCluster game_server_clusters = 1;</code>
   */
  com.google.cloud.gaming.v1alpha.GameServerClusterOrBuilder getGameServerClustersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Token to retrieve the next page of results, or empty if there are no more
   * results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3 [deprecated = true];</code>
   *
   * @return A list containing the unreachableLocations.
   */
  @java.lang.Deprecated
  java.util.List<java.lang.String> getUnreachableLocationsList();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3 [deprecated = true];</code>
   *
   * @return The count of unreachableLocations.
   */
  @java.lang.Deprecated
  int getUnreachableLocationsCount();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3 [deprecated = true];</code>
   *
   * @param index The index of the element to return.
   * @return The unreachableLocations at the given index.
   */
  @java.lang.Deprecated
  java.lang.String getUnreachableLocations(int index);
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable_locations = 3 [deprecated = true];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachableLocations at the given index.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getUnreachableLocationsBytes(int index);

  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * List of locations that could not be reached.
   * </pre>
   *
   * <code>repeated string unreachable = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: query_process.proto

package io.grpc.examples.queryprocess;

public interface QpResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:queryprocess.QpResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  int getCode();

  /**
   * <code>.queryprocess.Data data = 2;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <code>.queryprocess.Data data = 2;</code>
   * @return The data.
   */
  Data getData();
  /**
   * <code>.queryprocess.Data data = 2;</code>
   */
  DataOrBuilder getDataOrBuilder();

  /**
   * <code>string msg = 3;</code>
   * @return The msg.
   */
  String getMsg();
  /**
   * <code>string msg = 3;</code>
   * @return The bytes for msg.
   */
  com.google.protobuf.ByteString
      getMsgBytes();
}

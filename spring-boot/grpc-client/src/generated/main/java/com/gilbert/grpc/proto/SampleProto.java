// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package com.gilbert.grpc.proto;

public final class SampleProto {
  private SampleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gilbert_grpc_SampleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gilbert_grpc_SampleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_gilbert_grpc_SampleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_gilbert_grpc_SampleResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014sample.proto\022\020com.gilbert.grpc\"0\n\rSamp" +
      "leRequest\022\016\n\006userId\030\001 \001(\t\022\017\n\007message\030\002 \001" +
      "(\t\"!\n\016SampleResponse\022\017\n\007message\030\001 \001(\t2b\n" +
      "\rSampleService\022Q\n\nSampleCall\022\037.com.gilbe" +
      "rt.grpc.SampleRequest\032 .com.gilbert.grpc" +
      ".SampleResponse\"\000B\'\n\026com.gilbert.grpc.pr" +
      "otoB\013SampleProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_gilbert_grpc_SampleRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_gilbert_grpc_SampleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gilbert_grpc_SampleRequest_descriptor,
        new java.lang.String[] { "UserId", "Message", });
    internal_static_com_gilbert_grpc_SampleResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_gilbert_grpc_SampleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_gilbert_grpc_SampleResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

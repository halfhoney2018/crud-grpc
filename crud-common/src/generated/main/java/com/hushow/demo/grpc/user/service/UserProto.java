// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user_service.proto

package com.hushow.demo.grpc.user.service;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user_service.proto\022 com.example.common" +
      ".grpc.user.dto\032\016user_dto.proto2\342\001\n\004User\022" +
      "o\n\004list\0223.com.example.common.grpc.user.d" +
      "to.SearchUserRequest\032..com.example.commo" +
      "n.grpc.user.dto.UserResponse\"\0000\001\022i\n\003add\022" +
      "0.com.example.common.grpc.user.dto.AddUs" +
      "erRequest\032..com.example.common.grpc.user" +
      ".dto.UserResponse\"\000B0\n!com.hushow.demo.g" +
      "rpc.user.serviceB\tUserProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.example.common.grpc.user.dto.UserDto.getDescriptor(),
        });
    com.example.common.grpc.user.dto.UserDto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
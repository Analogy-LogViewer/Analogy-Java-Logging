package com.Analogy.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Analogy.proto")
public final class AnalogyGrpc {

  private AnalogyGrpc() {}

  public static final String SERVICE_NAME = "greet.Analogy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage,
      com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply> getSubscribeForSendMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeForSendMessages",
      requestType = com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage.class,
      responseType = com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage,
      com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply> getSubscribeForSendMessagesMethod() {
    io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage, com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply> getSubscribeForSendMessagesMethod;
    if ((getSubscribeForSendMessagesMethod = AnalogyGrpc.getSubscribeForSendMessagesMethod) == null) {
      synchronized (AnalogyGrpc.class) {
        if ((getSubscribeForSendMessagesMethod = AnalogyGrpc.getSubscribeForSendMessagesMethod) == null) {
          AnalogyGrpc.getSubscribeForSendMessagesMethod = getSubscribeForSendMessagesMethod = 
              io.grpc.MethodDescriptor.<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage, com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.Analogy", "SubscribeForSendMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalogyMethodDescriptorSupplier("SubscribeForSendMessages"))
                  .build();
          }
        }
     }
     return getSubscribeForSendMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage,
      com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> getSubscribeForConsumeMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubscribeForConsumeMessages",
      requestType = com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage.class,
      responseType = com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage,
      com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> getSubscribeForConsumeMessagesMethod() {
    io.grpc.MethodDescriptor<com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage, com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> getSubscribeForConsumeMessagesMethod;
    if ((getSubscribeForConsumeMessagesMethod = AnalogyGrpc.getSubscribeForConsumeMessagesMethod) == null) {
      synchronized (AnalogyGrpc.class) {
        if ((getSubscribeForConsumeMessagesMethod = AnalogyGrpc.getSubscribeForConsumeMessagesMethod) == null) {
          AnalogyGrpc.getSubscribeForConsumeMessagesMethod = getSubscribeForConsumeMessagesMethod = 
              io.grpc.MethodDescriptor.<com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage, com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "greet.Analogy", "SubscribeForConsumeMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new AnalogyMethodDescriptorSupplier("SubscribeForConsumeMessages"))
                  .build();
          }
        }
     }
     return getSubscribeForConsumeMessagesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnalogyStub newStub(io.grpc.Channel channel) {
    return new AnalogyStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnalogyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AnalogyBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnalogyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AnalogyFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class AnalogyImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> subscribeForSendMessages(
        io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getSubscribeForSendMessagesMethod(), responseObserver);
    }

    /**
     */
    public void subscribeForConsumeMessages(com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage request,
        io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeForConsumeMessagesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubscribeForSendMessagesMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage,
                com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply>(
                  this, METHODID_SUBSCRIBE_FOR_SEND_MESSAGES)))
          .addMethod(
            getSubscribeForConsumeMessagesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage,
                com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage>(
                  this, METHODID_SUBSCRIBE_FOR_CONSUME_MESSAGES)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AnalogyStub extends io.grpc.stub.AbstractStub<AnalogyStub> {
    private AnalogyStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalogyStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalogyStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalogyStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> subscribeForSendMessages(
        io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getSubscribeForSendMessagesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void subscribeForConsumeMessages(com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage request,
        io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSubscribeForConsumeMessagesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AnalogyBlockingStub extends io.grpc.stub.AbstractStub<AnalogyBlockingStub> {
    private AnalogyBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalogyBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalogyBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalogyBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage> subscribeForConsumeMessages(
        com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage request) {
      return blockingServerStreamingCall(
          getChannel(), getSubscribeForConsumeMessagesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class AnalogyFutureStub extends io.grpc.stub.AbstractStub<AnalogyFutureStub> {
    private AnalogyFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AnalogyFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnalogyFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AnalogyFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_SUBSCRIBE_FOR_CONSUME_MESSAGES = 0;
  private static final int METHODID_SUBSCRIBE_FOR_SEND_MESSAGES = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnalogyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnalogyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_FOR_CONSUME_MESSAGES:
          serviceImpl.subscribeForConsumeMessages((com.Analogy.grpc.AnalogyOuterClass.AnalogyConsumerMessage) request,
              (io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyLogMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBSCRIBE_FOR_SEND_MESSAGES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.subscribeForSendMessages(
              (io.grpc.stub.StreamObserver<com.Analogy.grpc.AnalogyOuterClass.AnalogyMessageReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnalogyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnalogyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.Analogy.grpc.AnalogyOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Analogy");
    }
  }

  private static final class AnalogyFileDescriptorSupplier
      extends AnalogyBaseDescriptorSupplier {
    AnalogyFileDescriptorSupplier() {}
  }

  private static final class AnalogyMethodDescriptorSupplier
      extends AnalogyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnalogyMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnalogyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnalogyFileDescriptorSupplier())
              .addMethod(getSubscribeForSendMessagesMethod())
              .addMethod(getSubscribeForConsumeMessagesMethod())
              .build();
        }
      }
    }
    return result;
  }
}

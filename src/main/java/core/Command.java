// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: core/message.proto

package core;

/**
 * Protobuf enum {@code core.Command}
 */
public enum Command
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>JOIN = 0;</code>
   */
  JOIN(0),
  /**
   * <code>LEAVE = 1;</code>
   */
  LEAVE(1),
  /**
   * <code>PING = 2;</code>
   */
  PING(2),
  /**
   * <code>ACK = 3;</code>
   */
  ACK(3),
  /**
   * <code>UPDATE = 4;</code>
   */
  UPDATE(4),
  /**
   * <code>DISPLAY = 5;</code>
   */
  DISPLAY(5),
  /**
   * <code>WELCOME = 6;</code>
   */
  WELCOME(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>JOIN = 0;</code>
   */
  public static final int JOIN_VALUE = 0;
  /**
   * <code>LEAVE = 1;</code>
   */
  public static final int LEAVE_VALUE = 1;
  /**
   * <code>PING = 2;</code>
   */
  public static final int PING_VALUE = 2;
  /**
   * <code>ACK = 3;</code>
   */
  public static final int ACK_VALUE = 3;
  /**
   * <code>UPDATE = 4;</code>
   */
  public static final int UPDATE_VALUE = 4;
  /**
   * <code>DISPLAY = 5;</code>
   */
  public static final int DISPLAY_VALUE = 5;
  /**
   * <code>WELCOME = 6;</code>
   */
  public static final int WELCOME_VALUE = 6;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Command valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Command forNumber(int value) {
    switch (value) {
      case 0: return JOIN;
      case 1: return LEAVE;
      case 2: return PING;
      case 3: return ACK;
      case 4: return UPDATE;
      case 5: return DISPLAY;
      case 6: return WELCOME;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Command>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Command> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Command>() {
          public Command findValueByNumber(int number) {
            return Command.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return core.MessageOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Command[] VALUES = values();

  public static Command valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Command(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:core.Command)
}


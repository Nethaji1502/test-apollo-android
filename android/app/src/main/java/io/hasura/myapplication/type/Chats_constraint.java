package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * unique or primary key constraints on table "chats"
 */
@Generated("Apollo GraphQL")
public enum Chats_constraint {
  /**
   * unique or primary key constraint
   */
  CHATS_PKEY("chats_pkey"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Chats_constraint(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Chats_constraint safeValueOf(String rawValue) {
    for (Chats_constraint enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Chats_constraint.$UNKNOWN;
  }
}

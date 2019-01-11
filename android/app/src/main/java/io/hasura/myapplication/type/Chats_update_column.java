package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * update columns of table "chats"
 */
@Generated("Apollo GraphQL")
public enum Chats_update_column {
  /**
   * column name
   */
  FROM("from"),

  /**
   * column name
   */
  ID("id"),

  /**
   * column name
   */
  MESSAGE("message"),

  /**
   * column name
   */
  POSTID("postid"),

  /**
   * column name
   */
  TO("to"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Chats_update_column(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Chats_update_column safeValueOf(String rawValue) {
    for (Chats_update_column enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Chats_update_column.$UNKNOWN;
  }
}

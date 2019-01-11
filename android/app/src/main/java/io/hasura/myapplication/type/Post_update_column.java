package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * update columns of table "post"
 */
@Generated("Apollo GraphQL")
public enum Post_update_column {
  /**
   * column name
   */
  AUTHOR("author"),

  /**
   * column name
   */
  ID("id"),

  /**
   * column name
   */
  PICS("pics"),

  /**
   * column name
   */
  TITLE("title"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Post_update_column(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Post_update_column safeValueOf(String rawValue) {
    for (Post_update_column enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Post_update_column.$UNKNOWN;
  }
}

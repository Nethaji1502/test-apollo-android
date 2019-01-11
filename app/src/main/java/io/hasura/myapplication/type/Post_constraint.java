package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * unique or primary key constraints on table "post"
 */
@Generated("Apollo GraphQL")
public enum Post_constraint {
  /**
   * unique or primary key constraint
   */
  POST_PKEY("post_pkey"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Post_constraint(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Post_constraint safeValueOf(String rawValue) {
    for (Post_constraint enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Post_constraint.$UNKNOWN;
  }
}

package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * unique or primary key constraints on table "user"
 */
@Generated("Apollo GraphQL")
public enum User_constraint {
  /**
   * unique or primary key constraint
   */
  USER_PKEY("user_pkey"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  User_constraint(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static User_constraint safeValueOf(String rawValue) {
    for (User_constraint enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return User_constraint.$UNKNOWN;
  }
}

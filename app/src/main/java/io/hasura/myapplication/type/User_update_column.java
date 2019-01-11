package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * update columns of table "user"
 */
@Generated("Apollo GraphQL")
public enum User_update_column {
  /**
   * column name
   */
  AGE("age"),

  /**
   * column name
   */
  GENBER("genber"),

  /**
   * column name
   */
  ID("id"),

  /**
   * column name
   */
  NIKENAME("nikename"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  User_update_column(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static User_update_column safeValueOf(String rawValue) {
    for (User_update_column enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return User_update_column.$UNKNOWN;
  }
}

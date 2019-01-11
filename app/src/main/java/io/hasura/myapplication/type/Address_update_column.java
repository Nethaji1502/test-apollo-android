package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * update columns of table "address"
 */
@Generated("Apollo GraphQL")
public enum Address_update_column {
  /**
   * column name
   */
  CITY("city"),

  /**
   * column name
   */
  COUNTY("county"),

  /**
   * column name
   */
  ID("id"),

  /**
   * column name
   */
  STREET("street"),

  /**
   * column name
   */
  USERID("userid"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Address_update_column(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Address_update_column safeValueOf(String rawValue) {
    for (Address_update_column enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Address_update_column.$UNKNOWN;
  }
}

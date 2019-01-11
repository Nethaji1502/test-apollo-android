package io.hasura.myapplication.type;

import javax.annotation.Generated;

/**
 * unique or primary key constraints on table "address"
 */
@Generated("Apollo GraphQL")
public enum Address_constraint {
  /**
   * unique or primary key constraint
   */
  ADDRESS_PKEY("address_pkey"),

  /**
   * Auto generated constant for unknown enum values
   */
  $UNKNOWN("$UNKNOWN");

  private final String rawValue;

  Address_constraint(String rawValue) {
    this.rawValue = rawValue;
  }

  public String rawValue() {
    return rawValue;
  }

  public static Address_constraint safeValueOf(String rawValue) {
    for (Address_constraint enumValue : values()) {
      if (enumValue.rawValue.equals(rawValue)) {
        return enumValue;
      }
    }
    return Address_constraint.$UNKNOWN;
  }
}

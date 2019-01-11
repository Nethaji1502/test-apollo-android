package io.hasura.myapplication.type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;

import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public final class Address_insert_input implements InputType {
  private final Input<String> city;

  private final Input<String> county;

  private final Input<Integer> id;

  private final Input<String> street;

  private final Input<User_obj_rel_insert_input> userByuserid;

  private final Input<Integer> userid;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Address_insert_input(Input<String> city, Input<String> county, Input<Integer> id,
                       Input<String> street, Input<User_obj_rel_insert_input> userByuserid, Input<Integer> userid) {
    this.city = city;
    this.county = county;
    this.id = id;
    this.street = street;
    this.userByuserid = userByuserid;
    this.userid = userid;
  }

  public @Nullable String city() {
    return this.city.value;
  }

  public @Nullable String county() {
    return this.county.value;
  }

  public @Nullable Integer id() {
    return this.id.value;
  }

  public @Nullable String street() {
    return this.street.value;
  }

  public @Nullable
  User_obj_rel_insert_input userByuserid() {
    return this.userByuserid.value;
  }

  public @Nullable Integer userid() {
    return this.userid.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (city.defined) {
          writer.writeString("city", city.value);
        }
        if (county.defined) {
          writer.writeString("county", county.value);
        }
        if (id.defined) {
          writer.writeInt("id", id.value);
        }
        if (street.defined) {
          writer.writeString("street", street.value);
        }
        if (userByuserid.defined) {
          writer.writeObject("userByuserid", userByuserid.value != null ? userByuserid.value.marshaller() : null);
        }
        if (userid.defined) {
          writer.writeInt("userid", userid.value);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= city.hashCode();
      h *= 1000003;
      h ^= county.hashCode();
      h *= 1000003;
      h ^= id.hashCode();
      h *= 1000003;
      h ^= street.hashCode();
      h *= 1000003;
      h ^= userByuserid.hashCode();
      h *= 1000003;
      h ^= userid.hashCode();
      $hashCode = h;
      $hashCodeMemoized = true;
    }
    return $hashCode;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Address_insert_input) {
      Address_insert_input that = (Address_insert_input) o;
      return this.city.equals(that.city)
       && this.county.equals(that.county)
       && this.id.equals(that.id)
       && this.street.equals(that.street)
       && this.userByuserid.equals(that.userByuserid)
       && this.userid.equals(that.userid);
    }
    return false;
  }

  public static final class Builder {
    private Input<String> city = Input.absent();

    private Input<String> county = Input.absent();

    private Input<Integer> id = Input.absent();

    private Input<String> street = Input.absent();

    private Input<User_obj_rel_insert_input> userByuserid = Input.absent();

    private Input<Integer> userid = Input.absent();

    Builder() {
    }

    public Builder city(@Nullable String city) {
      this.city = Input.fromNullable(city);
      return this;
    }

    public Builder county(@Nullable String county) {
      this.county = Input.fromNullable(county);
      return this;
    }

    public Builder id(@Nullable Integer id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public Builder street(@Nullable String street) {
      this.street = Input.fromNullable(street);
      return this;
    }

    public Builder userByuserid(@Nullable User_obj_rel_insert_input userByuserid) {
      this.userByuserid = Input.fromNullable(userByuserid);
      return this;
    }

    public Builder userid(@Nullable Integer userid) {
      this.userid = Input.fromNullable(userid);
      return this;
    }

    public Builder cityInput(@NotNull Input<String> city) {
      this.city = Utils.checkNotNull(city, "city == null");
      return this;
    }

    public Builder countyInput(@NotNull Input<String> county) {
      this.county = Utils.checkNotNull(county, "county == null");
      return this;
    }

    public Builder idInput(@NotNull Input<Integer> id) {
      this.id = Utils.checkNotNull(id, "id == null");
      return this;
    }

    public Builder streetInput(@NotNull Input<String> street) {
      this.street = Utils.checkNotNull(street, "street == null");
      return this;
    }

    public Builder userByuseridInput(@NotNull Input<User_obj_rel_insert_input> userByuserid) {
      this.userByuserid = Utils.checkNotNull(userByuserid, "userByuserid == null");
      return this;
    }

    public Builder useridInput(@NotNull Input<Integer> userid) {
      this.userid = Utils.checkNotNull(userid, "userid == null");
      return this;
    }

    public Address_insert_input build() {
      return new Address_insert_input(city, county, id, street, userByuserid, userid);
    }
  }
}

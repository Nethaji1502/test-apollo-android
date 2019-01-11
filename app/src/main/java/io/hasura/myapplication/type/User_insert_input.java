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
public final class User_insert_input implements InputType {
  private final Input<Address_arr_rel_insert_input> addresssByuserid;

  private final Input<Integer> age;

  private final Input<Chats_arr_rel_insert_input> chatssByfrom;

  private final Input<Chats_arr_rel_insert_input> chatssByto;

  private final Input<String> genber;

  private final Input<Integer> id;

  private final Input<String> nikename;

  private final Input<Post_arr_rel_insert_input> postsByauthor;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  User_insert_input(Input<Address_arr_rel_insert_input> addresssByuserid, Input<Integer> age,
                    Input<Chats_arr_rel_insert_input> chatssByfrom, Input<Chats_arr_rel_insert_input> chatssByto,
                    Input<String> genber, Input<Integer> id, Input<String> nikename,
                    Input<Post_arr_rel_insert_input> postsByauthor) {
    this.addresssByuserid = addresssByuserid;
    this.age = age;
    this.chatssByfrom = chatssByfrom;
    this.chatssByto = chatssByto;
    this.genber = genber;
    this.id = id;
    this.nikename = nikename;
    this.postsByauthor = postsByauthor;
  }

  public @Nullable
  Address_arr_rel_insert_input addresssByuserid() {
    return this.addresssByuserid.value;
  }

  public @Nullable Integer age() {
    return this.age.value;
  }

  public @Nullable
  Chats_arr_rel_insert_input chatssByfrom() {
    return this.chatssByfrom.value;
  }

  public @Nullable
  Chats_arr_rel_insert_input chatssByto() {
    return this.chatssByto.value;
  }

  public @Nullable String genber() {
    return this.genber.value;
  }

  public @Nullable Integer id() {
    return this.id.value;
  }

  public @Nullable String nikename() {
    return this.nikename.value;
  }

  public @Nullable
  Post_arr_rel_insert_input postsByauthor() {
    return this.postsByauthor.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (addresssByuserid.defined) {
          writer.writeObject("addresssByuserid", addresssByuserid.value != null ? addresssByuserid.value.marshaller() : null);
        }
        if (age.defined) {
          writer.writeInt("age", age.value);
        }
        if (chatssByfrom.defined) {
          writer.writeObject("chatssByfrom", chatssByfrom.value != null ? chatssByfrom.value.marshaller() : null);
        }
        if (chatssByto.defined) {
          writer.writeObject("chatssByto", chatssByto.value != null ? chatssByto.value.marshaller() : null);
        }
        if (genber.defined) {
          writer.writeString("genber", genber.value);
        }
        if (id.defined) {
          writer.writeInt("id", id.value);
        }
        if (nikename.defined) {
          writer.writeString("nikename", nikename.value);
        }
        if (postsByauthor.defined) {
          writer.writeObject("postsByauthor", postsByauthor.value != null ? postsByauthor.value.marshaller() : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= addresssByuserid.hashCode();
      h *= 1000003;
      h ^= age.hashCode();
      h *= 1000003;
      h ^= chatssByfrom.hashCode();
      h *= 1000003;
      h ^= chatssByto.hashCode();
      h *= 1000003;
      h ^= genber.hashCode();
      h *= 1000003;
      h ^= id.hashCode();
      h *= 1000003;
      h ^= nikename.hashCode();
      h *= 1000003;
      h ^= postsByauthor.hashCode();
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
    if (o instanceof User_insert_input) {
      User_insert_input that = (User_insert_input) o;
      return this.addresssByuserid.equals(that.addresssByuserid)
       && this.age.equals(that.age)
       && this.chatssByfrom.equals(that.chatssByfrom)
       && this.chatssByto.equals(that.chatssByto)
       && this.genber.equals(that.genber)
       && this.id.equals(that.id)
       && this.nikename.equals(that.nikename)
       && this.postsByauthor.equals(that.postsByauthor);
    }
    return false;
  }

  public static final class Builder {
    private Input<Address_arr_rel_insert_input> addresssByuserid = Input.absent();

    private Input<Integer> age = Input.absent();

    private Input<Chats_arr_rel_insert_input> chatssByfrom = Input.absent();

    private Input<Chats_arr_rel_insert_input> chatssByto = Input.absent();

    private Input<String> genber = Input.absent();

    private Input<Integer> id = Input.absent();

    private Input<String> nikename = Input.absent();

    private Input<Post_arr_rel_insert_input> postsByauthor = Input.absent();

    Builder() {
    }

    public Builder addresssByuserid(@Nullable Address_arr_rel_insert_input addresssByuserid) {
      this.addresssByuserid = Input.fromNullable(addresssByuserid);
      return this;
    }

    public Builder age(@Nullable Integer age) {
      this.age = Input.fromNullable(age);
      return this;
    }

    public Builder chatssByfrom(@Nullable Chats_arr_rel_insert_input chatssByfrom) {
      this.chatssByfrom = Input.fromNullable(chatssByfrom);
      return this;
    }

    public Builder chatssByto(@Nullable Chats_arr_rel_insert_input chatssByto) {
      this.chatssByto = Input.fromNullable(chatssByto);
      return this;
    }

    public Builder genber(@Nullable String genber) {
      this.genber = Input.fromNullable(genber);
      return this;
    }

    public Builder id(@Nullable Integer id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public Builder nikename(@Nullable String nikename) {
      this.nikename = Input.fromNullable(nikename);
      return this;
    }

    public Builder postsByauthor(@Nullable Post_arr_rel_insert_input postsByauthor) {
      this.postsByauthor = Input.fromNullable(postsByauthor);
      return this;
    }

    public Builder addresssByuseridInput(@NotNull Input<Address_arr_rel_insert_input> addresssByuserid) {
      this.addresssByuserid = Utils.checkNotNull(addresssByuserid, "addresssByuserid == null");
      return this;
    }

    public Builder ageInput(@NotNull Input<Integer> age) {
      this.age = Utils.checkNotNull(age, "age == null");
      return this;
    }

    public Builder chatssByfromInput(@NotNull Input<Chats_arr_rel_insert_input> chatssByfrom) {
      this.chatssByfrom = Utils.checkNotNull(chatssByfrom, "chatssByfrom == null");
      return this;
    }

    public Builder chatssBytoInput(@NotNull Input<Chats_arr_rel_insert_input> chatssByto) {
      this.chatssByto = Utils.checkNotNull(chatssByto, "chatssByto == null");
      return this;
    }

    public Builder genberInput(@NotNull Input<String> genber) {
      this.genber = Utils.checkNotNull(genber, "genber == null");
      return this;
    }

    public Builder idInput(@NotNull Input<Integer> id) {
      this.id = Utils.checkNotNull(id, "id == null");
      return this;
    }

    public Builder nikenameInput(@NotNull Input<String> nikename) {
      this.nikename = Utils.checkNotNull(nikename, "nikename == null");
      return this;
    }

    public Builder postsByauthorInput(@NotNull Input<Post_arr_rel_insert_input> postsByauthor) {
      this.postsByauthor = Utils.checkNotNull(postsByauthor, "postsByauthor == null");
      return this;
    }

    public User_insert_input build() {
      return new User_insert_input(addresssByuserid, age, chatssByfrom, chatssByto, genber, id, nikename, postsByauthor);
    }
  }
}

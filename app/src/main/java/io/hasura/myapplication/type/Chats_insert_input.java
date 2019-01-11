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
public final class Chats_insert_input implements InputType {
  private final Input<Integer> from;

  private final Input<Integer> id;

  private final Input<String> message;

  private final Input<Post_obj_rel_insert_input> postBypostid;

  private final Input<Integer> postid;

  private final Input<Integer> to;

  private final Input<User_obj_rel_insert_input> userByfrom;

  private final Input<User_obj_rel_insert_input> userByto;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Chats_insert_input(Input<Integer> from, Input<Integer> id, Input<String> message,
                     Input<Post_obj_rel_insert_input> postBypostid, Input<Integer> postid, Input<Integer> to,
                     Input<User_obj_rel_insert_input> userByfrom, Input<User_obj_rel_insert_input> userByto) {
    this.from = from;
    this.id = id;
    this.message = message;
    this.postBypostid = postBypostid;
    this.postid = postid;
    this.to = to;
    this.userByfrom = userByfrom;
    this.userByto = userByto;
  }

  public @Nullable Integer from() {
    return this.from.value;
  }

  public @Nullable Integer id() {
    return this.id.value;
  }

  public @Nullable String message() {
    return this.message.value;
  }

  public @Nullable
  Post_obj_rel_insert_input postBypostid() {
    return this.postBypostid.value;
  }

  public @Nullable Integer postid() {
    return this.postid.value;
  }

  public @Nullable Integer to() {
    return this.to.value;
  }

  public @Nullable
  User_obj_rel_insert_input userByfrom() {
    return this.userByfrom.value;
  }

  public @Nullable
  User_obj_rel_insert_input userByto() {
    return this.userByto.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (from.defined) {
          writer.writeInt("from", from.value);
        }
        if (id.defined) {
          writer.writeInt("id", id.value);
        }
        if (message.defined) {
          writer.writeString("message", message.value);
        }
        if (postBypostid.defined) {
          writer.writeObject("postBypostid", postBypostid.value != null ? postBypostid.value.marshaller() : null);
        }
        if (postid.defined) {
          writer.writeInt("postid", postid.value);
        }
        if (to.defined) {
          writer.writeInt("to", to.value);
        }
        if (userByfrom.defined) {
          writer.writeObject("userByfrom", userByfrom.value != null ? userByfrom.value.marshaller() : null);
        }
        if (userByto.defined) {
          writer.writeObject("userByto", userByto.value != null ? userByto.value.marshaller() : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= from.hashCode();
      h *= 1000003;
      h ^= id.hashCode();
      h *= 1000003;
      h ^= message.hashCode();
      h *= 1000003;
      h ^= postBypostid.hashCode();
      h *= 1000003;
      h ^= postid.hashCode();
      h *= 1000003;
      h ^= to.hashCode();
      h *= 1000003;
      h ^= userByfrom.hashCode();
      h *= 1000003;
      h ^= userByto.hashCode();
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
    if (o instanceof Chats_insert_input) {
      Chats_insert_input that = (Chats_insert_input) o;
      return this.from.equals(that.from)
       && this.id.equals(that.id)
       && this.message.equals(that.message)
       && this.postBypostid.equals(that.postBypostid)
       && this.postid.equals(that.postid)
       && this.to.equals(that.to)
       && this.userByfrom.equals(that.userByfrom)
       && this.userByto.equals(that.userByto);
    }
    return false;
  }

  public static final class Builder {
    private Input<Integer> from = Input.absent();

    private Input<Integer> id = Input.absent();

    private Input<String> message = Input.absent();

    private Input<Post_obj_rel_insert_input> postBypostid = Input.absent();

    private Input<Integer> postid = Input.absent();

    private Input<Integer> to = Input.absent();

    private Input<User_obj_rel_insert_input> userByfrom = Input.absent();

    private Input<User_obj_rel_insert_input> userByto = Input.absent();

    Builder() {
    }

    public Builder from(@Nullable Integer from) {
      this.from = Input.fromNullable(from);
      return this;
    }

    public Builder id(@Nullable Integer id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public Builder message(@Nullable String message) {
      this.message = Input.fromNullable(message);
      return this;
    }

    public Builder postBypostid(@Nullable Post_obj_rel_insert_input postBypostid) {
      this.postBypostid = Input.fromNullable(postBypostid);
      return this;
    }

    public Builder postid(@Nullable Integer postid) {
      this.postid = Input.fromNullable(postid);
      return this;
    }

    public Builder to(@Nullable Integer to) {
      this.to = Input.fromNullable(to);
      return this;
    }

    public Builder userByfrom(@Nullable User_obj_rel_insert_input userByfrom) {
      this.userByfrom = Input.fromNullable(userByfrom);
      return this;
    }

    public Builder userByto(@Nullable User_obj_rel_insert_input userByto) {
      this.userByto = Input.fromNullable(userByto);
      return this;
    }

    public Builder fromInput(@NotNull Input<Integer> from) {
      this.from = Utils.checkNotNull(from, "from == null");
      return this;
    }

    public Builder idInput(@NotNull Input<Integer> id) {
      this.id = Utils.checkNotNull(id, "id == null");
      return this;
    }

    public Builder messageInput(@NotNull Input<String> message) {
      this.message = Utils.checkNotNull(message, "message == null");
      return this;
    }

    public Builder postBypostidInput(@NotNull Input<Post_obj_rel_insert_input> postBypostid) {
      this.postBypostid = Utils.checkNotNull(postBypostid, "postBypostid == null");
      return this;
    }

    public Builder postidInput(@NotNull Input<Integer> postid) {
      this.postid = Utils.checkNotNull(postid, "postid == null");
      return this;
    }

    public Builder toInput(@NotNull Input<Integer> to) {
      this.to = Utils.checkNotNull(to, "to == null");
      return this;
    }

    public Builder userByfromInput(@NotNull Input<User_obj_rel_insert_input> userByfrom) {
      this.userByfrom = Utils.checkNotNull(userByfrom, "userByfrom == null");
      return this;
    }

    public Builder userBytoInput(@NotNull Input<User_obj_rel_insert_input> userByto) {
      this.userByto = Utils.checkNotNull(userByto, "userByto == null");
      return this;
    }

    public Chats_insert_input build() {
      return new Chats_insert_input(from, id, message, postBypostid, postid, to, userByfrom, userByto);
    }
  }
}

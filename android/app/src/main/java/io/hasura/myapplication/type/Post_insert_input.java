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
public final class Post_insert_input implements InputType {
  private final Input<Integer> author;

  private final Input<Chats_arr_rel_insert_input> chatssBypostid;

  private final Input<Integer> id;

  private final Input<String> pics;

  private final Input<String> title;

  private final Input<User_obj_rel_insert_input> userByauthor;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Post_insert_input(Input<Integer> author, Input<Chats_arr_rel_insert_input> chatssBypostid,
      Input<Integer> id, Input<String> pics, Input<String> title,
      Input<User_obj_rel_insert_input> userByauthor) {
    this.author = author;
    this.chatssBypostid = chatssBypostid;
    this.id = id;
    this.pics = pics;
    this.title = title;
    this.userByauthor = userByauthor;
  }

  public @Nullable Integer author() {
    return this.author.value;
  }

  public @Nullable
  Chats_arr_rel_insert_input chatssBypostid() {
    return this.chatssBypostid.value;
  }

  public @Nullable Integer id() {
    return this.id.value;
  }

  public @Nullable String pics() {
    return this.pics.value;
  }

  public @Nullable String title() {
    return this.title.value;
  }

  public @Nullable
  User_obj_rel_insert_input userByauthor() {
    return this.userByauthor.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        if (author.defined) {
          writer.writeInt("author", author.value);
        }
        if (chatssBypostid.defined) {
          writer.writeObject("chatssBypostid", chatssBypostid.value != null ? chatssBypostid.value.marshaller() : null);
        }
        if (id.defined) {
          writer.writeInt("id", id.value);
        }
        if (pics.defined) {
          writer.writeString("pics", pics.value);
        }
        if (title.defined) {
          writer.writeString("title", title.value);
        }
        if (userByauthor.defined) {
          writer.writeObject("userByauthor", userByauthor.value != null ? userByauthor.value.marshaller() : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= author.hashCode();
      h *= 1000003;
      h ^= chatssBypostid.hashCode();
      h *= 1000003;
      h ^= id.hashCode();
      h *= 1000003;
      h ^= pics.hashCode();
      h *= 1000003;
      h ^= title.hashCode();
      h *= 1000003;
      h ^= userByauthor.hashCode();
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
    if (o instanceof Post_insert_input) {
      Post_insert_input that = (Post_insert_input) o;
      return this.author.equals(that.author)
       && this.chatssBypostid.equals(that.chatssBypostid)
       && this.id.equals(that.id)
       && this.pics.equals(that.pics)
       && this.title.equals(that.title)
       && this.userByauthor.equals(that.userByauthor);
    }
    return false;
  }

  public static final class Builder {
    private Input<Integer> author = Input.absent();

    private Input<Chats_arr_rel_insert_input> chatssBypostid = Input.absent();

    private Input<Integer> id = Input.absent();

    private Input<String> pics = Input.absent();

    private Input<String> title = Input.absent();

    private Input<User_obj_rel_insert_input> userByauthor = Input.absent();

    Builder() {
    }

    public Builder author(@Nullable Integer author) {
      this.author = Input.fromNullable(author);
      return this;
    }

    public Builder chatssBypostid(@Nullable Chats_arr_rel_insert_input chatssBypostid) {
      this.chatssBypostid = Input.fromNullable(chatssBypostid);
      return this;
    }

    public Builder id(@Nullable Integer id) {
      this.id = Input.fromNullable(id);
      return this;
    }

    public Builder pics(@Nullable String pics) {
      this.pics = Input.fromNullable(pics);
      return this;
    }

    public Builder title(@Nullable String title) {
      this.title = Input.fromNullable(title);
      return this;
    }

    public Builder userByauthor(@Nullable User_obj_rel_insert_input userByauthor) {
      this.userByauthor = Input.fromNullable(userByauthor);
      return this;
    }

    public Builder authorInput(@NotNull Input<Integer> author) {
      this.author = Utils.checkNotNull(author, "author == null");
      return this;
    }

    public Builder chatssBypostidInput(@NotNull Input<Chats_arr_rel_insert_input> chatssBypostid) {
      this.chatssBypostid = Utils.checkNotNull(chatssBypostid, "chatssBypostid == null");
      return this;
    }

    public Builder idInput(@NotNull Input<Integer> id) {
      this.id = Utils.checkNotNull(id, "id == null");
      return this;
    }

    public Builder picsInput(@NotNull Input<String> pics) {
      this.pics = Utils.checkNotNull(pics, "pics == null");
      return this;
    }

    public Builder titleInput(@NotNull Input<String> title) {
      this.title = Utils.checkNotNull(title, "title == null");
      return this;
    }

    public Builder userByauthorInput(@NotNull Input<User_obj_rel_insert_input> userByauthor) {
      this.userByauthor = Utils.checkNotNull(userByauthor, "userByauthor == null");
      return this;
    }

    public Post_insert_input build() {
      return new Post_insert_input(author, chatssBypostid, id, pics, title, userByauthor);
    }
  }
}

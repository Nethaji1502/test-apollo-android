package io.hasura.myapplication.type;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.List;

import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public final class Post_arr_rel_insert_input implements InputType {
  private final @NotNull List<Post_insert_input> data;

  private final Input<Post_on_conflict> on_conflict;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Post_arr_rel_insert_input(@NotNull List<Post_insert_input> data,
      Input<Post_on_conflict> on_conflict) {
    this.data = data;
    this.on_conflict = on_conflict;
  }

  public @NotNull List<Post_insert_input> data() {
    return this.data;
  }

  public @Nullable
  Post_on_conflict on_conflict() {
    return this.on_conflict.value;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeList("data", new InputFieldWriter.ListWriter() {
          @Override
          public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
            for (final Post_insert_input $item : data) {
              listItemWriter.writeObject($item != null ? $item.marshaller() : null);
            }
          }
        });
        if (on_conflict.defined) {
          writer.writeObject("on_conflict", on_conflict.value != null ? on_conflict.value.marshaller() : null);
        }
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= data.hashCode();
      h *= 1000003;
      h ^= on_conflict.hashCode();
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
    if (o instanceof Post_arr_rel_insert_input) {
      Post_arr_rel_insert_input that = (Post_arr_rel_insert_input) o;
      return this.data.equals(that.data)
       && this.on_conflict.equals(that.on_conflict);
    }
    return false;
  }

  public static final class Builder {
    private @NotNull List<Post_insert_input> data;

    private Input<Post_on_conflict> on_conflict = Input.absent();

    Builder() {
    }

    public Builder data(@NotNull List<Post_insert_input> data) {
      this.data = data;
      return this;
    }

    public Builder on_conflict(@Nullable Post_on_conflict on_conflict) {
      this.on_conflict = Input.fromNullable(on_conflict);
      return this;
    }

    public Builder on_conflictInput(@NotNull Input<Post_on_conflict> on_conflict) {
      this.on_conflict = Utils.checkNotNull(on_conflict, "on_conflict == null");
      return this;
    }

    public Post_arr_rel_insert_input build() {
      Utils.checkNotNull(data, "data == null");
      return new Post_arr_rel_insert_input(data, on_conflict);
    }
  }
}

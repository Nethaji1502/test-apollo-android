package io.hasura.myapplication.type;

import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.InputType;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.List;

import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public final class Post_on_conflict implements InputType {
  private final @NotNull
  Post_constraint constraint;

  private final @NotNull List<Post_update_column> update_columns;

  private transient volatile int $hashCode;

  private transient volatile boolean $hashCodeMemoized;

  Post_on_conflict(@NotNull Post_constraint constraint,
      @NotNull List<Post_update_column> update_columns) {
    this.constraint = constraint;
    this.update_columns = update_columns;
  }

  public @NotNull
  Post_constraint constraint() {
    return this.constraint;
  }

  public @NotNull List<Post_update_column> update_columns() {
    return this.update_columns;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public InputFieldMarshaller marshaller() {
    return new InputFieldMarshaller() {
      @Override
      public void marshal(InputFieldWriter writer) throws IOException {
        writer.writeString("constraint", constraint.rawValue());
        writer.writeList("update_columns", new InputFieldWriter.ListWriter() {
          @Override
          public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
            for (final Post_update_column $item : update_columns) {
              listItemWriter.writeString($item != null ? $item.rawValue() : null);
            }
          }
        });
      }
    };
  }

  @Override
  public int hashCode() {
    if (!$hashCodeMemoized) {
      int h = 1;
      h *= 1000003;
      h ^= constraint.hashCode();
      h *= 1000003;
      h ^= update_columns.hashCode();
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
    if (o instanceof Post_on_conflict) {
      Post_on_conflict that = (Post_on_conflict) o;
      return this.constraint.equals(that.constraint)
       && this.update_columns.equals(that.update_columns);
    }
    return false;
  }

  public static final class Builder {
    private @NotNull
    Post_constraint constraint;

    private @NotNull List<Post_update_column> update_columns;

    Builder() {
    }

    public Builder constraint(@NotNull Post_constraint constraint) {
      this.constraint = constraint;
      return this;
    }

    public Builder update_columns(@NotNull List<Post_update_column> update_columns) {
      this.update_columns = update_columns;
      return this;
    }

    public Post_on_conflict build() {
      Utils.checkNotNull(constraint, "constraint == null");
      Utils.checkNotNull(update_columns, "update_columns == null");
      return new Post_on_conflict(constraint, update_columns);
    }
  }
}

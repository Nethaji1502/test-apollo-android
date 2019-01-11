package io.hasura.myapplication;

import com.apollographql.apollo.api.Input;
import com.apollographql.apollo.api.InputFieldMarshaller;
import com.apollographql.apollo.api.InputFieldWriter;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.UnmodifiableMapBuilder;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import io.hasura.myapplication.type.User_insert_input;
import io.hasura.myapplication.type.User_on_conflict;

@Generated("Apollo GraphQL")
public final class Insert_userMutation implements Mutation<Insert_userMutation.Data, Insert_userMutation.Data, Insert_userMutation.Variables> {
  public static final String OPERATION_ID = "b8463a9d46054516eceaa5fc66ea6cb5374da6025947f5c74d6672b4cd74492b";

  public static final String QUERY_DOCUMENT = "mutation insert_user($objects: [user_insert_input!]!, $on_conflict: user_on_conflict) {\n"
      + "  insert_user(objects: $objects, on_conflict: $on_conflict) {\n"
      + "    __typename\n"
      + "    affected_rows\n"
      + "    returning {\n"
      + "      __typename\n"
      + "      nikename\n"
      + "      genber\n"
      + "      age\n"
      + "    }\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "insert_user";
    }
  };

  private final Insert_userMutation.Variables variables;

  public Insert_userMutation(@NotNull List<User_insert_input> objects,
      @NotNull Input<User_on_conflict> on_conflict) {
    Utils.checkNotNull(objects, "objects == null");
    Utils.checkNotNull(on_conflict, "on_conflict == null");
    variables = new Insert_userMutation.Variables(objects, on_conflict);
  }

  @Override
  public String operationId() {
    return OPERATION_ID;
  }

  @Override
  public String queryDocument() {
    return QUERY_DOCUMENT;
  }

  @Override
  public Insert_userMutation.Data wrapData(Insert_userMutation.Data data) {
    return data;
  }

  @Override
  public Insert_userMutation.Variables variables() {
    return variables;
  }

  @Override
  public ResponseFieldMapper<Data> responseFieldMapper() {
    return new Data.Mapper();
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public OperationName name() {
    return OPERATION_NAME;
  }

  public static final class Builder {
    private @NotNull List<User_insert_input> objects;

    private Input<User_on_conflict> on_conflict = Input.absent();

    Builder() {
    }

    public Builder objects(@NotNull List<User_insert_input> objects) {
      this.objects = objects;
      return this;
    }

    public Builder on_conflict(@Nullable User_on_conflict on_conflict) {
      this.on_conflict = Input.fromNullable(on_conflict);
      return this;
    }

    public Builder on_conflictInput(@NotNull Input<User_on_conflict> on_conflict) {
      this.on_conflict = Utils.checkNotNull(on_conflict, "on_conflict == null");
      return this;
    }

    public Insert_userMutation build() {
      Utils.checkNotNull(objects, "objects == null");
      return new Insert_userMutation(objects, on_conflict);
    }
  }

  public static final class Variables extends Operation.Variables {
    private final @NotNull List<User_insert_input> objects;

    private final Input<User_on_conflict> on_conflict;

    private final transient Map<String, Object> valueMap = new LinkedHashMap<>();

    Variables(@NotNull List<User_insert_input> objects, Input<User_on_conflict> on_conflict) {
      this.objects = objects;
      this.on_conflict = on_conflict;
      this.valueMap.put("objects", objects);
      if (on_conflict.defined) {
        this.valueMap.put("on_conflict", on_conflict.value);
      }
    }

    public @NotNull List<User_insert_input> objects() {
      return objects;
    }

    public Input<User_on_conflict> on_conflict() {
      return on_conflict;
    }

    @Override
    public Map<String, Object> valueMap() {
      return Collections.unmodifiableMap(valueMap);
    }

    @Override
    public InputFieldMarshaller marshaller() {
      return new InputFieldMarshaller() {
        @Override
        public void marshal(InputFieldWriter writer) throws IOException {
          writer.writeList("objects", new InputFieldWriter.ListWriter() {
            @Override
            public void write(InputFieldWriter.ListItemWriter listItemWriter) throws IOException {
              for (final User_insert_input $item : objects) {
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
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forObject("insert_user", "insert_user", new UnmodifiableMapBuilder<String, Object>(2)
      .put("objects", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "objects")
        .build())
      .put("on_conflict", new UnmodifiableMapBuilder<String, Object>(2)
        .put("kind", "Variable")
        .put("variableName", "on_conflict")
        .build())
      .build(), true, Collections.<ResponseField.Condition>emptyList())
    };

    final @Nullable Insert_user insert_user;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@Nullable Insert_user insert_user) {
      this.insert_user = insert_user;
    }

    /**
     * insert data into the table: "user"
     */
    public @Nullable Insert_user insert_user() {
      return this.insert_user;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeObject($responseFields[0], insert_user != null ? insert_user.marshaller() : null);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "insert_user=" + insert_user
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Data) {
        Data that = (Data) o;
        return ((this.insert_user == null) ? (that.insert_user == null) : this.insert_user.equals(that.insert_user));
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= (insert_user == null) ? 0 : insert_user.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final Insert_user.Mapper insert_userFieldMapper = new Insert_user.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final Insert_user insert_user = reader.readObject($responseFields[0], new ResponseReader.ObjectReader<Insert_user>() {
          @Override
          public Insert_user read(ResponseReader reader) {
            return insert_userFieldMapper.map(reader);
          }
        });
        return new Data(insert_user);
      }
    }
  }

  public static class Insert_user {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forInt("affected_rows", "affected_rows", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forList("returning", "returning", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final int affected_rows;

    final @NotNull List<Returning> returning;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Insert_user(@NotNull String __typename, int affected_rows,
        @NotNull List<Returning> returning) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.affected_rows = affected_rows;
      this.returning = Utils.checkNotNull(returning, "returning == null");
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    /**
     * number of affected rows by the mutation
     */
    public int affected_rows() {
      return this.affected_rows;
    }

    /**
     * data of the affected rows by the mutation
     */
    public @NotNull List<Returning> returning() {
      return this.returning;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeInt($responseFields[1], affected_rows);
          writer.writeList($responseFields[2], returning, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((Returning) item).marshaller());
              }
            }
          });
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Insert_user{"
          + "__typename=" + __typename + ", "
          + "affected_rows=" + affected_rows + ", "
          + "returning=" + returning
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Insert_user) {
        Insert_user that = (Insert_user) o;
        return this.__typename.equals(that.__typename)
         && this.affected_rows == that.affected_rows
         && this.returning.equals(that.returning);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= affected_rows;
        h *= 1000003;
        h ^= returning.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Insert_user> {
      final Returning.Mapper returningFieldMapper = new Returning.Mapper();

      @Override
      public Insert_user map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final int affected_rows = reader.readInt($responseFields[1]);
        final List<Returning> returning = reader.readList($responseFields[2], new ResponseReader.ListReader<Returning>() {
          @Override
          public Returning read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<Returning>() {
              @Override
              public Returning read(ResponseReader reader) {
                return returningFieldMapper.map(reader);
              }
            });
          }
        });
        return new Insert_user(__typename, affected_rows, returning);
      }
    }
  }

  public static class Returning {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("nikename", "nikename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("genber", "genber", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forInt("age", "age", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull String nikename;

    final @NotNull String genber;

    final int age;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Returning(@NotNull String __typename, @NotNull String nikename, @NotNull String genber,
        int age) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.nikename = Utils.checkNotNull(nikename, "nikename == null");
      this.genber = Utils.checkNotNull(genber, "genber == null");
      this.age = age;
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public @NotNull String nikename() {
      return this.nikename;
    }

    public @NotNull String genber() {
      return this.genber;
    }

    public int age() {
      return this.age;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], nikename);
          writer.writeString($responseFields[2], genber);
          writer.writeInt($responseFields[3], age);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Returning{"
          + "__typename=" + __typename + ", "
          + "nikename=" + nikename + ", "
          + "genber=" + genber + ", "
          + "age=" + age
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof Returning) {
        Returning that = (Returning) o;
        return this.__typename.equals(that.__typename)
         && this.nikename.equals(that.nikename)
         && this.genber.equals(that.genber)
         && this.age == that.age;
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= __typename.hashCode();
        h *= 1000003;
        h ^= nikename.hashCode();
        h *= 1000003;
        h ^= genber.hashCode();
        h *= 1000003;
        h ^= age;
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Returning> {
      @Override
      public Returning map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String nikename = reader.readString($responseFields[1]);
        final String genber = reader.readString($responseFields[2]);
        final int age = reader.readInt($responseFields[3]);
        return new Returning(__typename, nikename, genber, age);
      }
    }
  }
}

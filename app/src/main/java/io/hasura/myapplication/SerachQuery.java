package io.hasura.myapplication;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.OperationName;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ResponseReader;
import com.apollographql.apollo.api.ResponseWriter;
import com.apollographql.apollo.api.internal.Utils;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.List;

import javax.annotation.Generated;

@Generated("Apollo GraphQL")
public final class SerachQuery implements Query<SerachQuery.Data, SerachQuery.Data, Operation.Variables> {
  public static final String OPERATION_ID = "19521ac628804c267eebf2bc761a37f05072adf859d2dc930cd6bf43e86728f8";

  public static final String QUERY_DOCUMENT = "query Serach {\n"
      + "  user {\n"
      + "    __typename\n"
      + "    nikename\n"
      + "    genber\n"
      + "    age\n"
      + "    addresssByuserid {\n"
      + "      __typename\n"
      + "      id\n"
      + "      street\n"
      + "      city\n"
      + "      county\n"
      + "    }\n"
      + "  }\n"
      + "}";

  public static final OperationName OPERATION_NAME = new OperationName() {
    @Override
    public String name() {
      return "Serach";
    }
  };

  private final Variables variables;

  public SerachQuery() {
    this.variables = Operation.EMPTY_VARIABLES;
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
  public SerachQuery.Data wrapData(SerachQuery.Data data) {
    return data;
  }

  @Override
  public Variables variables() {
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
    Builder() {
    }

    public SerachQuery build() {
      return new SerachQuery();
    }
  }

  public static class Data implements Operation.Data {
    static final ResponseField[] $responseFields = {
      ResponseField.forList("user", "user", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull List<User> user;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public Data(@NotNull List<User> user) {
      this.user = Utils.checkNotNull(user, "user == null");
    }

    /**
     * fetch data from the table: "user"
     */
    public @NotNull List<User> user() {
      return this.user;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeList($responseFields[0], user, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((User) item).marshaller());
              }
            }
          });
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "Data{"
          + "user=" + user
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
        return this.user.equals(that.user);
      }
      return false;
    }

    @Override
    public int hashCode() {
      if (!$hashCodeMemoized) {
        int h = 1;
        h *= 1000003;
        h ^= user.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<Data> {
      final User.Mapper userFieldMapper = new User.Mapper();

      @Override
      public Data map(ResponseReader reader) {
        final List<User> user = reader.readList($responseFields[0], new ResponseReader.ListReader<User>() {
          @Override
          public User read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<User>() {
              @Override
              public User read(ResponseReader reader) {
                return userFieldMapper.map(reader);
              }
            });
          }
        });
        return new Data(user);
      }
    }
  }

  public static class User {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("nikename", "nikename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("genber", "genber", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forInt("age", "age", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forList("addresssByuserid", "addresssByuserid", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final @NotNull String nikename;

    final @NotNull String genber;

    final int age;

    final @NotNull List<AddresssByuserid> addresssByuserid;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public User(@NotNull String __typename, @NotNull String nikename, @NotNull String genber,
        int age, @NotNull List<AddresssByuserid> addresssByuserid) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.nikename = Utils.checkNotNull(nikename, "nikename == null");
      this.genber = Utils.checkNotNull(genber, "genber == null");
      this.age = age;
      this.addresssByuserid = Utils.checkNotNull(addresssByuserid, "addresssByuserid == null");
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

    /**
     * An array relationship
     */
    public @NotNull List<AddresssByuserid> addresssByuserid() {
      return this.addresssByuserid;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeString($responseFields[1], nikename);
          writer.writeString($responseFields[2], genber);
          writer.writeInt($responseFields[3], age);
          writer.writeList($responseFields[4], addresssByuserid, new ResponseWriter.ListWriter() {
            @Override
            public void write(List items, ResponseWriter.ListItemWriter listItemWriter) {
              for (Object item : items) {
                listItemWriter.writeObject(((AddresssByuserid) item).marshaller());
              }
            }
          });
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "User{"
          + "__typename=" + __typename + ", "
          + "nikename=" + nikename + ", "
          + "genber=" + genber + ", "
          + "age=" + age + ", "
          + "addresssByuserid=" + addresssByuserid
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof User) {
        User that = (User) o;
        return this.__typename.equals(that.__typename)
         && this.nikename.equals(that.nikename)
         && this.genber.equals(that.genber)
         && this.age == that.age
         && this.addresssByuserid.equals(that.addresssByuserid);
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
        h *= 1000003;
        h ^= addresssByuserid.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<User> {
      final AddresssByuserid.Mapper addresssByuseridFieldMapper = new AddresssByuserid.Mapper();

      @Override
      public User map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final String nikename = reader.readString($responseFields[1]);
        final String genber = reader.readString($responseFields[2]);
        final int age = reader.readInt($responseFields[3]);
        final List<AddresssByuserid> addresssByuserid = reader.readList($responseFields[4], new ResponseReader.ListReader<AddresssByuserid>() {
          @Override
          public AddresssByuserid read(ResponseReader.ListItemReader listItemReader) {
            return listItemReader.readObject(new ResponseReader.ObjectReader<AddresssByuserid>() {
              @Override
              public AddresssByuserid read(ResponseReader reader) {
                return addresssByuseridFieldMapper.map(reader);
              }
            });
          }
        });
        return new User(__typename, nikename, genber, age, addresssByuserid);
      }
    }
  }

  public static class AddresssByuserid {
    static final ResponseField[] $responseFields = {
      ResponseField.forString("__typename", "__typename", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forInt("id", "id", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("street", "street", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("city", "city", null, false, Collections.<ResponseField.Condition>emptyList()),
      ResponseField.forString("county", "county", null, false, Collections.<ResponseField.Condition>emptyList())
    };

    final @NotNull String __typename;

    final int id;

    final @NotNull String street;

    final @NotNull String city;

    final @NotNull String county;

    private transient volatile String $toString;

    private transient volatile int $hashCode;

    private transient volatile boolean $hashCodeMemoized;

    public AddresssByuserid(@NotNull String __typename, int id, @NotNull String street,
        @NotNull String city, @NotNull String county) {
      this.__typename = Utils.checkNotNull(__typename, "__typename == null");
      this.id = id;
      this.street = Utils.checkNotNull(street, "street == null");
      this.city = Utils.checkNotNull(city, "city == null");
      this.county = Utils.checkNotNull(county, "county == null");
    }

    public @NotNull String __typename() {
      return this.__typename;
    }

    public int id() {
      return this.id;
    }

    public @NotNull String street() {
      return this.street;
    }

    public @NotNull String city() {
      return this.city;
    }

    public @NotNull String county() {
      return this.county;
    }

    public ResponseFieldMarshaller marshaller() {
      return new ResponseFieldMarshaller() {
        @Override
        public void marshal(ResponseWriter writer) {
          writer.writeString($responseFields[0], __typename);
          writer.writeInt($responseFields[1], id);
          writer.writeString($responseFields[2], street);
          writer.writeString($responseFields[3], city);
          writer.writeString($responseFields[4], county);
        }
      };
    }

    @Override
    public String toString() {
      if ($toString == null) {
        $toString = "AddresssByuserid{"
          + "__typename=" + __typename + ", "
          + "id=" + id + ", "
          + "street=" + street + ", "
          + "city=" + city + ", "
          + "county=" + county
          + "}";
      }
      return $toString;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (o instanceof AddresssByuserid) {
        AddresssByuserid that = (AddresssByuserid) o;
        return this.__typename.equals(that.__typename)
         && this.id == that.id
         && this.street.equals(that.street)
         && this.city.equals(that.city)
         && this.county.equals(that.county);
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
        h ^= id;
        h *= 1000003;
        h ^= street.hashCode();
        h *= 1000003;
        h ^= city.hashCode();
        h *= 1000003;
        h ^= county.hashCode();
        $hashCode = h;
        $hashCodeMemoized = true;
      }
      return $hashCode;
    }

    public static final class Mapper implements ResponseFieldMapper<AddresssByuserid> {
      @Override
      public AddresssByuserid map(ResponseReader reader) {
        final String __typename = reader.readString($responseFields[0]);
        final int id = reader.readInt($responseFields[1]);
        final String street = reader.readString($responseFields[2]);
        final String city = reader.readString($responseFields[3]);
        final String county = reader.readString($responseFields[4]);
        return new AddresssByuserid(__typename, id, street, city, county);
      }
    }
  }
}

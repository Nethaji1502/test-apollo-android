const { ApolloServer } = require('apollo-server');
const { makeExecutableSchema } = require('graphql-tools');

const typeDefs = `
  type User {
    id: Int!
    name: String
  }
  type Query {
    users: [User]
  }

  input UsersInput {
    id: Int!
    name: String!
  }

  type Mutation {
    addUsers(users: [UsersInput]) : [User]
  }
`

let users = [];

const resolvers = {
  Query: {
    users: () => {
      return users
    }
  },
  Mutation: {
    addUsers: (parent, args, context, info) => {
      users = [...users, ...args.users];
      return users
    }
  }
}

const schema = makeExecutableSchema({
  typeDefs,
  resolvers
})

const server = new ApolloServer({
  schema
});

server.listen().then(({url}) => {
  console.log(`Listening at ${url}`);
})
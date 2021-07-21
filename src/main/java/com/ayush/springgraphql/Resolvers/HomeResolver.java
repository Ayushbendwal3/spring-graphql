package com.ayush.springgraphql.Resolvers;

import com.ayush.springgraphql.model.UserRequest;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Service;

@Service
public class HomeResolver implements GraphQLQueryResolver {
    public String hello() {
        return "Hello, World!";
    }

    public String bio(UserRequest userRequest) {
        return String.format("My name is %s, My age is %d and I live in %s",
                userRequest.getName(), userRequest.getAge(), userRequest.getLocation());
    }
}

package com.ayush.springgraphql.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private Long age;
    private String location;
}

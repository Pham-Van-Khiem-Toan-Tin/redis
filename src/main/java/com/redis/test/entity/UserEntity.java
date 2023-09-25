package com.redis.test.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

import static com.redis.test.utils.DocumentConstants.*;

@Document(collection = USER_COLLECTION)
@Getter
@Setter
public class UserEntity {
    @Id
    @Field(ID)
    private String id;
    @Field(USER_NAME)
    private String name;
    @Field(USER_PASSWORD)
    private String password;
}

package com.redis.test.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.redis.test.entity.UserEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpForm {
    
    private String name;
    private String password;
    public static UserEntity toUser(SignUpForm signUpForm) {
        UserEntity newUser = new UserEntity();
        newUser.setId("test");
        newUser.setName(signUpForm.getName());
        newUser.setPassword(signUpForm.getPassword());
        return newUser;
    }
}

package com.redis.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.redis.test.dto.SignUpForm;
import com.redis.test.entity.UserEntity;
import com.redis.test.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;
    public void saveUser(SignUpForm signUpForm) {
        UserEntity newUser = SignUpForm.toUser(signUpForm);
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        userRepository.save(newUser);
    }
}

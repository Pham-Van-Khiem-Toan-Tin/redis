package com.redis.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.redis.test.dto.SignUpForm;
import com.redis.test.service.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/register")
public class AuthenticationController {
    @Autowired
    UserService userService;

    @GetMapping
    public String getRegister() {
        return "signup/signup";
    }

    @ResponseBody
    @PostMapping
    public void register(@RequestBody SignUpForm signUpForm) {
        // TODO: process POST request
        System.out.println(signUpForm.toString());
        userService.saveUser(signUpForm);

    }

}

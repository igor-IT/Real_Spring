package com.example.spring_test.patterns;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMailGen implements GenMail {
    @Override
    public int mailCode() {
        return 2;
    }

    @Override
    public String genMail() {
        return "Welcome client";
    }
}

package com.example.spring_test.patterns;

import org.springframework.stereotype.Component;

@Component
public class CallbackMailGen implements GenMail {
    @Override
    public int mailCode() {
        return 1;
    }

    @Override
    public String genMail() {
        return "Do not call us ";
    }
}

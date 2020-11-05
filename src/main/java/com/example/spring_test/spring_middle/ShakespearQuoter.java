package com.example.spring_test.spring_middle;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Book
public class ShakespearQuoter implements Quoter {
    @Value("${shake}")
    private String message;
    @Override
    public void sayQuote() {
        System.out.println(message);
    }
}

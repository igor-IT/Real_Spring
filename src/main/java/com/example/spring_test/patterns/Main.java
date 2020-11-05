package com.example.spring_test.patterns;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        DistributionService distributionService = new DistributionService();
         new AnnotationConfigApplicationContext(Configuration.class);
    }
}

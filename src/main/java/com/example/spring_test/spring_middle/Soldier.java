package com.example.spring_test.spring_middle;

import lombok.Data;

@Data
public class Soldier {
    public void setAge(String age) {
        System.out.println(age);
    }

    private int age;
}

package com.example.spring_test.patterns;

import org.springframework.stereotype.Repository;

import java.util.Random;
@Repository
public class DBUtils {
   private static Random r = new Random();
    public static int getMailCode() {
        return r.nextInt(2)+1;
    }
}

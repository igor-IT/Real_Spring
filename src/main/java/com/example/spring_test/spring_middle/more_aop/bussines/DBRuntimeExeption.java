package com.example.spring_test.spring_middle.more_aop.bussines;

public class DBRuntimeExeption extends RuntimeException {
    public DBRuntimeExeption(String message) {
        super(message);
    }

    public DBRuntimeExeption(String message, Throwable cause) {
        super(message, cause);
    }
}

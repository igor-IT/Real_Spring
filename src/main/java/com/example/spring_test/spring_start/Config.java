package com.example.spring_test.spring_start;

public interface  Config {
    <T> Class<T> getImplClass(Class<T> type);
}

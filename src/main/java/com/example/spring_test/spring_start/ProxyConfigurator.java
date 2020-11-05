package com.example.spring_test.spring_start;

public interface ProxyConfigurator {
    <T> Object wrapWitchProxy(Object object, Class<T> type);
}

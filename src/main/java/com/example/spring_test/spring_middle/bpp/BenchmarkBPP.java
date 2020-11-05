package com.example.spring_test.spring_middle.bpp;

import com.example.spring_test.spring_start.Benchmark;
import com.example.spring_test.spring_start.BenchmarkProxyConfigurator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.HashMap;
import java.util.Map;

public class BenchmarkBPP implements BeanPostProcessor {
    private Map<String,Class<?>> map = new HashMap<>();
    BenchmarkProxyConfigurator benchmarkProxyConfigurator = new BenchmarkProxyConfigurator();
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean.getClass().isAnnotationPresent(Benchmark.class)){
            map.put(beanName,bean.getClass());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> type = map.get(beanName);
        if (type != null) {
            Object proxy = benchmarkProxyConfigurator.wrapWitchProxy(bean, type);
            return proxy;
        }
        return bean;
    }
}

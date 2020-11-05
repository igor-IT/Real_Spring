package com.example.spring_test.spring_middle.bpp;

import com.example.spring_test.spring_middle.DeprecatedClass;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class DeprecatedClassAnalizerBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @SneakyThrows
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String names: beanDefinitionNames){
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(names);
            Class<?> aClass = Class.forName(beanDefinition.getBeanClassName());
            DeprecatedClass annotation = aClass.getAnnotation(DeprecatedClass.class);
            if (annotation != null){
                Class<?> aClass1 = annotation.newClass();
                beanDefinition.setBeanClassName(aClass.getName());
            }
        }
    }
}

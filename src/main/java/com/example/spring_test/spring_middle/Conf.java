package com.example.spring_test.spring_middle;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class Conf {


//    @Bean
//    public Terminator terminator(){
//        return new Terminator();
//    }

//    @Bean
//    public static PropertySourcesPlaceholderConfigurer configurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}

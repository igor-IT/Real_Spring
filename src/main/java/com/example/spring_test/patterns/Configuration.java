package com.example.spring_test.patterns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@org.springframework.context.annotation.Configuration
@ComponentScan
@EnableScheduling
public class Configuration {
    @Bean
    public Map<Integer,GenMail> map(List<GenMail> generator){
       return generator.stream().collect(Collectors.toMap(GenMail::mailCode, Function.identity()));
    }
}

package com.example.spring_test.spring_middle.Screen_form;

import lombok.SneakyThrows;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan
//@ImportResource("classpath:color.xml")
public class Main {
    Random random = new Random();
    @Bean
    @Scope(value = "twoSeconds",proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color color(){
        return new Color(random.ints(0,255).findAny().getAsInt(),
                random.ints(0,255).findAny().getAsInt(),
                random.ints(0,255).findAny().getAsInt());
    }
    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Main.class);
        while(true){
            annotationConfigApplicationContext.getBean(ColorFrame.class).moveToRandomLocation();
            Thread.sleep(250);
        }
    }
}

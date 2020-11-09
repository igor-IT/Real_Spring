package com.example.spring_test.spring_middle.more_aop;

import com.example.spring_test.spring_middle.more_aop.bussines.SomeService;
import org.springframework.context.annotation.*;

@Configuration
@ImportResource("classpath:aop.xml")
@ComponentScan
@EnableAspectJAutoProxy
public class Conf {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Conf.class);
        SomeService someService = applicationContext.getBean(SomeService.class);
        try {
            someService.work();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}

package com.example.spring_test;

import com.example.spring_test.spring_middle.Conf;
import com.example.spring_test.spring_middle.ShakespearQuoter;
import com.example.spring_test.spring_middle.Terminator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringTestApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Conf.class);
        context1.getBean(ShakespearQuoter.class).sayQuote();
        context1.getBean(Terminator.class).sayQuote();
//        context.getBeansOfType(Quoter.class).values().forEach(Quoter::sayQuote);
        //SpringApplication.run(SpringTestApplication.class, args);
    }

}

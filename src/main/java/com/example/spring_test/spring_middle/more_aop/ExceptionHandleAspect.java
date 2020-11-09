package com.example.spring_test.spring_middle.more_aop;

import com.example.spring_test.spring_middle.more_aop.bussines.DBRuntimeExeption;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Aspect
@PropertySource("classpath:mail.properties")
public class ExceptionHandleAspect {
    @Value("${dba}")
    private String[] mails;

    @AfterThrowing(value = "execution(* com.example.spring_test.spring_middle.more_aop.bussines..*.*(..))",throwing = "exeption")
    public void handleDBException(DBRuntimeExeption exeption){
        System.out.println("Sending mails ........");
    }
}

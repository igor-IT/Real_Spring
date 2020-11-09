package com.example.spring_test.spring_middle.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class QuoterAspect {
    @SneakyThrows
    @Around("@annotation(Secure)")
    public Object doSecure(ProceedingJoinPoint point){
       return point.proceed();
    }

    @Before("execution(* com.example.spring_test.spring_middle..*say*(..))")
    public void handleSayMethods(){
        System.out.println("Что то делает ....");
    }
}

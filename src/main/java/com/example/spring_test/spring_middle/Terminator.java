package com.example.spring_test.spring_middle;

import com.example.spring_test.spring_start.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
@Component
@Film
public class Terminator implements Quoter {
    @InjectRandomInt(min = 1,max = 9)
    private int repeat;

    List<String> messages ;
    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }



    @Value("${terminator}")
    public void setMessage(String message){
        this.messages = Arrays.asList(message.split(" , "));
    }

    @PreDestroy
    public void killAll(){
        System.out.println("You are Terminated");
    }
}

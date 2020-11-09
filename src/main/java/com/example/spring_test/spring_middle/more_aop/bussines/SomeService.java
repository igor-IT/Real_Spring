package com.example.spring_test.spring_middle.more_aop.bussines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {
    @Autowired
    private SomeDao dao;

    public void work(){
        System.out.println("WORKING //////");
        dao.saveData();
    }
}

package com.example.spring_test.spring_middle.more_aop.bussines;

import org.springframework.stereotype.Service;

@Service
public class SomeDaoImp implements SomeDao {
    @Override
    public void saveData() {
        System.out.println("trying to save");
        throw  new DBRuntimeExeption("fire All db");
    }
}

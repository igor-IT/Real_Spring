package com.example.spring_test.spring_middle.db_example;

@RepositoryDB(DbType.ORACLE)
public class SqlDb implements Dao {
    @Override
    public void saveAll() {
        System.out.println("SQL - SAVE");
    }
}

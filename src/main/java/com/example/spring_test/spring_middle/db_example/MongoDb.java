package com.example.spring_test.spring_middle.db_example;

@RepositoryDB(DbType.MONGO)
public class MongoDb implements Dao {
    @Override
    public void saveAll() {
        System.out.println("MONGO DB  - SAVE");
    }
}

package com.example.spring_test.spring_middle.db_example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class DbRepos {
    @RepositoryDB(DbType.MONGO)
    private Dao testDao;
    @RepositoryDB(DbType.ORACLE)
    private Dao prodDao;
    @Scheduled(fixedDelay = 500)
    public void saveDaoTest(){
        testDao.saveAll();
    }
    @Scheduled(fixedDelay = 2000)
    public void saveDaoProd(){
        prodDao.saveAll();
    }
}

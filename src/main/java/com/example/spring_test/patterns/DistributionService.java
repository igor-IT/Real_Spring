package com.example.spring_test.patterns;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class DistributionService {
    @Autowired
    private Map<Integer,GenMail> map;

@Scheduled(fixedDelay = 500)
    public void sendMail(){
       int mailCode = DBUtils.getMailCode();
       GenMail genMail = map.get(mailCode);
       genMail.genMail();
    }
}

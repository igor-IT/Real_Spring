package com.example.spring_test.spring_middle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class TalkingRobotImp implements TalkingRobot {

    @Autowired
    @Book
    List<Quoter> quoters;

    @Override
    public void talk() {
        quoters.forEach(Quoter::sayQuote);
    }
}

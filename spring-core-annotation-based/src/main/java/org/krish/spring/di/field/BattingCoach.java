package org.krish.spring.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("battingCoach")
public class BattingCoach implements Coach {

    @Autowired
    private FortuneService fortuneService;

    public BattingCoach() {
        System.out.println("Inside BattingCoach default constructor!!!");
    }

    @Override
    public String getDailyWorkOut() {
        return "Practice cover-drive!!!";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}

package org.krish.spring.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("battingCoach")
@Scope("singleton")
public class BattingCoach implements Coach {

    @Autowired
    @Qualifier("rfs")
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

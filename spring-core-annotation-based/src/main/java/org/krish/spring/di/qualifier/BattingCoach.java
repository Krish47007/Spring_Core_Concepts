package org.krish.spring.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("battingCoach")
public class BattingCoach implements Coach {

    /*
        //Field injection
    @Autowired
    @Qualifier("rfs")
    private FortuneService fortuneService;*/

    public BattingCoach() {
        System.out.println("Inside BattingCoach default constructor!!!");
    }


    private FortuneService fortuneService;

/*    //Constructor injection
    @Autowired
    public BattingCoach( @Qualifier("rfs") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Autowired
    @Qualifier("rfs")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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

package org.krish.spring.di.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("battingCoach")
public class BattingCoach implements Coach {

    private FortuneService fortuneService;

    public BattingCoach() {
        System.out.println("BattingCoach: Inside default constructor");
    }

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Setter called");
        this.fortuneService = fortuneService;
    }*/

    @Autowired
    public void doMyStuff(FortuneService fortuneService) {
        System.out.println("BattingCoach : doMyStuff called");
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

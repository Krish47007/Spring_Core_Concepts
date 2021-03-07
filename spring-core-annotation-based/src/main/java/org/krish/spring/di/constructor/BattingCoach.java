package org.krish.spring.di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("battingCoach")
public class BattingCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public BattingCoach(FortuneService fortuneService) {
        /*
        As of Spring Framework 4.3, an @Autowired annotation on such a constructor is no longer necessary if the target bean
        only defines one constructor to begin with.
        However, if several constructors are available, at least one must be annotated to teach the container which one to use.
         */
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

package org.krish.spring.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("battingCoach")
//@Scope("singleton")
@Scope("prototype")
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

    @Value("${bCoach.email}")
    private String email;
    @Value("${bCoach.team}")
    private String team;

/*    //Constructor injection
    @Autowired
    public BattingCoach( @Qualifier("rfs") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    @Autowired
    @Qualifier("fbfs")
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
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

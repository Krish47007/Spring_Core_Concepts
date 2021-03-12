package org.krish.spring.bean;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    @Value("${sCoach.email}")
    private String email;
    @Value("${sCoach.team}")
    private String team;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkOut() {
        return "Swim 500m. as warm-up!!";
    }

    public String getDailyFortune()
    {
        return fortuneService.getFortune();
    }
}

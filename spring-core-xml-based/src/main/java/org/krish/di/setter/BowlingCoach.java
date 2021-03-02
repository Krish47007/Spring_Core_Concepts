package org.krish.di.setter;


public class BowlingCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

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

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice 10 overs fast bowling";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

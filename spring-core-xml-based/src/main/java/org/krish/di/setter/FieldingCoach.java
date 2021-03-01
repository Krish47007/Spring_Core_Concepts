package org.krish.di.setter;

public class FieldingCoach implements Coach {

    private FortuneService fortuneService;

    public FieldingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice catching for 30 mins!!!";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune() +" : Just do it Man!!";
    }
}

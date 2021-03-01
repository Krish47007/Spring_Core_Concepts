package org.krish.di.constructor;

public class BattingCoach implements Coach {

    private FortuneService fortuneService;

    public BattingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 2 hours on net practice for batting!!!";
    }

    @Override
    public String getDailyFortune() {

        return fortuneService.getFortune();
    }
}

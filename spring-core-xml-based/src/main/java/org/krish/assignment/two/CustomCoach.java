package org.krish.assignment.two;

public class CustomCoach implements Coach{

    private FortuneService fortuneService;

    public CustomCoach() {
    }
    public CustomCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Repeat Everything!!!";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

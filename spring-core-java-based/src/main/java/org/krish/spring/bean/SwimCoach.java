package org.krish.spring.bean;

public class SwimCoach implements Coach{

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
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

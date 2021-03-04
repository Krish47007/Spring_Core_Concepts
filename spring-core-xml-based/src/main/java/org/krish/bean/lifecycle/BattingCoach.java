package org.krish.bean.lifecycle;

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

    //Custome init-method

    public void startUpStuff()
    {
        System.out.println("---Init of BattingCoach---");
    }

    public void cleanUpStuff()
    {
        System.out.println("---destroy of BattingCoach---");
    }
}

package org.krish.why.ioc.spring;

public class BattingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Spend 2 hours on net practice for batting!!!";
    }
}

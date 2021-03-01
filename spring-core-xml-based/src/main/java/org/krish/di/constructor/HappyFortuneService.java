package org.krish.di.constructor;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your lucky day!!!!";
    }
}

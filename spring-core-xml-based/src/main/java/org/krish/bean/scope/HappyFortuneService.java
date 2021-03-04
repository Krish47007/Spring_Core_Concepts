package org.krish.bean.scope;

public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!!!!";
    }
}

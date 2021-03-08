package org.krish.spring.di.qualifier;

import org.springframework.stereotype.Component;

@Component("rfs")
public class RandomFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        String[] fortunes = {"Today is your lucky day!!!",
                "WTF!!! Go and practice hard!!!",
                "Dont show your face to me anymore"};

        return fortunes[(int)(Math.random() * 10)%3];
    }
}

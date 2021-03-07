package org.krish.spring.di.field;

import org.springframework.stereotype.Component;

@Component("hfs")
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your lucky day!!";
    }
}

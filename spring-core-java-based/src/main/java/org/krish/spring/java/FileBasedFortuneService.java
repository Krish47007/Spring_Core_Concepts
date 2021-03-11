package org.krish.spring.java;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("fbfs")
public class FileBasedFortuneService implements FortuneService{

    @Value("#{ '${fortune.list}'.split(',') }")
    private String[] fortunes;
    @Override
    public String getFortune() {
        return fortunes[(int)(Math.random() * 10)%3];
    }
}

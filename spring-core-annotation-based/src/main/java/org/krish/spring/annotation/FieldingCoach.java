package org.krish.spring.annotation;

import org.springframework.stereotype.Component;

@Component
public class FieldingCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice catching for 30 mins!!!";
    }
}

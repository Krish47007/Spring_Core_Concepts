package org.krish.spring.annotation;

import org.springframework.stereotype.Component;

@Component("battingCoach") //passing Bean Id otherwise its class name with first letter small
//Spring will automatically create and register the bean in Container
public class BattingCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Practice cover-drive!!!";
    }
}

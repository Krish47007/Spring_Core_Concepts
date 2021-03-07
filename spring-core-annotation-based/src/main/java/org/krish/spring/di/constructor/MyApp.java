package org.krish.spring.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("constructor-injection.xml");

        BattingCoach battingCoach = context.getBean("battingCoach",BattingCoach.class);
        System.out.println(battingCoach.getDailyWorkOut());
        System.out.println(battingCoach.getDailyFortune());

    }
}

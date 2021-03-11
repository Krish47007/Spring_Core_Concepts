package org.krish.spring.java;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        //Reading Spring config Java Class
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        BattingCoach battingCoach = context.getBean("battingCoach", BattingCoach.class);

        System.out.println(battingCoach.getDailyWorkOut());
        System.out.println(battingCoach.getDailyFortune());

        if(context != null)
            context.close();

    }
}

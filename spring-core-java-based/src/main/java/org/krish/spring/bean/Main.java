package org.krish.spring.bean;

import config.SwimConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(SwimConfig.class);

        SwimCoach swimCoach = context.getBean("swimCoach",SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkOut());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getEmail()+"\t"+swimCoach.getTeam());
    }
}

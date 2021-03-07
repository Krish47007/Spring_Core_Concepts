package org.krish.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach battingCoach = context.getBean("battingCoach",Coach.class);

        System.out.println(battingCoach.getDailyWorkOut());

        Coach fieldingCoach = context.getBean("fieldingCoach",Coach.class);
        System.out.println(fieldingCoach.getDailyWorkOut());

        if(context !=null)
            context.close();
    }
}

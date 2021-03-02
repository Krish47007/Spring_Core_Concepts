package org.krish.di.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppMain {

    static void performDailyRoutine(Coach coach)
    {
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

    public static void main(String[] args) {

        //Load Spring configuration file
        var context = new ClassPathXmlApplicationContext("setterInjection.xml");

        //Loading the beans created by Spring container and passing to the method
        // We're saying the type is Coach and the beans created by Spring are actual implementations

        Coach battingCoach = context.getBean("battingCoach", Coach.class);
        performDailyRoutine(battingCoach);

        Coach fieldingCoach = context.getBean("fieldingCoach", Coach.class);
        performDailyRoutine(fieldingCoach);

        Coach bowLingCoach = context.getBean("bowlingCoach",Coach.class);
        performDailyRoutine(bowLingCoach);

        BowlingCoach bCoach = (BowlingCoach)bowLingCoach;
        System.out.println(bCoach.getEmail()+"\t"+bCoach.getTeam());

/*
        //Playing around with context
        System.out.println(context.containsBean("battingCoach"));
        System.out.println(context.getBeanDefinitionCount());*/

        //Closing the context
        if(context != null)
            context.close();
    }
}

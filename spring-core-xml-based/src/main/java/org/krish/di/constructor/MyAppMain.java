package org.krish.di.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppMain {

    static void performDailyRoutine(Coach coach)
    {
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

    public static void main(String[] args) {

        //Load Spring configuration file
        var context = new ClassPathXmlApplicationContext("constructorInjection.xml");

        //Loading the beans created by Spring container and passing to the method
        // We're saying the type is Coach and the beans created by Spring are actual implementations

        Coach battingCoach = context.getBean("battingCoach", Coach.class);
        performDailyRoutine(battingCoach);

        Coach fieldingCoach = context.getBean("fieldingCoach", Coach.class);
        performDailyRoutine(fieldingCoach);

/*
        //Playing around with context
        System.out.println(context.containsBean("battingCoach"));
        System.out.println(context.getBeanDefinitionCount());*/

        //Closing the context
        if(context != null)
            context.close();
    }
}

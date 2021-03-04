package org.krish.bean.scope;

import org.krish.di.setter.BowlingCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppMain {

    static void performDailyRoutine(Coach coach)
    {
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

    public static void main(String[] args) {

        //Load Spring configuration file
        var context = new ClassPathXmlApplicationContext("bean-scope.xml");

        Coach c1 = context.getBean("battingCoach",Coach.class);
        Coach c2 = context.getBean("battingCoach",Coach.class);

        System.out.println(c1.equals(c2));

        System.out.println(Integer.toHexString(c1.hashCode()));

        System.out.println(c1);
        System.out.println(c2);

    }
}

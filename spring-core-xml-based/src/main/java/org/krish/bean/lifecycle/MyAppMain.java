package org.krish.bean.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppMain {

    static void performDailyRoutine(Coach coach)
    {
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
    }

    public static void main(String[] args) {

        //Load Spring configuration file
        var context = new ClassPathXmlApplicationContext("bean-lifecycle.xml");

        Coach c1 = context.getBean("battingCoach", Coach.class);

        System.out.println(c1);

        if(context != null)
            context.close();    //Now all the beans will be destroyed



    }
}

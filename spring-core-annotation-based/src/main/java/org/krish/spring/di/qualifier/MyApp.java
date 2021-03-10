package org.krish.spring.di.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("qualifier.xml");

        BattingCoach bc1 = context.getBean("battingCoach", BattingCoach.class);
        /*System.out.println(battingCoach.getEmail()+"\t"+battingCoach.getTeam());
        System.out.println(battingCoach.getDailyWorkOut());
        System.out.println(battingCoach.getDailyFortune());*/

        BattingCoach bc2 = context.getBean("battingCoach", BattingCoach.class);

        System.out.println(bc1.equals(bc2));

    }
}

package org.krish.assignment.two;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AssignmentMain {

    public static void main(String[] args) {

        var context = new ClassPathXmlApplicationContext("assignmentTwo.xml");
        Coach custCoach = context.getBean("custCoach",Coach.class);
        System.out.println(custCoach.getDailyWorkout());
        System.out.println(custCoach.getDailyFortune());
    }
}


package org.krish.why.ioc.spring;

public class MyAppMain {

    static void performDailyRoutine(Coach coach)
    {
        System.out.println(coach.getDailyWorkout());
    }

    public static void main(String[] args) {

        //We can have any type of coach as we're coding to interface.
        //Tightly coupled
        performDailyRoutine(new BattingCoach());
        performDailyRoutine(new FieldingCoach());

        //performDailyRoutine(() -> "Sleep well for 8 hours");


    }
}

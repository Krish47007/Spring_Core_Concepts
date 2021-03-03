package org.krish.assignment.two;

import java.util.Arrays;
import java.util.Random;

public class CustomFortuneServiceImpl  implements  FortuneService{

    @Override
    public String getFortune() {

        String[] fortunes = {"Today is your lucky day!!!",
                            "WTF!!! Go and practice hard!!!",
                            "Dont show your face to me anymore"};

        return fortunes[(int)(Math.random() * 10)%3];

    }
}

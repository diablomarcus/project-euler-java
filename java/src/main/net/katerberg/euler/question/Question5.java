package net.katerberg.euler.question;

import net.katerberg.euler.helper.MultipleHelper;

public class Question5 {

    public static void main(String args[]) {

        MultipleHelper multipleHelper = new MultipleHelper();
        int testVal = 2520;
        while (!multipleHelper.isEvenlyDivisibleBelow(testVal += 2, 20)) {
        }
        System.out.println(testVal);

    }
}

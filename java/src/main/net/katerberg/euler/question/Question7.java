package net.katerberg.euler.question;

import net.katerberg.euler.primes.PrimeHelper;

public class Question7 {

    public static void main(String args[]) {

        long result = new PrimeHelper().findXthPrimeNumber(10001);
        System.out.println(result);

    }

}

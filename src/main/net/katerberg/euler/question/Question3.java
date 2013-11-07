package net.katerberg.euler.question;

import java.util.List;

import net.katerberg.euler.primes.PrimeHelper;

public class Question3 {
    private static PrimeHelper helper;

    public static void main(String args[]) {
        helper = new PrimeHelper();
        System.out.println(findLargestPrimeFactorOf(600851475143L));
    }

    private static Long findLargestPrimeFactorOf(Long bigInteger) {
        List<Long> factors = helper.findPrimeFactors(bigInteger);
        Long result = factors.get(factors.size() - 1);
        return result;
    }
}

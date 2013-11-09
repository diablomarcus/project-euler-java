package net.katerberg.euler.primes;

import net.katerberg.euler.numbers.NumberChecker;

public class Prime {
    private NumberChecker numberChecker;

    public Prime() {
        this.numberChecker = new NumberChecker();
    }

    public Prime(NumberChecker numberChecker) {
        this.numberChecker = numberChecker;
    }

    public long findNextPrime(long previous) {

        do {
            previous++;
        } while (!numberChecker.isPrime(previous));
        return previous;
    }
}

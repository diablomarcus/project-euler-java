package net.katerberg.euler.fibonaccis;

import net.katerberg.euler.numbers.NumberChecker;

public class FibonacciHelper {

    private Fibonacci fibonacci;
    private NumberChecker numberChecker;

    public FibonacciHelper() {
        fibonacci = new Fibonacci();
        numberChecker = new NumberChecker();
    }

    public FibonacciHelper(Fibonacci fibonacci, NumberChecker numberChecker) {
        this.numberChecker = numberChecker;
        this.fibonacci = fibonacci;
    }

    public int sumEvensUpTo(int numberToSumUntil) {
        int result = 0;
        while (fibonacci.findNext() < numberToSumUntil) {
            int current = fibonacci.getCurrent();
            if (numberChecker.isEven(current)) {
                result += current;
            }
        }
        return result;
    }

}

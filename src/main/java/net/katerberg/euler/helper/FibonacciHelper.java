package net.katerberg.euler.helper;

import net.katerberg.euler.items.Fibonacci;

public class FibonacciHelper {

    Fibonacci fibonacci;

    public FibonacciHelper() {
        fibonacci = new Fibonacci();
    }

    public FibonacciHelper(Fibonacci fibonacci) {
        this.fibonacci = fibonacci;
    }

    public int sumEvensUpTo(int numberToSumUntil) {
        int result = 0;
        while (fibonacci.findNext() < numberToSumUntil) {
            int current = fibonacci.getCurrent();
            if (isEven(current)) {
                result += current;
            }
        }
        return result;
    }

    private boolean isEven(int current) {
        return current / 2 * 2 == current;
    }

}

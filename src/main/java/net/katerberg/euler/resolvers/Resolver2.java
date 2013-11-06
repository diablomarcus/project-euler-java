package net.katerberg.euler.resolvers;

import net.katerberg.euler.helper.FibonacciHelper;

public class Resolver2 {
    FibonacciHelper fibonacci;

    public Resolver2(FibonacciHelper fibonacci) {
        this.fibonacci = fibonacci;
    }

    public Integer findSumOfFibonaccisBelow(int numberToLookUntil) {

        return fibonacci.sumEvensUpTo(numberToLookUntil);
    }

}

package net.katerberg.euler.question;

import net.katerberg.euler.fibonaccis.FibonacciHelper;

public class Question2 {

    public static void main(String args[]) {
        FibonacciHelper fibonacci = new FibonacciHelper();

        System.out.println(fibonacci.sumEvensUpTo(4000000));
    }
}

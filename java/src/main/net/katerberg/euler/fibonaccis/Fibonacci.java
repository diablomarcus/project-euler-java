package net.katerberg.euler.fibonaccis;

public class Fibonacci {
    int current;
    int previous;

    public Fibonacci() {
        current = previous = 1;
    }

    public int findNext() {
        int newCurrent = current + previous;
        previous = current;
        current = newCurrent;
        return current;
    }

    public int getCurrent() {

        return current;
    }

}

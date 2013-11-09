package net.katerberg.euler.helper;

import java.util.List;

public class SquareHelper {

    public Long sumOfSquares(List<Integer> listOfNumbers) {
        long sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            Integer numberToSquare = listOfNumbers.get(i);
            sum += (numberToSquare * numberToSquare);
        }
        return sum;
    }

    public Long squareOfSums(List<Integer> listOfNumbers) {
        long sum = 0;
        for (int i = 0; i < listOfNumbers.size(); i++) {
            Integer numberToSquare = listOfNumbers.get(i);
            sum += numberToSquare;
        }
        return sum * sum;
    }

}

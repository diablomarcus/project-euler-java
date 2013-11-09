package net.katerberg.euler.question;

import java.util.List;

import net.katerberg.euler.helper.SquareHelper;
import net.katerberg.euler.numbers.NumberGenerator;

public class Question6 {

    public static void main(String args[]) {

        List<Integer> listOfNumbers = new NumberGenerator().createListOfOneThroughX(100);

        SquareHelper squareHelper = new SquareHelper();
        Long sumOfSquares = squareHelper.sumOfSquares(listOfNumbers);
        Long squareOfSums = squareHelper.squareOfSums(listOfNumbers);

        System.out.println(squareOfSums - sumOfSquares);

    }

}

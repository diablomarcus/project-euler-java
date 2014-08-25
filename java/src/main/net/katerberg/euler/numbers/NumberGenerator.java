package net.katerberg.euler.numbers;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public int largestNumberWithXDigits(int numberOfDigits) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < numberOfDigits; i++) {
            number.append("9");
        }
        return Integer.parseInt(number.toString());
    }

    public List<Integer> createListOfOneThroughX(int maxNumber) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= maxNumber; i++) {
            list.add(i);
        }
        return list;
    }

}

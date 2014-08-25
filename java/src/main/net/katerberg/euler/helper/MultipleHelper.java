package net.katerberg.euler.helper;

import java.util.ArrayList;
import java.util.List;

public class MultipleHelper {

    public List<Integer> findMultiplesBelow(Integer randomMax, Integer valueToCheck) {

        List<Integer> listOfMultiples = new ArrayList<Integer>();
        for (int i = valueToCheck; i < randomMax; i += valueToCheck) {
            listOfMultiples.add(i);
        }

        return listOfMultiples;
    }

    public boolean isEvenlyDivisibleBelow(int numberToCheck, int maxDivisor) {
        for (int i = 2; i <= maxDivisor; i++) {
            if (numberToCheck % i != 0) {
                return false;
            }
        }
        return true;
    }
}

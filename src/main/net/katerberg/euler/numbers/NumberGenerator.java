package net.katerberg.euler.numbers;

public class NumberGenerator {

    public int largestNumberWithXDigits(int numberOfDigits) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < numberOfDigits; i++) {
            number.append("9");
        }
        return Integer.parseInt(number.toString());
    }

}

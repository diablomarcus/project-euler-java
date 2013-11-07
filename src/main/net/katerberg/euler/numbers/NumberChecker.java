package net.katerberg.euler.numbers;

public class NumberChecker {

    public boolean isEven(long numberToCheck) {

        return numberToCheck / 2 * 2 == numberToCheck;
    }

    public boolean isPalindrome(long test) {
        String testString = test + "";
        int lengthOfString = testString.length();
        for (int i = 0; i < lengthOfString / 2; i++) {
            if (testString.charAt(i) != testString.charAt(lengthOfString - 1 - i)) {
                return false;
            }
        }

        return true;
    }

}

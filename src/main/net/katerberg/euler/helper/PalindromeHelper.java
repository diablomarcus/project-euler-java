package net.katerberg.euler.helper;

import net.katerberg.euler.numbers.NumberChecker;
import net.katerberg.euler.numbers.NumberGenerator;

public class PalindromeHelper {

    private NumberGenerator numberGenerator;
    private NumberChecker numberChecker;

    public PalindromeHelper() {
        numberGenerator = new NumberGenerator();
        numberChecker = new NumberChecker();
    }

    public PalindromeHelper(NumberGenerator numberGenerator, NumberChecker numberChecker) {
        this.numberGenerator = numberGenerator;
        this.numberChecker = numberChecker;
    }

    public int largestPalindromeByProductOfXDigitNumbers(int numberOfDigits) {
        int largest = 0;
        int largestMultiple = numberGenerator.largestNumberWithXDigits(numberOfDigits);
        for (int i = largestMultiple; i > 0; i--) {
            for (int j = largestMultiple; j > 0; j--) {
                int testVal = i * j;
                if (numberChecker.isPalindrome(testVal)) {
                    if (testVal > largest) {
                        largest = testVal;
                    }
                }
            }
        }
        return largest;
    }

}

package net.katerberg.euler.helper;

public class PalindromeHelper {

    private NumberGenerator numberGenerator;

    public PalindromeHelper() {
        numberGenerator = new NumberGenerator();
    }

    public PalindromeHelper(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
    }

    public int largestPalindromeByProductOfXDigitNumbers(int numberOfDigits) {
        int largest = 0;
        int largestMultiple = numberGenerator.largestNumberWithXDigits(numberOfDigits);
        for (int i = largestMultiple; i > 0; i--) {
            for (int j = largestMultiple; j > 0; j--) {
                int testVal = i * j;
                if (isPalindrome(testVal)) {
                    if (testVal > largest) {
                        largest = testVal;
                    }
                }
            }
        }
        return largest;
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

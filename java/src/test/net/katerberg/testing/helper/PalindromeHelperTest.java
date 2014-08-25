package net.katerberg.testing.helper;

import junit.framework.Assert;
import net.katerberg.euler.helper.PalindromeHelper;
import net.katerberg.euler.numbers.NumberChecker;
import net.katerberg.euler.numbers.NumberGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PalindromeHelperTest {
    PalindromeHelper testObject;

    @Mock
    NumberGenerator numberGenerator;
    @Mock
    NumberChecker numberChecker;

    @Before
    public void setUp() throws Exception {
        testObject = new PalindromeHelper(numberGenerator, numberChecker);
    }

    @Test
    public void testIntegration() {

        testObject = new PalindromeHelper(new NumberGenerator(), new NumberChecker());

        long result = testObject.largestPalindromeByProductOfXDigitNumbers(2);

        Assert.assertEquals(9009, result);
    }

    @Test
    public void testLargestPalindromeCallsCorrectThings() {

        Integer expected = 19 * 18;
        int numberOfDigits = 7;
        Mockito.when(numberGenerator.largestNumberWithXDigits(numberOfDigits)).thenReturn(20);
        Mockito.when(numberChecker.isPalindrome(expected)).thenReturn(true);

        long result = testObject.largestPalindromeByProductOfXDigitNumbers(numberOfDigits);

        Assert.assertEquals((int) expected, result);
    }

    @Test
    public void testLargestPalindrome_GetsLargest_WhenMultiplePalindromes() {

        Integer expected = 19 * 18;
        int numberOfDigits = 7;
        Mockito.when(numberGenerator.largestNumberWithXDigits(numberOfDigits)).thenReturn(20);
        Mockito.when(numberChecker.isPalindrome(20 * 2)).thenReturn(true);
        Mockito.when(numberChecker.isPalindrome(expected)).thenReturn(true);

        long result = testObject.largestPalindromeByProductOfXDigitNumbers(numberOfDigits);

        Assert.assertEquals((int) expected, result);
    }
}

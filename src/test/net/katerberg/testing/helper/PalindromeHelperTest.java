package net.katerberg.testing.helper;

import junit.framework.Assert;
import net.katerberg.euler.helper.NumberGenerator;
import net.katerberg.euler.helper.PalindromeHelper;

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

    @Before
    public void setUp() throws Exception {
        testObject = new PalindromeHelper(numberGenerator);
    }

    @Test
    public void testOneDigit() {

        Mockito.when(numberGenerator.largestNumberWithXDigits(1)).thenReturn(9);

        long result = testObject.largestPalindromeByProductOfXDigitNumbers(1);

        Assert.assertEquals(9, result);
    }

    @Test
    public void testTwoDigit() {

        Mockito.when(numberGenerator.largestNumberWithXDigits(2)).thenReturn(99);

        long result = testObject.largestPalindromeByProductOfXDigitNumbers(2);

        Assert.assertEquals(9009, result);
    }

    @Test
    public void testIsPalindrome_HandlesVarietyOfCases() {

        Assert.assertEquals(true, testObject.isPalindrome(9L));
        Assert.assertEquals(true, testObject.isPalindrome(90709L));
        Assert.assertEquals(false, testObject.isPalindrome(9008L));
        Assert.assertEquals(true, testObject.isPalindrome(9229L));
        Assert.assertEquals(false, testObject.isPalindrome(9012342109L));

    }
}

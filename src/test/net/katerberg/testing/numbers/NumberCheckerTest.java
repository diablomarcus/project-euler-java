package net.katerberg.testing.numbers;

import junit.framework.Assert;
import net.katerberg.euler.numbers.NumberChecker;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberCheckerTest {
    NumberChecker testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new NumberChecker();
    }

    @Test
    public void testIsEven_WithVarietyOfCases() {

        Assert.assertEquals(false, testObject.isEven(1));
        Assert.assertEquals(true, testObject.isEven(2));
        Assert.assertEquals(true, testObject.isEven(33246823496L));
        Assert.assertEquals(false, testObject.isEven(459234021));

    }

    @Test
    public void testIsPalindrome_HandlesVarietyOfCases() {

        Assert.assertEquals(true, testObject.isPalindrome(9L));
        Assert.assertEquals(true, testObject.isPalindrome(90709L));
        Assert.assertEquals(false, testObject.isPalindrome(9008L));
        Assert.assertEquals(true, testObject.isPalindrome(9229L));
        Assert.assertEquals(false, testObject.isPalindrome(9012342109L));

    }

    @Test
    public void testIsPrime_HandlesVarietyOfCases() {
        Assert.assertEquals(true, testObject.isPrime(2L));
        Assert.assertEquals(false, testObject.isPrime(15L));
        Assert.assertEquals(false, testObject.isPrime(18L));
        Assert.assertEquals(true, testObject.isPrime(17L));
        Assert.assertEquals(false, testObject.isPrime(98L));

    }
}

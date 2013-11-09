package net.katerberg.testing.primes;

import net.katerberg.euler.numbers.NumberChecker;
import net.katerberg.euler.primes.Prime;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PrimeTest {
    Prime testObject;

    @Mock
    NumberChecker numberChecker;

    @Before
    public void setUp() throws Exception {
        testObject = new Prime(numberChecker);
    }

    @Test
    public void testFindNextPrimeDoes_Integration() throws Exception {

        testObject = new Prime(new NumberChecker());
        Assert.assertEquals(19, testObject.findNextPrime(17));
    }

    @Test
    public void testFindNextPrimeHandles_Evens_Integration() throws Exception {

        testObject = new Prime(new NumberChecker());
        Assert.assertEquals(3, testObject.findNextPrime(2));
    }

    @Test
    public void testFindNextPrime_CallsNumberChecker() throws Exception {

        int input = 4;
        int expected = input + 4;

        Mockito.when(numberChecker.isPrime(input + 1)).thenReturn(false);
        Mockito.when(numberChecker.isPrime(input + 2)).thenReturn(false);
        Mockito.when(numberChecker.isPrime(input + 3)).thenReturn(false);
        Mockito.when(numberChecker.isPrime(expected)).thenReturn(true);

        long result = testObject.findNextPrime(input);

        Assert.assertEquals(expected, result);
    }

}

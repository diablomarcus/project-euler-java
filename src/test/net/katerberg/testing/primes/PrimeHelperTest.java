package net.katerberg.testing.primes;

import java.util.List;

import junit.framework.Assert;
import net.katerberg.euler.primes.Prime;
import net.katerberg.euler.primes.PrimeHelper;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PrimeHelperTest {
    PrimeHelper testObject;

    @Mock
    Prime prime;

    @Before
    public void setUp() throws Exception {
        testObject = new PrimeHelper(prime);
    }

    @Test
    public void testFindPrimeFactors_Does() {
        Long input = 13195L;

        List<Long> result = testObject.findPrimeFactors(input);

        Assert.assertEquals(4, result.size());
        Assert.assertEquals((Long) 5L, result.get(0));
        Assert.assertEquals((Long) 7L, result.get(1));
        Assert.assertEquals((Long) 13L, result.get(2));
        Assert.assertEquals((Long) 29L, result.get(3));

    }

    @Test
    public void testFindXthPrimerNumber_Integration() {

        testObject = new PrimeHelper();
        long result = testObject.findXthPrimeNumber(6);

        Assert.assertEquals(13, result);
    }

    @Test
    public void testFindXthPrimerNumber_CallsCorrectThings() {

        long first = 2;
        long second = 42;
        long third = 321;
        Mockito.when(prime.findNextPrime(first)).thenReturn(second);
        Mockito.when(prime.findNextPrime(second)).thenReturn(third);

        long result = testObject.findXthPrimeNumber(3);

        Assert.assertEquals(third, result);
    }
}

package net.katerberg.testing.primes;

import java.util.List;

import junit.framework.Assert;
import net.katerberg.euler.primes.PrimeHelper;

import org.junit.Before;
import org.junit.Test;

public class PrimeHelperTest {
    PrimeHelper testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new PrimeHelper();
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
}

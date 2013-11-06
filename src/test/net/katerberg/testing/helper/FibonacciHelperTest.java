package net.katerberg.testing.helper;

import junit.framework.Assert;
import net.katerberg.euler.helper.FibonacciHelper;
import net.katerberg.euler.items.Fibonacci;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FibonacciHelperTest {
    FibonacciHelper testObject;

    @Mock
    Fibonacci fibonacci;

    @Before
    public void setUp() throws Exception {
        testObject = new FibonacciHelper(fibonacci);
    }

    @Test
    public void testSumEvensUpTo() {
        int numberToSumUntil = 9000;
        int expected = 300;

        Mockito.when(fibonacci.findNext()).thenReturn(97).thenReturn(300).thenReturn(9001);
        Mockito.when(fibonacci.getCurrent()).thenReturn(97).thenReturn(300);

        int result = testObject.sumEvensUpTo(numberToSumUntil);

        Assert.assertEquals(expected, result);
    }
}

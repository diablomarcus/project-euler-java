package net.katerberg.testing.question;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import net.katerberg.euler.helper.FibonacciHelper;
import net.katerberg.euler.resolvers.Resolver2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Resolver2Test {

    private Resolver2 testObject;

    @Mock
    FibonacciHelper fibonacci;

    @Before
    public void setUp() throws Exception {
        testObject = new Resolver2(fibonacci);
    }

    @Test
    public void testExecute_passes_integration() {

        testObject = new Resolver2(new FibonacciHelper());

        Integer result = testObject.findSumOfFibonaccisBelow(90);

        assertEquals((Integer) 44, result);

    }

    @Test
    public void testExecute_calls_correct_things() {

        int firstReturn = 500;

        when(fibonacci.sumEvensUpTo(700)).thenReturn(firstReturn);

        Integer result = testObject.findSumOfFibonaccisBelow(700);

        assertEquals((Integer) firstReturn, result);

    }

}

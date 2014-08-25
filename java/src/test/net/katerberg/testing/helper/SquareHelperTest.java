package net.katerberg.testing.helper;

import java.util.List;

import junit.framework.Assert;
import net.katerberg.euler.helper.SquareHelper;
import net.katerberg.euler.numbers.NumberGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SquareHelperTest {

    private SquareHelper testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new SquareHelper();
    }

    @Test
    public void testSumOfSquares() {

        testObject = new SquareHelper();
        List<Integer> listFromOneToTen = new NumberGenerator().createListOfOneThroughX(10);

        long result = testObject.sumOfSquares(listFromOneToTen);

        Assert.assertEquals(385, result);
    }

    @Test
    public void testSquareOfSums() {

        testObject = new SquareHelper();
        List<Integer> listFromOneToTen = new NumberGenerator().createListOfOneThroughX(10);

        long result = testObject.squareOfSums(listFromOneToTen);

        Assert.assertEquals(3025, result);
    }

}

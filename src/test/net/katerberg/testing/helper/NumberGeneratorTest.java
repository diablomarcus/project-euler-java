package net.katerberg.testing.helper;

import junit.framework.Assert;
import net.katerberg.euler.helper.NumberGenerator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberGeneratorTest {
    NumberGenerator testObject;

    @Before
    public void setUp() throws Exception {
        testObject = new NumberGenerator();
    }

    @Test
    public void testlargestNumberWithXDigits_WithVarietyOfCases() {

        Assert.assertEquals(9, testObject.largestNumberWithXDigits(1));
        Assert.assertEquals(99, testObject.largestNumberWithXDigits(2));
        Assert.assertEquals(999, testObject.largestNumberWithXDigits(3));
        Assert.assertEquals(9999, testObject.largestNumberWithXDigits(4));
        Assert.assertEquals(99999999, testObject.largestNumberWithXDigits(8));

    }
}

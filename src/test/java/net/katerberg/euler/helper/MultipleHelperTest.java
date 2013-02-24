package net.katerberg.euler.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MultipleHelperTest {

	private MultipleHelper testObject;

	@Before
	public void setUp() throws Exception {
		testObject = new MultipleHelper();
	}

	@Test
	public void testFindMultiplesBelow() {

		List<Integer> threes = testObject.findMultiplesBelow(10, 3);

		assertEquals(3, threes.size());
		assertTrue(threes.contains(3));
		assertTrue(threes.contains(6));
		assertTrue(threes.contains(9));

	}

}

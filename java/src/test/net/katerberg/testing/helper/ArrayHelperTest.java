package net.katerberg.testing.helper;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import net.katerberg.euler.helper.ArrayHelper;
import net.katerberg.testing.RandomTest;

import org.junit.Before;
import org.junit.Test;

public class ArrayHelperTest {
	ArrayHelper testObject;

	@Before
	public void setUp() throws Exception {
		testObject = new ArrayHelper();
	}

	@Test
	public void testCombineLists() {

		List<Integer> randomList0 = createRandomIntegerList(20);
		List<Integer> randomList1 = createRandomIntegerList(20);

		List<Integer> combinedLists = testObject.combineLists(randomList0, randomList1);

		for (Integer i : randomList0) {
			assertTrue("Missing " + i + " from randomList0", combinedLists.contains(i));
		}
		for (Integer i : randomList1) {
			assertTrue("Missing " + i + " from randomList1", combinedLists.contains(i));
		}
		for (Integer i : combinedLists) {
			assertTrue("Extra value " + i, randomList0.contains(i) || randomList1.contains(i));
			assertEquals("Duplicate value " + i, combinedLists.indexOf(i), combinedLists.lastIndexOf(i));
		}
	}

	@Test
	public void testSumList() throws Exception {
		List<Integer> randomList = createRandomIntegerList(60);

		Integer expectedSum = 0;
		for (Integer i : randomList) {
			expectedSum += i;
		}

		Integer sum = testObject.sumList(randomList);

		assertEquals(expectedSum, sum);
	}

	private List<Integer> createRandomIntegerList(int numberOfEntries) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i=0; i<numberOfEntries; i++) {
			result.add(RandomTest.getRandomNumber());
		}
		return result;
	}

}

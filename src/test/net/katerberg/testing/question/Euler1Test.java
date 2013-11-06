package net.katerberg.testing.question;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import net.katerberg.euler.helper.ArrayHelper;
import net.katerberg.euler.helper.MultipleHelper;
import net.katerberg.euler.resolvers.Resolver1;
import net.katerberg.testing.RandomTest;

@RunWith(MockitoJUnitRunner.class)
public class Euler1Test {

	private Resolver1 testObject;
	@Mock
	private List<Integer> mock3List;
	@Mock
	private List<Integer> mock5List;
	@Mock
	private List<Integer> mockCombinedList;
	@Mock
	private ArrayHelper mockArrayHelper;
	@Mock
	private MultipleHelper mockMultipleHelper;

	@Before
	public void setUp() throws Exception {
		testObject = new Resolver1(mockArrayHelper, mockMultipleHelper);
	}

	@Test
	public void testExecute_passes_integration() {

		testObject = new Resolver1(new ArrayHelper(), new MultipleHelper()); // Make sure it's a real
													// one.

		Integer finalAnswer = testObject.execute(10);

		assertEquals((Integer) 23, finalAnswer);

	}

	@Test
	public void testExecute_does() {

		Integer randomMax = RandomTest.getRandomNumber();
		Integer expectedAnswer = RandomTest.getRandomNumber();
		
		
		when(mockMultipleHelper.findMultiplesBelow(randomMax, 3)).thenReturn(mock3List);
		when(mockMultipleHelper.findMultiplesBelow(randomMax, 5)).thenReturn(mock5List);
		when(mockArrayHelper.combineLists(mock3List, mock5List)).thenReturn(mockCombinedList);
		when(mockArrayHelper.sumList(mockCombinedList)).thenReturn(expectedAnswer);

		Integer finalAnswer = testObject.execute(randomMax);
		
		assertEquals(expectedAnswer, finalAnswer);

	}
}

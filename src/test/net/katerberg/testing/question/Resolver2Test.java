package net.katerberg.testing.question;

import static org.junit.Assert.assertEquals;
import net.katerberg.euler.resolvers.Resolver2;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Resolver2Test {

	private Resolver2 testObject;

	@Before
	public void setUp() throws Exception {
		testObject = new Resolver2();
	}

	@Test
	public void testExecute_passes_integration() {

		testObject = new Resolver2();

		Integer result = testObject.findSumOfFibonaccisBelow(90);

		assertEquals((Integer) 44, result);

	}

}

package org.effrafax.backgammon.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class FindIndexTest
{
	private int[] data;

	@Before
	public void createData()
	{
		data = new int[] { 1, 1, 0, 0 };
	}

	@Test(expected = IllegalArgumentException.class)
	public void findIndexInShouldFailWithNullArgument()
	{
		FindIndex.in(null);
	}

	@Test
	public void findIndexInShouldProducesAFinder()
	{
		assertNotNull(FindIndex.in(data));
	}

	@Test
	public void shouldFindGreatestIndex()
	{
		assertEqualInts(3, FindIndex.in(data).findGreatestIndexOf(0));
	}

	@Test
	public void shouldFindGreatestIndexWhenRestricted()
	{
		assertEqualInts(2, FindIndex.in(data).withIndicesLessThen(3).findGreatestIndexOf(0));
	}

	@Test
	public void shouldFindGreatestIndexIn()
	{
		assertEqualInts(1, FindIndex.in(data).withIndicesBetween(0, 3).findGreatestIndexOf(1));
	}

	private void assertEqualInts(int expected, int actual)
	{
		assertEquals(Integer.valueOf(expected), Integer.valueOf(actual));
	}
}

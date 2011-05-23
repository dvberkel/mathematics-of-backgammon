package org.effrafax.backgammon.util;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class FindIndexTest
{
	@Test(expected = IllegalArgumentException.class)
	public void findIndexInShouldFailWithNullArgument()
	{
		FindIndex.in(null);
	}

	@Test
	public void findIndexInShouldProducesAFinder()
	{
		assertNotNull(FindIndex.in(new int[] { 1, 1, 0, 0 }));
	}
}

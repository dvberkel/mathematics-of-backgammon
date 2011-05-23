package org.effrafax.backgammon.util;

import org.junit.Test;

public class FindIndexTest
{
	@Test(expected = IllegalArgumentException.class)
	public void findIndexInShouldFailWithNullArgument()
	{
		FindIndex.in(null);
	}
}

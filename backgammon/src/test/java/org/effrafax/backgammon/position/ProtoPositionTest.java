package org.effrafax.backgammon.position;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProtoPositionTest
{
	@Test
	public void canBeConstructed()
	{
		assertNotNull(new ProtoPosition(0, 1, 0, 1));
	}

	@Test
	public void canDetermineNumberOfPoints()
	{
		ProtoPosition protoPosition = new ProtoPosition(0, 1, 0, 1);
		assertTrue(3 == protoPosition.numberOfPoints());
	}

	@Test
	public void canDetermineNumberOfStones()
	{
		ProtoPosition protoPosition = new ProtoPosition(0, 1, 0, 1);
		assertTrue(2 == protoPosition.numberOfStones());
	}
}

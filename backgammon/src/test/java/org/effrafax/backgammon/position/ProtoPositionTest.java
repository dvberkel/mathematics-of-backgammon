package org.effrafax.backgammon.position;

import static org.junit.Assert.assertFalse;
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

	@Test
	public void canDetermineEqualityOfProtoPosition()
	{
		assertTrue(new ProtoPosition(1, 0, 1).equals(new ProtoPosition(1, 0, 1)));
		assertFalse(new ProtoPosition(1, 1, 0).equals(new ProtoPosition(0, 1, 1)));
	}
}

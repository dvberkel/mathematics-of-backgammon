package org.effrafax.backgammon.position;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ProtoPositionIteratorTest
{
	private ProtoPositionIterator protoPositionIterator;

	@Before
	public void createProtoPositionIterator()
	{
		protoPositionIterator = new ProtoPositionIterator(3, 2);
	}

	@Test
	public void canBeConstructed()
	{
		assertNotNull(protoPositionIterator);
	}

	@Test
	public void shouldHaveANextProtoPosition()
	{
		assertTrue(protoPositionIterator.hasNext());
	}

	@Test
	public void shouldReturnEmptyProtoPositionFirst()
	{
		assertEquals(new ProtoPosition(0, 0, 0), protoPositionIterator.next());
	}

	@Test(expected = UnsupportedOperationException.class)
	public void shouldFailWhenRemoveIsCalled()
	{
		protoPositionIterator.remove();
	}
}

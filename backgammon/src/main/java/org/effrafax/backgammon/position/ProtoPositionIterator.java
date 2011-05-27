package org.effrafax.backgammon.position;

import java.util.Iterator;

public class ProtoPositionIterator implements Iterator<ProtoPosition>
{

	public ProtoPositionIterator(int numberOfPoints, int maximumNumberOfStones)
	{
	}

	@Override
	public boolean hasNext()
	{
		return true;
	}

	@Override
	public ProtoPosition next()
	{
		return new ProtoPosition(0, 0, 0);
	}

	@Override
	public void remove()
	{
		throw new UnsupportedOperationException();
	}

}

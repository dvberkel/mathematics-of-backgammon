package org.effrafax.backgammon.position;

import java.util.Arrays;
import java.util.Iterator;

public class ProtoPositionIterator implements Iterator<ProtoPosition>
{

	private final int numberOfPoints;

	private final int maximumNumberOfStones;

	private ProtoPosition protoPosition;

	public ProtoPositionIterator(int numberOfPoints, int maximumNumberOfStones)
	{
		this.numberOfPoints = numberOfPoints;
		this.maximumNumberOfStones = maximumNumberOfStones;
		this.protoPosition = createInitalConfiguration(0);
	}

	private ProtoPosition createInitalConfiguration(int numberOfStones)
	{
		int[] protoPositionDescription = new int[numberOfPoints - 1 + numberOfStones];
		Arrays.fill(protoPositionDescription, 0);
		Arrays.fill(protoPositionDescription, 0, numberOfStones, 1);
		return new ProtoPosition(protoPositionDescription);
	}

	@Override
	public boolean hasNext()
	{
		return protoPosition != null;
	}

	@Override
	public ProtoPosition next()
	{
		ProtoPosition result = protoPosition;
		protoPosition = protoPosition.next();
		if (protoPosition == null && result.numberOfStones() < maximumNumberOfStones)
		{
			protoPosition = createInitalConfiguration(result.numberOfStones() + 1);
		}
		return result;
	}

	@Override
	public void remove()
	{
		throw new UnsupportedOperationException();
	}

}

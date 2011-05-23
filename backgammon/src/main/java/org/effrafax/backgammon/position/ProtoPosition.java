package org.effrafax.backgammon.position;

public class ProtoPosition
{
	private int[] protoPosition;

	public ProtoPosition(int... protoPosition)
	{
		this.protoPosition = protoPosition;
	}

	public int numberOfPoints()
	{
		return countNumberOf(0) + 1;
	}

	private int countNumberOf(int targetElement)
	{
		int count = 0;
		for (int element : protoPosition)
		{
			if (targetElement == element)
			{
				count++;
			}
		}
		return count;
	}

	public int numberOfStones()
	{
		return countNumberOf(1);
	}

}

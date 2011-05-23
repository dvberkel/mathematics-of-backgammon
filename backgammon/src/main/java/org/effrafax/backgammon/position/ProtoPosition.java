package org.effrafax.backgammon.position;

import java.util.Arrays;

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

	@Override
	public int hashCode()
	{
		return Arrays.hashCode(protoPosition);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProtoPosition other = (ProtoPosition) obj;
		if (!Arrays.equals(protoPosition, other.protoPosition))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return String.format("ProtoPosition [%s]", Arrays.toString(protoPosition));
	}

}

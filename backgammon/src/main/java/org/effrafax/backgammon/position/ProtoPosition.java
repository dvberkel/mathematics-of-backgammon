package org.effrafax.backgammon.position;

import java.util.Arrays;

import org.effrafax.backgammon.util.IndexUtil;

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

	public ProtoPosition next()
	{
		int greatestIndexOf1 = IndexUtil.greatestIndexOfLessThenIn(1, protoPosition.length, protoPosition);
		if (0 <= greatestIndexOf1 && greatestIndexOf1 < protoPosition.length - 1)
		{
			int[] copy = Arrays.copyOf(protoPosition, protoPosition.length);
			copy[greatestIndexOf1] = 0;
			copy[greatestIndexOf1 + 1] = 1;
			return new ProtoPosition(copy);
		}
		else if (0 <= greatestIndexOf1)
		{
			int greatesIndexOf0 = IndexUtil.greatestIndexOfLessThenIn(0, greatestIndexOf1, protoPosition);
			if (0 <= greatesIndexOf0)
			{
				int greatestActive1 = IndexUtil.greatestIndexOfLessThenIn(1, greatesIndexOf0, protoPosition);
				if (greatestActive1 >= 0)
				{
					int[] copy = Arrays.copyOf(protoPosition, protoPosition.length);
					copy[greatestActive1] = 0;
					int numberOf1s = greatestIndexOf1 - greatesIndexOf0 + 1;
					for (int index = greatestActive1 + 1; index < protoPosition.length; index++)
					{
						if (numberOf1s > 0)
						{
							copy[index] = 1;
							numberOf1s--;
						}
						else
						{
							copy[index] = 0;
						}
					}
					return new ProtoPosition(copy);
				}
			}
		}
		return null;
	}
}

package org.effrafax.backgammon.util;

public class FindIndex
{
	private final int[] data;

	private final int maximumIndex;

	public static FindIndex in(int[] data)
	{
		if (data == null)
		{
			throw new IllegalArgumentException("data should not be null");
		}

		return new FindIndex(data);
	}

	public FindIndex(int[] data)
	{
		this(data, data.length);
	}

	public FindIndex(int[] data, int maximumIndex)
	{
		this.data = data;
		this.maximumIndex = maximumIndex;
	}

	public int findGreatestIndexOf(int element)
	{
		int index = maximumIndex - 1;
		while (index >= 0 && data[index] != element)
		{
			index--;
		}
		return index;
	}

	public FindIndex withIndicesLessThen(int maximumIndex)
	{
		return new FindIndex(data, maximumIndex);
	}
}

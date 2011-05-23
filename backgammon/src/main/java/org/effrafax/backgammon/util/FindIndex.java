package org.effrafax.backgammon.util;

public class FindIndex
{
	private final int[] data;

	private final int minimumIndex;

	private final int maximumIndex;

	public static FindIndex in(int[] data)
	{
		if (data == null)
		{
			throw new IllegalArgumentException("data should not be null");
		}

		return new FindIndex(data);
	}

	private FindIndex(int[] data)
	{
		this(data, data.length);
	}

	private FindIndex(int[] data, int maximumIndex)
	{
		this(data, -1, maximumIndex);
	}

	private FindIndex(int[] data, int minimumIndex, int maximumIndex)
	{
		this.data = data;
		this.minimumIndex = minimumIndex;
		this.maximumIndex = maximumIndex;
	}

	public int findGreatestIndexOf(int element)
	{
		int index = maximumIndex - 1;
		while (index > minimumIndex && data[index] != element)
		{
			index--;
		}
		return index;
	}

	public FindIndex withIndicesLessThen(int maximumIndex)
	{
		return new FindIndex(data, maximumIndex);
	}

	public FindIndex withIndicesBetween(int minimumIndex, int maximumIndex)
	{
		return new FindIndex(data, minimumIndex, maximumIndex);
	}
}

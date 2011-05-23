package org.effrafax.backgammon.util;

public class FindIndex
{
	private final int[] data;

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
		this.data = data;
	}

	public int findGreatestIndexOf(int element)
	{
		int index = data.length - 1;
		while (index >= 0 && data[index] != element)
		{
			index--;
		}
		return index;
	}
}

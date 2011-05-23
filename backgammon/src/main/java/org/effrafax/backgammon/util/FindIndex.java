package org.effrafax.backgammon.util;

public class FindIndex
{
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
		// TODO Auto-generated constructor stub
	}
}

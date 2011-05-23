package org.effrafax.backgammon.util;

public class IndexUtil
{
	public static int greatestIndexOfLessThenIn(int element, int index, int[] elements)
	{
		int result = index - 1;
		while (result >= 0 && elements[result] != element)
		{
			result--;
		}
		return result;
	}
}

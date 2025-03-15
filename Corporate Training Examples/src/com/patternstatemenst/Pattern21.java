package com.patternstatemenst;

public class Pattern21 {
	public static void main(String args[])
	{
		int alpha = 65;
		int rows = 5;
		for (int m = 1; m <= rows; m++)
		{
			for (int n = 1; n <= m; n++)
			{
				System.out.print((char) (alpha) + " ");
				alpha++;
			}
			System.out.println();
		}
	}
}

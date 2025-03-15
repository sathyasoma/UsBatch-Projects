package com.patternstatemenst;

public class Pattern10 {
	public static void main(String args[])
	{
		int alpha = 65;
		int rows = 5;
		for (int m = rows; m >= 1; m--)
		{
			for (int n = 1; n <= m; n++)
			{
				System.out.print(" ");
			}
			for (int p = m; p <= 5; p++)
			{
				System.out.print((char) (alpha + p - 1) + " ");
			}
			System.out.println();
		}
	}
}

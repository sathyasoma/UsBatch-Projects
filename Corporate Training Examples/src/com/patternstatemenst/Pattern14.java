package com.patternstatemenst;

public class Pattern14 {
	public static void main(String args[])
	{
		int r = 5;
		for (int m = r; m >= 1; m--)
		{
			for (int n = 1; n <= m; n++)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}

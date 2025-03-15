package com.patternstatemenst;

public class Pattern23 {
	public static void main(String args[])
	{
		int alpha = 65;
		int r = 5;
		for (int m = 1; m <= r; m++) 
		{ 
			for (int n = r; n > m; n--)
			{
				System.out.print(" ");
			}
			int temp = 1;
			for (int p = 1; p <= m; p++)
			{
				System.out.print((char) (alpha - 1 + temp) + " ");
				temp = temp * (m - p) / (p);
			}
			System.out.println();
		}
	}
}

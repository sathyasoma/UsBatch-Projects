package com.patternstatemenst;

public class Pattern13 {
	public static void main(String[] args)
	{
		int alpha = 65;
		int r = 5;
		for (int m = 1; m <= r; m++) 
                { 
                        for (int n = r; n > m; n--)
			{
				System.out.print(" ");
			}
			for (int p = 1; p <= m; p++)
			{
				System.out.print((char) (alpha + m - 1) + " ");
			}
			System.out.println();
		}
	}
}

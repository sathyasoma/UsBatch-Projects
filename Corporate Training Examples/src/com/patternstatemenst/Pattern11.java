package com.patternstatemenst;

public class Pattern11 {
	public static void main(String args[])
	{
		int r = 5;
		for (int m = 1; m <= r; m++) 
                { 
                        for (int n = r; n > m; n--)
			{
				System.out.print(" ");
			}
			for (int p = 1; p <= (m * 2) - 1; p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package com.patternstatemenst;

public class Pattern7 {
	public static void main(String args[])
	{
		int rows = 5;
		for (int m = 1; m <= rows; m++) 
                { 
                      for (int n = rows; n > m; n--)
			{
				System.out.print(" ");
			}
			for (int p = 1; p <= m; p++)
			{
				System.out.print(p + " ");
			}
			System.out.println();
		}
	}
}

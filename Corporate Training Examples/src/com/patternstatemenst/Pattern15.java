package com.patternstatemenst;

public class Pattern15 {
	public static void main(String args[])
	{
		int r = 5;
		for (int m = 1; m <= r; m++) 
                {
                        for (int n = r; n >= m; n--)
			{
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}

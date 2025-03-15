package com.patternstatemenst;

public class Pattern26 {
	public static void main(String args[])
	{
		int r = 5;
		for (int m = 1; m <= r; m++)
		{
			for (int i = 1; i <= m; i++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		for (int m = 1; m <= r - 1; m++) 
        {
            for (int i = r - 1; i >= m; i--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

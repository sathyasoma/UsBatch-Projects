package com.patternstatemenst;

public class Pattern3 {
	public static void main(String args[])
    {
	int r = 5;
        for (int m = 1; m <= r; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

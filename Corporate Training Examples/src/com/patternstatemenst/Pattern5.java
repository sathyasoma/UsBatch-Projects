package com.patternstatemenst;

public class Pattern5 {
	public static void main(String args[])
    {
	int alpha = 65;
	int r = 5;
        for (int m = 1; m <= r; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                System.out.print((char)(alpha + m -1) + " ");
            }
            System.out.println();
        }
    }
}

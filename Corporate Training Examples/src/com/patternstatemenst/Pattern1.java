package com.patternstatemenst;

public class Pattern1 {
	public static void main(String args[])
    {
		
		int r = 5;
        for (int m = 1; m <= r; m++)//m<=r -->6<=5
        {
            for (int n = 1; n <= m; n++)//6<=5
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
//1
//1  2
//1  2  3
//1 2 3 4
//1 2 3 4 5
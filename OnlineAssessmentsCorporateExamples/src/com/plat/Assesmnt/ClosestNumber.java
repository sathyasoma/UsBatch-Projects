package com.plat.Assesmnt;

import java.util.Scanner;
//Find the number closest to n and divisible by m

/*Given two integers n and m. The problem is to find the number closest to n and divisible by m. 
 * If there are more than one such number,
then output the one having maximum absolute value. 
If n is completely divisible by m, then output n only.
 * 
 * */
class ClosestNumber {
// function to find the number closest to n
// and divisible by m
	static int closestNumber(int n, int m) {
// find the quotient
		int q = n / m;
// 1st possible closest number
		int n1 = m * q;
// 2nd possible closest number
		int n2 = (n * m) > 0 ? (m * (q + 1)) : (m * (q - 1));
// if true, then n1 is the required closest number
		if (Math.abs(n - n1) < Math.abs(n - n2))
			return n1;

// else n2 is the required closest number
		return n2;
	}

// Driver program to test above
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(closestNumber(n, m));
	}
}

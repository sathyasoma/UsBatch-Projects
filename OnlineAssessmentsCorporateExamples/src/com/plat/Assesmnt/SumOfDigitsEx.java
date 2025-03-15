package com.plat.Assesmnt;

import java.util.Scanner;

/*find the sum of the digits in a number until its sum is equal to single digit. 
 * Consider the below example for better understand*/

class SumOfDigitsEx {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		if (n % 9 == 0)
			System.out.println(9);
		System.out.println(n % 9);
	}
}
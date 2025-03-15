package com.plat.Assesmnt;

import java.util.Scanner;

/*Write a function which returns an integer based on some conditions. You were given with two integers as input say n and m
if n>m return (n*m)-(n-m)
if n<=m return (m%n)-(m+n)*/

class IntegereEx {
	public static void main(String[] args) {
		Scanner prep = new Scanner(System.in);
		int n, m;
		n = prep.nextInt();
		m = prep.nextInt();
		System.out.println(solve(n, m));
	}

	public static int solve(int n, int m) {
		if (n > m)
			return (n * m) - (n - m);
		else
			return (m % n) - (m + n);
	}
}

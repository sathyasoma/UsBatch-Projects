package com.plat.Assesmnt;
/*
 * In English alphabet a,e,i,o,u are called as vowels. 
 * Write a function to return the most frequent vowel used in the given input string.
*/

import java.util.Scanner;

class VowelsEx {
	public static void main(String[] Args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		System.out.println(solve(str));
	}

	static char solve(String str) {
		String v = "aeiou";
		int[] count = { 0, 0, 0, 0, 0 };
		for (int i = 0; i < v.length(); i++) {
			if (v.charAt(i) == 'a')
				count[0]++;
			else if (v.charAt(i) == 'e')
				count[1]++;
			else if (v.charAt(i) == 'i')
				count[2]++;
			else if (v.charAt(i) == 'o')
				count[3]++;
			else if (v.charAt(i) == 'u')
				count[4]++;
		}
		int largest = 0;
		for (int i = 1; i < count.length; i++) {
			if (count[i] > count[largest])
				largest = i;
		}
		return v.charAt(largest);
	}
}
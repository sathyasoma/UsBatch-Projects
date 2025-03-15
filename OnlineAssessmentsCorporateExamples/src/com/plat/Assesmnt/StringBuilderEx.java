package com.plat.Assesmnt;

import java.util.Scanner;

/*Write a function which accepts a string str, implement the function to find and return 
 * the minimum characters required to append at the end
of str to make it a palindrome
Assumptions – 
The string will only contain lowercase English Alphabets
Note – 
If string is already a palindrome then return NULL
You have to find the minimum characters required to append at the end of the string to make it a palindrome*/

public class StringBuilderEx {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			StringBuilder sb = new StringBuilder(sc.nextLine());
			StringBuilder s = new StringBuilder();
			Boolean finish = true;
			while (finish) {
				if (isPalindrome(sb)) {
					System.out.println("NULL");
					finish = false;
				} else {
					s.append(sb.charAt(0));
					sb = new StringBuilder(sb.substring(1));
				}
			}
			System.out.println(s.reverse());
		}
	}

	public static Boolean isPalindrome(StringBuilder sb) {
		int l = sb.length() / 2;
		int m = sb.length() - 1;
		for (int i = 0; i <= l; i++) {
			if (!(sb.charAt(i) == sb.charAt(m - i)))
				return false;
		}
		return true;
	}
}

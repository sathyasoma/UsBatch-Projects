package com.plat.Assesmnt;

import java.util.Scanner;

/*Make a function which accepts a string as an argument that may contain repetitive characters. 
 * Implement the function to modify and return
the input string, such that each character once, along with the count of consecutive occurrence. 
Do not append count if the character
occurs only once.
Note – 
The string will only contain lowercase English Alphabets
If you have to manipulate the input string in place you cant use another strin*/

public class StringBuferEx {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			StringBuilder sb = new StringBuilder(sc.nextLine());
			int count = 1;
			char current = sb.charAt(0), next;
			for (int i = 1; i < sb.length(); i++) {
				next = sb.charAt(i);
				if (next == current) {
					sb.deleteCharAt(i);
					i = i - 1;
					count++;
				} else {
					sb.insert(i, count);
					count = 1;

					current = next;
					i = i + 1;
				}
			}
			sb.append(count);
			System.out.println(sb);
		}
	}
}

package com.string;
import java.util.Arrays;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
//write a java program to create to string values by using scanner concate it and arrange in alphabitical order.
public class StringtoAlphaChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first String value");
		String fname = sc.next();
		System.out.println("enter second String value");
		String sname = sc.next();

		String result = fname + sname;

		int k = result.length();

		int i, j;
		char c;
		char arr[] = result.toCharArray();
		for (i = 0; i < k; i++) {//9
			for (j = (i + 1); j < k; j++) {//1 1<9
				if (arr[j] < arr[i]) {//arr[1]<arr[0]
					c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}

		System.out.println("sorted String is ");
		for (i = 0; i < k; i++)
			System.out.print(arr[i]);
	}
}

package com.loopingstatements;

import java.util.Scanner;

//Write a program to convert Hexadecimal to Decimal number system
public class Hexa_Decimal20 {
	public static void main(String[] args) 
	{ 
 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Hexadecimal Number : ");
		String hex = input.nextLine(); 
		System.out.println("Hexadecimal Number :"+hex); 
		System.out.println("Decimal Number :"+hexa_to_decimal(hex)); 
	} 
	static int hexa_to_decimal(String hex_num) 
	{ 
		int len = hex_num.length(); 
		int base = 1; 
		int dec_val = 0; 
 
		for (int i = len - 1; i >= 0; i--) {
			if (hex_num.charAt(i) >= '0'
				&& hex_num.charAt(i) <= '9') { 
				dec_val += (hex_num.charAt(i) - 48) * base;
				base = base * 16; 
			} 
			else if (hex_num.charAt(i) >= 'A'
					&& hex_num.charAt(i) <= 'F') { 
				dec_val += (hex_num.charAt(i) - 55) * base; 
				base = base * 16; 
			} 
		} 
		return dec_val; 
	}
}

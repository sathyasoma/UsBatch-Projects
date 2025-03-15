package com.conditionalstatements;

import java.util.Scanner;

//Write a program to calculate profit or loss

public class Profit_Loss18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Cost Price :");
		int cp = input.nextInt();
		System.out.println("Enter The Selling Price :");
		int sp = input.nextInt();
		int p, l;
		if (sp > cp) {
			p = sp - cp;
			System.out.println("Profit : " + p);
		} else if (sp < cp) {
			l = cp - sp;
			System.out.println("Loss : " + l);
		} else {
			System.out.println("No Profit No Loss");
		}
	}
}

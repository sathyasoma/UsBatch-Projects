package com.controls;

public class Pattern1 {

	public static void main(String[] args) {
		int alpha=65;
      int rows=5;		
		for (int i = 1; i <= rows; i++) { // i=1
			for (int j =1 ; j <= i; j++) { //j=0
				System.out.print((char)(alpha+i-1)+" "); //65
			}
			System.out.println();
		}
	}
}

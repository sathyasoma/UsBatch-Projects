package com.exceptions;

public class Demo2 {
	public static void main(String[] args) {

		try {
			int c = 23 / 4;
			try {
				System.out.println("division");
				int b = 90 / 10;
			} catch (ArithmeticException ae) {
				System.out.println("dont enter denominator as zero");
			}

			try {
				int a[] = new int[9];
				a[5] = 78;
			} catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println("indes is out of bound ");
			} finally {
				System.out.println("always executed");
			}
			System.out.println("remaining try state,ent");
		} catch (Exception ae) {
			System.out.println("error handled");
		}
		System.out.println("normal Excution");
	}
}

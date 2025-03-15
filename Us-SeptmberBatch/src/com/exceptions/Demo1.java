package com.exceptions;

public class Demo1 {

	public static void main(String[] args) {

		try {
			int age[] = new int[6];
			   age[4] = 90;//arr
			int fnum = 89;
			int snum = 10;
			int result = fnum / snum;//arith
		} catch (ArithmeticException e) {
			System.out.println("dont eneter denominator as zero");
		} catch (NullPointerException e) {
			System.out.println("cant find length of the null values");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("index is out of bound");
		} finally {
			System.out.println("alwys executed");
		}

		System.out.println("remaing 1000 lines of code");

	}

}

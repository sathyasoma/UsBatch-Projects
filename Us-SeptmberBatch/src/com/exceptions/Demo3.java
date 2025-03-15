package com.exceptions;

public class Demo3 {

	public static void main(String[] args) {

		try {
			int marks[] = new int[6];
			marks[5] = 89 / 10;
			String s = "456"; //"123"
			int x = Integer.parseInt(s);
			System.out.println(s.length());			
			System.out.println("no error :" + s + " " + x);
		} 
		catch (ArithmeticException e) {
			System.out.println("dont enter denominator as zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ARRAY IS OUT OF BOUND");
		} catch (NumberFormatException e) {
			System.out.println("cant convert string to number");
		} catch (NullPointerException e) {
			System.out.println("cant find length of the null values");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("string is out of of bound");
		} 
		catch (Exception e) {
			System.out.println("exception handled by parent");
		} 
		finally {
			System.out.println("always executed");
		}
		System.out.println("remaing 1000 lines of code");
	}
}

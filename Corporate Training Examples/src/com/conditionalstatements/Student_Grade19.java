package com.conditionalstatements;

import java.util.Scanner;

/*
 * Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:

Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 * */
public class Student_Grade19 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Five Subject Marks :");
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		int m3 = input.nextInt();
		int m4 = input.nextInt();
		int m5 = input.nextInt();
		int tot = m1 + m2 + m3 + m4 + m5;
		float per = tot / 5;
		System.out.println("Total :" + tot);
		System.out.println("Percentage :" + per);
		if (per >= 90)
			System.out.println("Grade A");
		else if (per >= 80)
			System.out.println("Grade B");
		else if (per >= 70)
			System.out.println("Grade C");
		else if (per >= 60)
			System.out.println("Grade D");
		else if (per >= 40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}

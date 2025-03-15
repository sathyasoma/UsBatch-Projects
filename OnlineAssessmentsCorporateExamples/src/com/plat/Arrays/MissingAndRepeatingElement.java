package com.plat.Arrays;

import java.util.Arrays;
/* Given a read-only array arr of size s, such that each element of the array can not exceed the value s. 
 * Also, in the array, each element occurs only once except a1, which is occurring twice, and therefore, 
 * a2 is missing. Find out the value of a1 and a2. Note that read-only means any modification in the input 
 * array is not allowed.*/
public class MissingAndRepeatingElement {

	void findEle(int a[], int s) {

		// finding sum of n natural numbers (n * (n + 1)) / 2
		long nsum = (s * (s + 1)) / 2;

		// finding sum of square of n natural numbers (n * (n + 1) * (2 * n + 1)) / 6
		long nsqrsum = (nsum * (2 * s + 1)) / 3;

		long sqrsum = 0, sum = 0;

		for (int i = 0; i < s; i++) {
			// find sum of elements present in the array
			sum = sum + a[i];

			// finding sum of square of elements presenet in the array
			sqrsum = sqrsum + ((long) a[i] * a[i]);
		}

		// finding a1^2 - a2^2
		long sqrdiff = sqrsum - nsqrsum;

		// finding a1 - a2
		long diff = sum - nsum;

		// finding a1 + a2 using mathematical identity
		// a1^2 - a2^2 = (a1 + a2)(a1 - a2)
		sum = sqrdiff / diff;

		// finding a1 using a1 + a2 and a1 - a2
		long a1 = (sum + diff) / 2;

		// finding y
		long a2 = sum - a1;

		System.out.println("For array: " + Arrays.toString(a) + "\n");
		System.out.println("a1 is: " + a1);
		System.out.println("a2 is: " + a2);

		return;
	}

	public static void main(String argvs[]) {
		// creating an object of the class MissingAndRepeatingElement
		MissingAndRepeatingElement obj = new MissingAndRepeatingElement();

		int arr[] = { 1, 3, 5, 4, 1 };
		int size = arr.length;

		obj.findEle(arr, size);

		int arr1[] = { 1, 3, 5, 2, 3 };
		size = arr1.length;

		System.out.println();
		obj.findEle(arr1, size);

	}
}

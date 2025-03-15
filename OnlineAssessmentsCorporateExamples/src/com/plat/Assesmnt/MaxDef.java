package com.plat.Assesmnt;

/*
 * Maximum difference between two elements such that larger element appears after the smaller
number

*Given an array arr[] of integers, find out the difference between any two elements such that larger 
*element appears after the smaller
number in arr[].
*
*/

class MaxDef {
	int maxDiff(int arr[], int arr_size) {
		int max_diff = arr[1] - arr[0];

		int i, j;
		for (i = 0; i < arr_size; i++) {
			for (j = i + 1; j < arr_size; j++) {
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		return max_diff;
	}

	public static void main(String[] args) {
		MaxDef maxdif = new MaxDef();
		int arr[] = { 1, 2, 90, 10, 110 };
		System.out.println("Maximum differnce is " + maxdif.maxDiff(arr, 5));
	}
}

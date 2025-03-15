package com.arrays;

import java.util.Arrays;

public class MethodsArray {
public static void main(String[] args) {
	
	 
	int nums[]= {45,89,34,26,90};
	int nums1[]= {45,89,34,26,90,75};
	
	int newAr[]=Arrays.copyOf(nums, 5);
	System.out.println("new arrays is :"+Arrays.toString(newAr));
	
	long count=Arrays.stream(nums).filter(n->n>50).count();
	System.out.println(count);
	System.out.println(Arrays.equals(nums, nums1));
	
	System.out.println("before sorting :"+Arrays.toString(nums));
	Arrays.sort(nums);
	System.out.println("after sorting :"+Arrays.toString(nums));
	Arrays.fill(nums, 67);
	System.out.println("After inserting new Record :"+Arrays.toString(nums));
	
	
	
}
}

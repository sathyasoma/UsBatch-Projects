package com.collections.set;

import java.util.HashSet;

//Write a Java program to Find the intersection of HashSet collections
public class Intersection26 {
	public static void main(String[] args)
	{
		HashSet <Integer> nums1 = new HashSet<Integer>();
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		nums1.add(40);
		nums1.add(50);
		nums1.add(60);
		HashSet <Integer> nums2 = new HashSet<Integer>();
		nums2.add(10);
		nums2.add(20);
		nums2.add(30);
		nums2.add(40);
		nums2.add(70);
		nums2.add(80);
		System.out.println("HashSet 1 : " + nums1);
		System.out.println("HashSet 2 : " + nums2);
 
		HashSet <Integer> inter = new HashSet <Integer> (nums1);
		inter.retainAll(nums2);
 
		System.out.print("Intersection of HashSet1 and HashSet2 : " + inter);
	}
}

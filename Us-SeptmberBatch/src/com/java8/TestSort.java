package com.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//withoutlamda
//class MyComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer i1, Integer i2) {
//		
//		if(i1<i2) //7<89 :-
//		{
//			return 1;
//		}
//		else if(i1>i2) //7-3:5
//		{
//			return -1;
//		}
//		else {
//		return 0;
//		}
//	}
//}
public class TestSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> al= new ArrayList();
		
		al.add(34);
		al.add(12);
		al.add(67);
		al.add(98);
		al.add(32);
		al.add(46);
		al.add(87);
		al.add(18);
		System.out.println("before sorting :"+al);
		
		//Collections.sort(al, new MyComparator());
		Comparator<Integer> c=(i1,i2)->(i1<i2)?1:(i1>i2)?-1:0;
		Collections.sort(al,c);
	
		System.out.println("after sorting :"+al);
	}
}

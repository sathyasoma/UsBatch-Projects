package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentEx {

	public static void main(String[] args) {
	ArrayList<Integer> al= new ArrayList<Integer>();
	
	al.add(23);
	al.add(26);
	al.add(86);
	al.add(46);
	al.add(15);
	al.add(90);
	al.add(48);
	al.add(35);
	al.add(14);	
	System.out.println(al);
	
	//filtering even numbers by using stremas with lamda
	List<Integer> li=al.stream()
			.filter(i->i%2==0)
			.collect(Collectors.toList());
		
	//even numbers from stream objects
	System.out.println(li);
	
//updating the marks of student -->map
	
	List<Integer> updatedMarks=al.stream().map(j->j+5).collect(Collectors.toList());
	System.out.println("marks updated :"+updatedMarks);
	
//counting how many students are failed	
	
	long failedStudents=updatedMarks.stream().filter(k->k<40).count();
	System.out.println("Failedd Students :"+failedStudents);

// sorting of collection object 
	
	List sortedList=al.stream().sorted().collect(Collectors.toList());
	
	System.out.println("sorting order is :"+sortedList);
	
	//customized order 
	List cusOrder=al.stream().sorted((a1,a2)->(a1<a2)?1:(a1>a2)?-1:0).collect(Collectors.toList());
	System.out.println("customized order :"+cusOrder);

	//heighest marks 
	Integer maxMarks=al.stream().max((l1,l2)->l1.compareTo(l2)).get();
	System.out.println("maximum marks :"+maxMarks);
	
	//lowest marks 
	Integer minValue=al.stream().min((d1,d2)->d1.compareTo(d2)).get();
	System.out.println("minimum marks :"+minValue);
	
	//iterating values by using method reference foreach method 
	
	al.stream().forEach(System.out::println);
	
	}
}

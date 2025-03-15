package com.java8;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	int eno;
	String ename;
	
	public Employee(int eno,String ename)
	{
		this.ename=ename;
		this.eno=eno;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + "]";
	}	
}

public class TestUser {

	public static void main(String[] args) {
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(123,"sathya"));
		al.add(new Employee(789,"karthik"));
		al.add(new Employee(189,"rahul"));
		al.add(new Employee(298,"mahesh"));
		al.add(new Employee(875,"ramu"));
		
		System.out.println("before sorting :"+al);
		
		Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?1:(e1.eno>e2.eno)?-1:0);
		System.out.println("after sorting :"+al);
	}
}

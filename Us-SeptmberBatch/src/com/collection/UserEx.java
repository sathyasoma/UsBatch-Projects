package com.collection;

import java.util.ArrayList;

public class UserEx {

	public static void main(String[] args) {
		
		
		ArrayList<Employee> al= new ArrayList<Employee>();
		
		al.add(new Employee(123,"sathya"));
		al.add(new Employee(908,"karthik"));
		al.add(new Employee(345,"rahul"));
		al.add(new Employee(124,"mahesh"));
		
		//for each loop 
		
		for(Employee e:al)
		{
			if(e.getEmpid()==345)
			{
				System.out.println(e.getEmpid()+" "+e.getEmpname());
			}
		}
		
	}
}

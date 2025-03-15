package com.association;

import java.util.ArrayList;
import java.util.List;

//professor class
class Professor{
	
	String name;

	//parma constructor
	public Professor(String name)
	{
		this.name=name;
	}
	
	//infoemation details method
	public void show()
	{
		System.out.println("Professor name is :"+name);
	}
}  
//department class
class Department {
	
	String depName;
	List<Professor> professors; //has a relation
	
	//param constructor of departmnet 
	public Department(String depName,List<Professor> professors)
	{
		this.depName=depName;
		this.professors=professors;
	}
	
	//department details merhod
	public void showDepartment() {
		System.out.println("Departmnet :"+depName);
		for(Professor porf:professors)
		{
			porf.show();
		}
	}
	
}
public class AggregationExample {

	public static void main(String[] args) {
		
		Professor pf1= new Professor("Rahul");
		Professor pf2= new Professor("Karthik");
		Professor pf3= new Professor("MAHESH");
	
		
		List<Professor> professors=new ArrayList(); //collection
		professors.add(pf1);
		professors.add(pf2);
		professors.add(pf3);
		
		
		Department dep= new Department("CSE", professors);
		dep.showDepartment();
	}
}

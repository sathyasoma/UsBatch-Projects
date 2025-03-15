package com.inheritance;

class Course{
	
	String courseName;
	
	//inilization with construtir
	public Course(String courseName)
	{
		this.courseName=courseName;
	}
	
	//display info course
	public void displayInfo()
	{
		System.out.println("CourseName :"+courseName);
	}
	
}
public class OnlineCourse extends Course{
   
	String platForm;
	
	public OnlineCourse(String courseName,String platForm)
	{
		super(courseName);
		this.platForm=platForm;
	}
	
	//info about onlinecourse 
	public void dispalyInfo()
	{
		super.displayInfo();
		System.out.println("PlatForm :"+platForm);
	}
	
	public static void main(String[] args) {
		
		OnlineCourse oc= new  OnlineCourse("Java", "Udemy");
		oc.dispalyInfo();
	}
}

package com.constructors;
//without constrcuctor

public class Student {
    
	  int studentId; //678
	  String studentName;//bahubali
	  
	  public void assign()
	  {
		  studentId=678;
		  studentName="bahubali";
	  }
	  public void display()
	  {
		  System.out.println("student Name is:"+studentName);
		  System.out.println("student id is:"+studentId);
	  }
	
	public static void main(String[] args) {
		
		Student st= new Student();
		
		//st.assign(); //explicitly calling methods
		st.display();
		
	}
}

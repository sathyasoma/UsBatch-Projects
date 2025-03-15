package com.car.showroom.project;

import java.util.Scanner;
import java.util.UUID;

public class Employees extends ShowRoom implements utility {

	String empi_id;
	String emp_name;
	int emp_age;
	String emp_department;
	
	@Override
	public void get_details()
	{
		System.out.println("Id :"+empi_id);
		System.out.println("Name :"+emp_name);
		System.out.println("Age :"+emp_age);
		System.out.println("Department :"+emp_department);
		System.out.println("showroom name :"+showroom_name);
	}
	@Override
	public void set_details()
	{
		
		Scanner sc= new Scanner(System.in);
		
		UUID uid=UUID.randomUUID();
		empi_id=String.valueOf(uid);
		
		System.out.println("===============Enter Employee Details==========");
		System.out.println("Employee Name:  ");
		emp_name=sc.nextLine();
		System.out.println("Employee Age :");
		emp_age=sc.nextInt();
		sc.nextLine();
		System.out.println("Employee Department :");
		emp_department=sc.nextLine();
		System.out.println("Enter Showroom Name :");
		showroom_name=sc.nextLine();
	}
}

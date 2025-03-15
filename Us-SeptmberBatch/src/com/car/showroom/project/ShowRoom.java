package com.car.showroom.project;

import java.util.Scanner;

public class ShowRoom implements utility {

	String showroom_name;
	String showroom_address;
	int total_employees;
	int total_car_instock=0;
	String manager_name;
	
	
	@Override
	public void get_details() {
		System.out.println("ShowRoom Name :"+showroom_name);
		System.out.println("showRoom Address :"+showroom_address);
		System.out.println("Manager Name :"+manager_name);
		System.out.println("Toatl Employees :"+total_employees);
		System.out.println("Total cars stock :"+total_car_instock);
		
	}
	@Override
	public void set_details() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("=================Enter ShowRoom Details===================");
	    System.out.println();
	    System.out.println("ShowRoom Name:  ");
	    showroom_name=sc.nextLine();
	    System.out.println("ShowRoom Address:  ");
	    showroom_address=sc.nextLine();
	    System.out.println("Manager Name:  ");
	    manager_name=sc.nextLine();
	    System.out.println("Total Number of Employees:  ");
	    total_employees=sc.nextInt();
	    System.out.println("Total cars in the stock:   ");
	    total_car_instock=sc.nextInt();
	}
	
	
	
}

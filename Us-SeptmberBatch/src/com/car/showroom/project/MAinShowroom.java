package com.car.showroom.project;

import java.util.Scanner;

interface utility {

	public void get_details();

	public void set_details();
}

public class MAinShowroom {

	static void main_menu() {
		System.out.println();
		System.out.println("============***Welcome To ShowRoom Mangement System***================");
		System.out.println();
		System.out.println("==============***Enter Your Choice***==============");
		System.out.println();
		System.out.println("1].Add ShowRooms \t\t 2].Add Employees \t\t 3].Add Cars");
		System.out.println();
		System.out.println("4].Get ShowRooms \t\t 5].Get Employees \t\t 6].Get Cars");
		System.out.println();
		System.out.println("========================***Enter 0 to Exit***==============");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ShowRoom showRoom[] = new ShowRoom[5];
		Employees employees[] = new Employees[5];
		Cars cars[] = new Cars[5];

		int car_counter = 0;
		int showRoom_counter = 0;
		int employees_counter = 0;

		int choice = 100;

		while (choice != 0) {
			main_menu();
			choice = sc.nextInt();

			while (choice != 9 && choice != 0) {
				switch (choice) {
				case 1:
					showRoom[showRoom_counter]=new ShowRoom();
					showRoom[showRoom_counter].set_details();
					showRoom_counter++;
					System.out.println();
					System.out.println("1].ADD New ShowRoom");
					System.out.println("9].Go TO Main Menu");
					choice=sc.nextInt();
					break;
				case 2:
					employees[employees_counter]=new Employees();
					employees[employees_counter].set_details();
					employees_counter++;
					System.out.println();
					System.out.println("2].ADD New Employee");
					System.out.println("9].Go TO Main Menu");
					choice=sc.nextInt();
					break;
				case 3:
					cars[car_counter]=new Cars();
					cars[car_counter].set_details();
					car_counter++;
					System.out.println();
					System.out.println("3].ADD New Car");
					System.out.println("9].Go TO Main Menu");
					choice=sc.nextInt();
					break;
				case 4:
					for(int i=0;i<showRoom_counter;i++)
					{
						showRoom[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].Go TO Main Menu");
					System.out.println("0].Exit");
					choice=sc.nextInt();
					break;
				case 5:
					for(int i=0;i<employees_counter;i++)
					{
						employees[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].Go TO Main Menu");
					System.out.println("0].Exit");
					choice=sc.nextInt();
					break;
				case 6:
					for(int i=0;i<car_counter;i++)
					{
						cars[i].get_details();
						System.out.println();
						System.out.println();
					}
					System.out.println();
					System.out.println("9].Go TO Main Menu");
					System.out.println("0].Exit");
					choice=sc.nextInt();
					break;
				default:
					System.out.println("Enter a Valid choice....");
					break;
				}
			}
		}

	}

}

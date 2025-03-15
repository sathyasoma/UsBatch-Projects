package com.hospital;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class General {
	public void List() {
		try {
			Thread.sleep(2000); // Threads
			System.out.println("THE LIST OF DOCTORS WE HAVE IS :");
			HashMap hm = new HashMap();
			hm.put(1, "NEUROLGIST"); // collection
			hm.put(2, "OPTHAMOLOGIST");
			hm.put(3, "DENTIST");
			hm.put(4, "DERMATOLOGIST");
			hm.put(5, "CARDIOLOGIST");
			hm.put(6, "GENERAL SURGEON");
			hm.put(7, "ENT");
			Set a1 = hm.entrySet();
			Iterator i = a1.iterator();
			while (i.hasNext()) {
				Thread.sleep(1000);
				System.out.println(i.next());
			}
		} catch (Exception e) {
			System.out.println("JST CHECK THE THREAD");
		}
	}

	synchronized void details() {
		String a = "Devasena";
		String b = "Kattapa";
		String c = "Bahubali";
		String d = "Ballaladeva";
		String e = "Keerthi";
		String f = "Suresh";
		String g = "RajMohan";
		System.out.println("HERE IS THE LIST OF DOCTORS WITH THEIR DESIGNATION:");
		try {
			Thread.sleep(1000);
			System.out.println("Neurologist :" + a);
			Thread.sleep(1000);
			System.out.println("Othomolgist :" + b);
			Thread.sleep(1000);
			System.out.println("Dentist :" + c); // Exception Handling
			Thread.sleep(1000);
			System.out.println("Dermotologist :" + d);
			Thread.sleep(1000);
			System.out.println("Cardiologist :" + e);
			Thread.sleep(1000);
			System.out.println("General Surgeon :" + f);
			Thread.sleep(1000);
			System.out.println("ENT :" + g);
		} catch (Exception e1) {
			System.out.println("CHECK WITH THE THREAD");
		}
		System.out
		.println("SELECT THE TYPE OF DOCTOR YOU WANT TO CONSULT(AS PROVIDED IN THE ABOVE IST(APPROPRIATE)) :");
		Scanner sc1 = new Scanner(System.in);
		String c2 = sc1.nextLine();
		String c1 = c2.toUpperCase();
		if (c1.equals("NEUROLOGIST")) {
			System.out.println(
					"YOUR APPOINTMENT WITH" + " " + a + " " + "IS ABOUT TO READY...PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("OPTHOMOLOGIST")) {
			System.out.println(
					"YOUR APPOINTMENT WITH" + " " + b + " " + "IS ABOUT TO READY...PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("DENTIST")) {
			System.out.println("YOUR APPOINTMENT WITH" + c + " " + "IS ABOUT TO READY...PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("DERMATOLOGIST")) {
			System.out.println(
					"YOUR APPOINTMENT WITH" + " " + d + " " + " IS ABOUT TO READY...PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("CARDIOLOGIST")) {
			System.out.println(
					"YOUR APPOINTMENT WITH" + " " + e + " " + "IS ABOUT TO READY.....PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("GENERAL SURGEON")) {
			System.out.println(
					"YOUR APPOINTMENT WITH" + " " + f + " " + "IS ABOUT TO READY.....PLEASE WAIT FOR TWO MINUTES");
		} else if (c1.equals("ENT")) {
			System.out.println(
					"YOUR APPOINTMENT WITH " + " " + g + " " + " IS ABOUT TO READY.....PLEASE WAIT FOR TWO MINUTES");
		} else {
		}
		try {
			Thread.sleep(2000);
			System.out.println("THANK YOU FOR WAITING,YOUR APPOINTMENT IS READY ");
		} catch (Exception e1) {
			System.out.println("CHECK WITH THE THEAD");
		}
	}

	void check() {
		// override
	}
}

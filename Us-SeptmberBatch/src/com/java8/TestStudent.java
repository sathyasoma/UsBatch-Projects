package com.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> al= new ArrayList<Student>();
		
		al.add(new Student("mahesh",89));
		al.add(new Student("rahul",76));
		al.add(new Student("karthik",80));
		al.add(new Student("tarun",56));
		al.add(new Student("divya",77));
		al.add(new Student("sathya",30));
		
		Predicate<Student> p=s->s.stmarks<60;
		
		for(Student st:al)
		{
			if(p.test(st))
			{
				System.out.println(st.stmarks+" "+st.stname);
			}
		}
	}
}

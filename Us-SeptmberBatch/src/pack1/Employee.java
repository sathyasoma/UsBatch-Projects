package pack1;

class Parent{
	
	//private method
	private void m2()
	{
		System.out.println("i am m2 of parent");
	}
	
}

public class Employee{

	///private method
	private void m1()
	{
		System.out.println("i am m1 of employee");
	}
	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.m1();
		
		
		
	}
}

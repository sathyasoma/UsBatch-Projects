package casestudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Client {

	public static void main(String[] args) {

		HashMap<Integer,Employee> employee= new HashMap<Integer,Employee>();//database
		
		int empid=789; //automaticlaly incremnt 
		
		while (true) {
			System.out.println("******Employee Management Application*****");
			System.out.println("1.Add Employee");
			System.out.println("2.Update Employee");
			System.out.println("3.delete Employee");
			System.out.println("4.get Employee");
			System.out.println("5.Get all Employees");

			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("***Add Employee*****");
				System.out.println("Enter Employee Name");
				String empname=sc.next();
				System.out.println("Enter Employee Salary");
				int empsal=sc.nextInt();
				System.out.println("Enter Employee Adddress");
				String empadd=sc.next();
				System.out.println("Enter Employee Email id");
				String empmail=sc.next();
			
				Employee emp= new Employee(empname, empsal, empadd, empmail);
				
				//store data into database
				employee.put(++empid, emp);
				System.out.println("Employee inserted :"+empid);
				break;
			case 2:
				System.out.println("***Update Employee*****");
				System.out.println("Enter Employee Id");
				int eid=sc.nextInt();
				System.out.println("Enter Employee Name");
				String ename=sc.next();
				System.out.println("Enter Employee Salary");
				int esal=sc.nextInt();
				System.out.println("Enter Employee Adddress");
				String eadd=sc.next();
				System.out.println("Enter Employee Email id");
				String email=sc.next();
				
			Employee emp1= new Employee(ename, esal, eadd, email);
			//AFTER UPDATE STORE DATA INTO DATABASE
			employee.put(eid, emp1);
			
			System.out.println("Employee is updated :"+eid);
				
				break;
			case 3:
				System.out.println("***Delete Employee*****");
				System.out.println("Enter Employee Id");
				int eid1=sc.nextInt();
				
				employee.remove(eid1);
				
				System.out.println("Employee deleted suucfully :"+eid1);
				break;
			case 4:
				System.out.println("***Get Employee*****");
				System.out.println("Enter Employee id");
				int eid2=sc.nextInt();
				Employee empobj=employee.get(eid2);
				
				System.out.println(empobj);
				
				break;
			case 5:
				System.out.println("***get All Employees*****");
				Set<Entry<Integer,Employee>> res=employee.entrySet();
				Iterator<Entry<Integer,Employee>> itr=res.iterator();
				
				while(itr.hasNext())
				{
					Entry<Integer,Employee> finalResult=itr.next();
					System.out.println(finalResult.getKey()+" "+finalResult.getValue());
				}
				break;
			default:
				System.out.println("***Please Enter VALID nUMBER*****");
				break;
			}

		}
	}
}

package acom.abstraction;

interface Mom{ //interface mom
	
	//abstract method
	 void sleep();  //compiler will place automatically public abstarct
	 
}
interface Dad {
	
	//abstract method
	 void sleep();
}
public class Baby implements Mom,Dad {
	@Override
	public void sleep() {
	System.out.println("i can sleep my onw direction");		
	}
	public static void main(String[] args) {
		  
		Baby b= new Baby();
		b.sleep();
		
	//	Dad m= new Dad();//we can create object interfaces
	}

	
}

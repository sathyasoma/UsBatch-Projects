package acom.abstraction;

 abstract class Electronic{ //abstarct class
	
	public abstract void motherBoard(); //unimplemneted method
	
	public void keypad()//implimented method
	{
		System.out.println("we have lot of keys in pad");
	}	
}

public class Demo extends Electronic{
	
	@Override
	public void motherBoard() {
		System.out.println("this mother borad has too much speed");
		
	}
	public static void main(String[] args) {
			
		Demo d= new Demo();
		d.keypad();
		d.motherBoard();
	}

	
}

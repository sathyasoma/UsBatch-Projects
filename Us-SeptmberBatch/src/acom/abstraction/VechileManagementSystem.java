package acom.abstraction;
//interface for safety protocol 
interface SafetyProtocol
{
  //abstarct method 
	void performSafetyCheck();
}
//abstract class
abstract class Vechile{
	  
	String model;
	
	public Vechile(String model)
	{
		this.model=model;
	}
	
	//abstarct method 
	abstract void drive();
	
	//abstract method 
	abstract void refuel(int amount);
}
//car class implementeing the safety check  and extends vechile class
class  Car  extends Vechile implements SafetyProtocol{
	
	int fuelLevel;
	
	public Car(String model,int fuelLevel)
	{
		super(model);
		this.fuelLevel=fuelLevel;
	}

	@Override
	void drive() {
		if(fuelLevel>0)
		{
			System.out.println("Driving a Car :"+model);
			fuelLevel=fuelLevel-10;
		}
		else {
			System.out.println("Car :"+model+" needs refuel...");
		}	
	}

	@Override
	void refuel(int amount) {
		fuelLevel=fuelLevel+amount;
		System.out.println("Refueled car :"+model +" with"+amount+"liters.current level"+fuelLevel);
		
	}

	@Override
	public void performSafetyCheck() {
		System.out.println("performce check for car :"+model);		
	}	
}

//Bike class implemnting safety and extends with vechile

class Bike extends Vechile implements SafetyProtocol{
   
	int fuelLevel;
	
	public Bike(String model,int fuelLevel)
	{
		super(model);
		this.fuelLevel=fuelLevel;
	}

	@Override
	void drive() {
		if(fuelLevel>0)
		{
			System.out.println("Driving a Bike :"+model);
			fuelLevel=fuelLevel-5;
		}
		else {
			System.out.println("Bike :"+model+" needs refuel...");
		}	
		
	}

	@Override
	void refuel(int amount) {
		fuelLevel=fuelLevel+amount;
		System.out.println("Refueled Bike :"+model +" with"+amount+"liters.current level"+fuelLevel);	
		
	}

	@Override
	public void performSafetyCheck() {
		System.out.println("performce check for Bike :"+model);		
		
	}

}
public class VechileManagementSystem {

	public static void main(String[] args) {
		
		Car car= new Car("Tesla model sx", 50);
		car.drive();
		car.refuel(200);
		car.performSafetyCheck();
		
		System.out.println();
		
		
		Bike bike= new Bike("KTM", 15);
		bike.drive();
		bike.refuel(100);
		bike.performSafetyCheck();
		
	}
}

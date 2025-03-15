package acom.abstraction;

//it is interface
interface Notification{
	
	//abstract method
	void sendNotification(String message);
	
}

//Email Notification class
class EmailNotification implements Notification {
	
	String email;
	
	public EmailNotification(String email)
	{
		this.email=email;
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Email to "+email+" :"+message);
	}	
}
//sms notification class 
class SMSNotification implements Notification{
	
	String phoneNumber;
	
	public SMSNotification(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}

	@Override
	public void sendNotification(String message) {
		System.out.println("sending SMS To :"+phoneNumber+": "+message);
	}
}
public class NotificationService {

	public static void main(String[] args) {
		
		Notification email= new EmailNotification("Sathya191916@gmail.com");
		email.sendNotification("your airtel payment is pending");
		
		Notification sms= new SMSNotification("7729938257");
		sms.sendNotification("your payement is successfull");
	}
}

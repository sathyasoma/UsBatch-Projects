package casestudy;

//model class or encapsulated class
public class Employee {

	private String empname;
	private int empsal;
	private String empadd;
	private String empmail;
	
	//getters and setters
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsal() {
		return empsal;
	}
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	public String getEmpadd() {
		return empadd;
	}
	public void setEmpadd(String empadd) {
		this.empadd = empadd;
	}
	public String getEmpmail() {
		return empmail;
	}
	public void setEmpmail(String empmail) {
		this.empmail = empmail;
	}
	
	//default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	//param constrcour
	public Employee(String empname, int empsal, String empadd, String empmail) {
		super();
		this.empname = empname;
		this.empsal = empsal;
		this.empadd = empadd;
		this.empmail = empmail;
	}
	
	//to string method
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empsal=" + empsal + ", empadd=" + empadd + ", empmail=" + empmail
				+ "]";
	}
	
	
	
	
	
	
}

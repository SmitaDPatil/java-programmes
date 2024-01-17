package variable_study;

public class HR__Portal {
	
	public static void main(String[] args) {
		
		Employee Rahul= new Employee();// creating object for Employee class
		Rahul.empid=1; // initializing non static global variable " empid" using object
		Rahul.sal=10000; //initializing non static global variable "sal" using object
		Rahul.RM=" Dayasagar P"; //initializing non static global variable"RM" using object
		
		Employee Sara=new Employee();
		Sara .empid=2;
		Sara.sal=200000;
		Sara.RM="Rajveer p";
		
		Employee Arjun= new Employee();
		Arjun.empid=4;
		Arjun.sal=400000;
		Arjun.RM="Shreeya p";
		
		Rahul.EmpInfo();// calling non static method using object
		Sara.EmpInfo();
		Arjun.EmpInfo();
		
		
		
	}

}

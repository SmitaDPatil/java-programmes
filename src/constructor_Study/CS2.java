package constructor_Study;

public class CS2 {
	// Example of user defined constructor
	
	String city="Kolhapur";// variable declaration manualy
	
	//use of constructor-->to initialize variable
	
	String name; // variable declaration
	
	public CS2() //User defined constructor without parameters
	{
		name="Rajveer";
		
	}
	
	public static void main(String[] args)
	{
		display1();
		
		CS2 c2=new CS2();
		c2.display();
		
		
		
	}
	
	public void display()	
	{
		
	System.out.println("Iam non static display method");
	System.out.println("My city name is "+city);
	System.out.println("My name is "+name);
	
	}
	
	public static void display1()
	
	{
		System.out.println("I am static display1 method");
		
	}
	
	
		
	}



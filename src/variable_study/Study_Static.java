package variable_study;

public class Study_Static {
	static int a=40; // static global variable

	
	public static void main(String[] args) {
		
		Study_Static s= new Study_Static();
		s.display();
		System.out.println("value of a is "+a);// calling static global variable from same class
		System.out.println("value of p is "+Study_Static1.p);//calling static global variable from another class
		
	}
	
	public void display()
	{
		int b=30; // local variable
		
		System.out.println(" value of b is "+b);// local variable
		
		System.out.println("value of a is "+a); //static global variable
		
	}
	
		
		
		
		
		
		
		
	}


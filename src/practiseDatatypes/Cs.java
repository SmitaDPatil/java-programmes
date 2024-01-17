package practiseDatatypes;

public class Cs {
	
	// example of user defined constructor with and without parameter
	
	
	String city ;
	int num1;
	int num2;
	int num3;
	
	
	public Cs()//user defined constructor without parameter
	
	{  
		city="kolhapur";
		num1=10;
		num2=20;
		num3=30;
	}
	
	public  Cs( int a, int b)
	
	{ 
		num1=a;
		num2= b;
	}
	public Cs( int a, int b, int c)
	
	{
		num1=a;
		num2=b;
		num3=c;
	}
	

	public static void main(String[] args) 
	
	{
		Cs c=new Cs();
		c.display();
		c.addition();
		Cs c1=new Cs(20,30);
		c1.addition();
		Cs c2=new Cs(10,20,30);
		c2.addition();
		
	}
	
	public void display()
	
	{
		System.out.println("i am non static display method");
	}
	
	public void addition()
	
	{
		int sum= num1+num2+num3;
		System.out.println("addition is  "+sum);
		
	}

}

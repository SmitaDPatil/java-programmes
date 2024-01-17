package practiseDatatypes;

public class NonStaticMethodCall 
{
	int a=1;

	int b=2;
	
	//non static method call from same class and another class
	
	// create object
	
	public static void main(String[] args)
	
	{
		
		
		
		NonStaticMethodCall ns=new NonStaticMethodCall();
		
		ns.m1();
		ns.addition();
		ns.addition(9,9,9);
		
		Sample1 s1=new Sample1();
		s1.m2();
		s1.subtraction(90,9 );
	}
	
	public void m1()
	{
	System.out.println("i am non static method");
	}
	
	public void addition()
	
	{
		int a=1;
		int b=2;
		int sum=a=b;
		
		System.out.println("addition is "+sum);
		
	}
	
	public void addition(int a,int b, int c)
	
	{
		int sum=a+b+c;
		System.out.println(" addition is "+sum);	
	}
				
	}
	
	


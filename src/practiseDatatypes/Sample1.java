package practiseDatatypes;

public class Sample1 

{
	
public static void main(String[] args)

{
	NonStaticMethodCall ns=new NonStaticMethodCall();
	ns.m1();
	
	Sample1 s1=new Sample1();
	s1.m2();
	s1.subtraction(99, 90);
}
	
	public void m2()
	{
		System.out.println("i am non static m2 method from sample1 class");
	}
	
	public void subtraction(int a, int b)
	{
	
	int sub= a-b;
	
	System.out.println("subtraction is "+sub);
	}
	 
	}

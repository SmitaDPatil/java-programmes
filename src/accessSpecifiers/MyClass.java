package accessSpecifiers;

public class MyClass {
	
	private int a=10;
	
	int b=20;
	
	protected int c=30;
	
	public int d=40;
	

	public static void main(String[] args)
	
	{
		MyClass m=new MyClass();
		
		System.out.println("value of a is "+m.a);// calling private member in same class
		
		System.out.println("value of b is "+m.b);//calling default member in same class
		
		System.out.println("value of c is "+m.c);//calling protected member in same class
		
		System.out.println("value of d is "+m.d);//calling public member in same class
		
		System.out.println("==========================================");
		
		m.test1();
		
		m.test2();
		
		m.test3();
		
		m.test4();
		
		
		

	}
	
	private void test1()// private non static method
	
	{
		System.out.println("private method--> visible in within class only");
		
	}
	
	void test2()// default non static method
	
	{
		
		System.out.println("default method --> visible within package only");
		
	}
	
	protected void test3()//protected non static method
	
	{ 
		System.out.println("protected method --> vithin package and outside of package using inheritance concept ");
		
	}
	
	public void test4()//public non static method
	
	{
		System.out.println("public method --> within project");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
	



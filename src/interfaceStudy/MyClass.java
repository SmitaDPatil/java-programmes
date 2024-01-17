package interfaceStudy;

public class MyClass implements MyIterface

{

	public static void main(String[] args)
	
	{
		MyClass m=new MyClass();//created object of implementation class
		
		m.test();
		m.test1();
		m.test1(10,20);
		
	}

	@Override
	public void test() 
	{
		System.out.println("method completed in implementation class");
		
	}
	
	public  void test1()
	
	{
		System.out.println("own method of implementation class");
	}
		

	@Override
	public void test1(int a, int b)
	
	{
		int sum=a+b;
		
		System.out.println("sum is "+sum);
		
		
	}
		
		

	}

	



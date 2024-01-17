package interfaceStudy;

public class Test {
	
	//if we make any class as final we cannot extends that class
	
	static int b=90;
	

	public static void main(String[] args)
	
	{
		final int a=100; // we cannot re assign values to the variables
		
		String b="Hi";
		
		System.out.println(a);
		
		//a=a=20;
		
		System.out.println(a);
		
		//a=a+40;
		System.out.println(a);
		
	}
	
	final void show()// we cannot override final method
	
	{
		System.out.println("show method from Test class");
	
	
		
		
		
		
		

	}

}

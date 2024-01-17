package practiseDatatypes;

public class StaticMethodCall {

	public static void main(String[] args)
	
	//calling static regular method from same class and another class
	
	{
		//method name();
		demo();
		addition();
			
	
		
		//class name. method name();
		Sample.demo2();
        Sample.subtraction();
	}
	
	public static void demo()
	
	{
		System.out.println("hi this is static method");
	}
	
	public static void addition()

	
	{
		int a=9;
		int b=9;
		int c= a+b;
		
		System.out.println(c);
		
		
	}
	
	
}

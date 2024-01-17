package methods;

public class MethodsUse2 {

	public static void p()
	{
		System.out.println("static method without parameter");
		
	}
	
	public static void q(int a, int b, int c)
	
	{
		System.out.println("This is static method with parameter");
		
		int sum=a+b+c;
		
		System.out.println("sum is "+sum);
		
	}
	
	public void r()
	
	{
		System.out.println("This is non static method without parameter");
		
	}
	
	public void s(String name, String city)
	
	{
		System.out.println("This is non static method with parameter");
		
		System.out.println("My name is "+name);
		System.out.println("I am from "+city);
		
		
		
	}
	
	
		
	

}

package polymorphism;

public class CompileTime {

	public static void main(String[] args)  
	
	{
		CompileTime ct=new CompileTime();
		ct.addition();
		ct.addition(10, 20);
		ct.addition(10, 9.9f);
		ct.addition(9.9f, 99);
		
		
				

	}
	
	public void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("Addition is "+sum);
		
	}
	public void addition( int a, int b)
	
	{
		int sum=a+b;
		
		System.out.println("Addition is "+sum);
		
	}
	
	public void addition(float a, int b)
	{
	
	float sum=a+b;
	
	System.out.println("Addition is"+sum);
	
	}
	public void addition (int a, float b)
	
	{
		float sum=a+b;
		
		System.out.println("Addition is "+sum);
				
		
	}

}

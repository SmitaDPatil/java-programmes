package methods;

public class MathOperations {

	public static void main(String[] args)
	
	{
		MathOperations mo=new MathOperations();
		
		mo.addition();
		
		mo.addition();
		
		mo.addition();
		
		mo. addition(1,2,3);
		
		mo.addition(4,5,6);
		
		mo.subtraction(100,10);
		
		mo.subtraction(50,10);
		
		
	}

	public void addition()//method without parameter
	
	{
		int a;
		int b;
		int sum;
		a=10;
		b=20;
		sum=a+b;
		System.out.println("additionis "+sum);
		
	}
	public void addition(int a, int b,int c)//method with parameter
	
	{int sum=a+b+c;
	
	System.out.println("addition is "+sum);
	}
	
	
	public void subtraction(int a,int b)// method with parameter
	
	{
		int sub;
		
		 sub=a-b;
		
		System.out.println("subtraction is "+sub);
		
		
	
	}
	

}

package constructor;

public class CS
{
	int a;
	int b;
	int c;
	
	public CS() //User defined without parameter
	
	{
		a=1;
		b=2;
		c=3;
		
	}
	
	public CS (int x)// user defined singal parameter constructor
	
	{
		a=x;
		
		//b?
		//c?
		
	}
	public CS(int x, int y)// User defined two parameter constructor
	
	{
		a=x;
		b=y;
		
		
	}
	public CS(int x,int y,int z)
	
	{
		a=x;
		b=y;
		c=z;
		
	}
	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		CS c=new CS();
		c.addition();
		c.subtraction();
		System.out.println("=======================================");
		
		CS c1=new CS(100);
		c1.addition();
		c1.subtraction();
		System.out.println("=======================================");
		
		CS c2=new CS(9,90);
		c2.addition();
		c2.subtraction();
		System.out.println("=========================================");
		
		
	}

	public void addition() // non static method 
	
	{
		int sum=a+b+c;
		
		System.out.println("a value is "+a);
		System.out.println("b value is "+b);
		System.out.println("c value is "+c);
		System.out.println("sum is "+sum);
		
	}
	
	public void subtraction()
	{
		int sub=a-b-c;
		System.out.println("sub is "+sub);
		
		
	}
		
		
		
		
		
		

	}



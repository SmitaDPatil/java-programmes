package thisAndSuperKeyword;

public class ThisKeyWord

{
	int a=100; //non static global variable
	
	int b=190; //non static global variable
	
	static int c=1;//static global variable
	

	public static void main(String[] args)
	
	{
		ThisKeyWord t= new ThisKeyWord ();//created object of class
		
		t.test();
		
		

	}
	
	public void test()
	
	{
		
		int a=101;//non static local variable
		int sum=a+10;
		
		System.out.println("sum is "+sum);
		
		int sum1=this.a+10;
		
		System.out.println("sum is "+sum1);
		
		int b=900;
		
		int sum2=this.b+10;
		
		System.out.println("sum is "+sum2);
		
		
		int div=c/10;//we can use static variables in static as wel as non static method
		
	}
	
	static void test1()
	
	{
		//int mul=a*10; we cant use non static variable in static method
		
		int mul1=c*100;
		
		
	}

}

package methods;

public class MethodsUse1 {

	public static void main(String[] args)
	{
		MethodsUse1 mu1=new MethodsUse1();
		
		mu1.a(); // calling non static method without parameter
		
		b(); // calling static method without parameter
		
		mu1.c(99,10,"IND"); //calling non static method with parameter
		
		d(9,801,"A");
		
		System.out.println("==========================================");
		
		MethodsUse2. p(); //calling static method without parameter from another class
		
		MethodsUse2.q(10,20,30); //calling static method with parameter from another class
		
		MethodsUse2 mu2=new MethodsUse2(); //created object of another class
		
		mu2.r(); // calling non static method without parameter from another class
		
		mu2.s("Rajveer", "Kolhapur"); // calling non static method with parameter from another class
		
		
	}
	
	public void a()
{
	System.out.println(" This is non static without parameter method a");
	
}
public static void b()
{
	System.out.println("This is static method without parameter");
	
}

public void c(int runs, int overs, String team)

{
	System.out.println("==================================================");
	System.out.println("Non static method with parameter");
	System.out.println("My runs are "+runs);
	System.out.println("My overs are "+overs);
	System.out.println("My team is "+team);
	System.out.println("===================================================");
	
}

public static void d(int floorNum, int flatNumber,String buildingName)

{
	
	
	System.out.println("====================================================");
	System.out.println(" Static method with parameter");
	System.out.println("My floor number is "+floorNum);
	System.out.println("My flat number is "+flatNumber);
	System.out.println("My building name is"+buildingName);
	System.out.println("=====================================================");
	
	
}
}

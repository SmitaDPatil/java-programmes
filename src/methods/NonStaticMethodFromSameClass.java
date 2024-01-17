package methods;

public class NonStaticMethodFromSameClass {

	public static void main(String[] args)
	{
		
	//to call non static method we need object
	
	//? how to create object
		
	//ClassName objectName = new ClassName();
		
	NonStaticMethodFromSameClass obj =new NonStaticMethodFromSameClass();//created object
	
	// how to call Non-static method
	
	// syntax-->objectName.MethodName();
	
	obj.test1();// callingNon-static method from same class
	
	obj.test2();//calling Non-static method from same class
	
	}
	
	public void test1()//Non-static method complete and regular
	{
	System.out.println("This is non static method from same class");
	}
	
	public void test2()//Non static method complete and regular
	{
	System.out.println("This is non static method from same class");	
	}
		
		
	}



package abstractClass;

public class ConcreteClass extends Sample  {

	public static void main(String[] args)
	
	{
		ConcreteClass cc = new ConcreteClass();
		cc.test1();//calling method from abstract class--> completed in sample( abstract class)
		
		cc.test();//calling method from concrete class --> completed in concrete class( method from sample class)
		
		
		cc.test2();//calling method from concrete class --> completed in concrete class( method from sample class)
		
		cc.test3();//calling method from concrete class --> completed in concrete class( method from concrete class)
		
		Sample.test4();//calling complete static method from sample (abstract class)

		
	}
	

	
	


	@Override
	public void test()
	{
		
	System.out.println("This method is completed in concrete class");	
		
	}




	@Override
	public void test2()
	{
		
		System.out.println("This method is completed in concrete class");	
			
	}
	
	public void test3()
	{
		System.out.println("own method from concrete class");
	}



}

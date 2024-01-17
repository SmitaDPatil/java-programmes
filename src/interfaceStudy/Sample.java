package interfaceStudy;

public class Sample implements Interface2

{

	public static void main(String[] args)
	
	{
		Sample s=new Sample();
		
		s.demo1();
		s.demo2();
		s.demo3();
		s.demo4();
		
		System.out.println("value of a is"+a);
		
		System.out.println("value of b is"+b);
		
	    System.out.println("value of c is"+c);
	    
	    //c=c+20
	
	}

	@Override
	public void demo1()
	
	{
		//method from interface 1
		
		System.out.println("method demo1 completed in implemantaton class");
		
	}

	@Override
	public void demo2()
	
	{
		//method from interface 1	
		
		System.out.println("method demo2 completed in implemantaton class");
		
	}

	@Override
	public void demo3()
	
	{
		//method from interface 2
		

		System.out.println("method demo3 completed in implemantaton class");
		
		
	}

	@Override
	public void demo4() 
	
	{
		//method from interface 2
		
		System.out.println("method demo4 completed in implemantaton class");
		
			
		
	}
	
	
}

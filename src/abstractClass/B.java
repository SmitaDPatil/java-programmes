package abstractClass;

public class B extends A {

	public static void main(String[] args)
	{
		B b=new B();
		b.demo3();
		

	}

	@Override
	public void demo3() 
	{
		System.out.println("this method completed in class B");
	}

}

package abstractClass;

public class C extends A{

	public static void main(String[] args)
	{
		C c=new C();
		c.demo3();

	}

	@Override
	public void demo3()
	{
		System.out.println("THIS METHOD COMPLETED IN CLASS C");
		
	}

}

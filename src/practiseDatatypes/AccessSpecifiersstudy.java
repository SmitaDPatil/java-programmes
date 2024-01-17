package practiseDatatypes;

public class AccessSpecifiersstudy {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args) {
		
		AccessSpecifiersstudy a=new AccessSpecifiersstudy();
		System.out.println("value of a is "+a.a);
		System.out.println("value of a is "+a.b);
		System.out.println("value of a is "+a.c);
		System.out.println("value of a is "+a.d);
		
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}
	
	private void test1() 
	{
		System.out.println("private mehod visibla in class only");
	}

	void test2()
	{
		System.out.println("default method visible in package only");
	}
	
	protected void test3()
	{
		System.out.println("within package and outside the package using inheritance");
	}
public void test4()
{
System.out.println("within project");
}
}

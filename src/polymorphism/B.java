package polymorphism;

public class B extends A {

	public static void main(String[] args)
	{
		A a=new A();// created object of superclass

		B b= new B();//created object of subclass
		b.test();
		b.math_operation(4, 2);
		b.math_operation(5, 3);
		a.math_opration(9, 9);
		a.display();
		b.show();

	}
	
	public void show()

	{
		System.out.println("B's show method");
		
	}
	public void test()
	{
		System.out.println("B's test method");
		
	}
	public void math_operation(int a, int b)
	
	{
		int sub = a-b;
		System.out.println("sub is "+sub);
		
	}
}

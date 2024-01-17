package practiseDatatypes;

public class B extends A {

	public static void main(String[] args) {
		B b=new B();
		b.demo1();
		b.c();

	}

	@Override
	public void demo1() {
		
		System.out.println("METHOD COMPLETED IN CLASS B");
	}
	
	public  void c()
	{
		System.out.println("c");
	}

}

package practiseDatatypes;

public class D extends C {
int a=500;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D d=new D();
		d.display();
		

	}
	
	public void display()
	{
		int a= 200;
		System.out.println("local valueof a"+a);
		System.out.println("global value of a"+this.a);
		System.out.println("global value of a"+super.a);
		
	}

}

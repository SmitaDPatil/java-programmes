package practiseDatatypes;

public class NsVariableCall {
	
	int a=20;// non static global variable

	public static void main(String[] args)
	
	{
		NsVariableCall nv= new NsVariableCall();
		nv.display();
		nv.display1();
		System.out.println("value of a after calling is "+nv.a);
		NsVariable n=new NsVariable();
		System.out.println("value of p after calling is "+n.p);
		
	}
public void display()
{
int b=30;
System.out.println("value of b is "+b);
System.out.println("value of a is"+a);
}

public void display1()
{
	int c=40;
	int b=50;
	System.out.println("value of c is"+c);
	System.out.println("value of b is"+b);
	System.out.println("value of a is"+a);
}
}
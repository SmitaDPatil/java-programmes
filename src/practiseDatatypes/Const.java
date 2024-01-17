package practiseDatatypes;

public class Const
{
	String name;
	
public Const()
{
	name="Shreeya";
	System.out.println(" hi this is constructor");
}
public Const ( String a)
{

name=a;
}

	public static void main(String[] args) 
	{
		
		
		Const cs=new Const();
		cs.demo();
		Const cs1=new Const("Shreeya");
		cs1.demo1();
		
		
		

	}
	public void demo()
	
	{
		System.out.println("hi good morning");
	}
	
	public void demo1()
	
	{
		System.out.println(" my name is "+ name);
	}
	}



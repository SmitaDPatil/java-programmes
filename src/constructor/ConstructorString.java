package constructor;

public class ConstructorString {
	
String name;


public ConstructorString()

{
	name="Rajveer";
	
}

public ConstructorString (String a)

{
	name=a;
}

public static void main(String[] args)
{
	ConstructorString cs=new ConstructorString();
	cs.display();
	
	ConstructorString cs1=new ConstructorString("Shreeya");
	cs1.display();
	
	ConstructorString cs2=new ConstructorString("kolhapur");
	cs2.display();
	
}

public void display()

{
	System.out.println("My name is "+name);
	
	

	
	
}
	
}

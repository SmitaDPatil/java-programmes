package practiseDatatypes;

public class VariableCall {
	
	static int a=40;
	

	public static void main(String[] args)
	
	{
		VariableCall vc=new VariableCall();
		vc.display();
		
		System.out.println("value of a is "+a);// calling static global variable from same class
		
		System.out.println("value of p is "+VariableStudy.p);
		
	}
public void display()

{
	int b=30;
	System.out.println("value of b is "+b);//local variable
	System.out.println("value of a is "+a);//static global variable
	
		

}
}

package constructor;

public class ConstructorUse {
	
	int a; //variable declaration
	int b;
	int c;
	
	 //use of constructor --. To initialize data member/ Variable
	
	public ConstructorUse()// user defined without parameter constructor)
		
			{
				a=100;
				b=200;
				c=300;
				
			}
			
	
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//The constructor is called when an object of a class is created.
		
		ConstructorUse cu=new ConstructorUse();//created object of a class
		
		cu.addition();
		
	}
	
	public void addition()
	{ 
		int sum;
		sum=a+b+c;
		
		System.out.println("sum is "+sum);
		
	}
	
		
		
	}


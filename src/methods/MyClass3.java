package methods;

public class MyClass3 {

	public static void main(String[] args) {
		
	//to call non static method from same class -->create object
		
	// ClassName objectName=new ClassName(); 
	
		
		MyClass3 m3=new MyClass3();
	
	//to call non static method-->object name. method name();
		
	m3.a();//calling non static method from same class
	m3.b();//calling non static method from same class
	
	//to call non static from another class
	//create object of that (another)class
	//we want to call method from MyClass4
	
	MyClass4 m4=new MyClass4();//Created object of another class
			
	//to call non static method-->objectname.methodname();
			
	m4.c();//calling non static method from another class
	m4.d();//calling non static method from another class
	
	


	}
	
	public void a()// non static regular method
	
	{
		System.out.println("This is non static method from MyClass3");
	}
	
	public void b()//non static regular method
	
	{
		System.out.println("This is non static method from MyClass3");
		
	}	
	
	
	}



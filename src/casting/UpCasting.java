package casting;

public class UpCasting {

	public static void main(String[] args)
	
	{
		// int a=10;
		//double b=a;
		
		Father f=new Father();
		
		Son s=new Son();
		
		f.bike();//bullet
		f.car();//Thar
		
		System.out.println("================================================");
		
		s.bike();//FZ
		s.car();//Creta
		s.laptop();
		
		System.out.println("==================================================");
		
		//UpCasting
		
		//creating object of subclass and giving ref of super class
		
		Father f1=new Son();
		
		f1.bike();
		f1.car();
		
		//f1.laptop();
		
		System.out.println(" hi this is info");
		System.err.println("hi this is error");

	}
	

}

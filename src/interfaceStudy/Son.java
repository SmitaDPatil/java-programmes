package interfaceStudy;

public class Son implements Father, Mother{

	public static void main(String[] args)
	
	{
		Son s=new Son();
		
		s.hardware();
		s.honey();
		s.look();
		s.nature();
		s.love();
		
		

	}

	@Override
	public void look() {
		
	System.out.println("Mothers look completed in Sons class");	
		
	}

	@Override
	public void nature() {
		
	System.out.println("Mothers nature completed in Sons class");
		
	}
	
	@Override
	public void hardware() {
		
		System.out.println("Fathers hardware completed in Sons class");
		
	}

	@Override
	public void honey() {
		
		System.out.println("Fathers honesty completed in Sons class");
		
	}
	
	public void bike()
	{
		System.out.println("Sons own method Bike");
	}

	@Override
	public void love() {
		Father.super.love();
		Mother.super.love();
		
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
	

	
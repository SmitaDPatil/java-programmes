package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args)
	
	{
		Father f=new Father();
		
		f.hardwork();// superclass object calling superclass method
		
		Son1 s1=new Son1();
		
		s1.Thar();//subclass object calling subclass method
		
		s1.hardwork();//subclass object calling superclass method**
		
		Son2 s2=new Son2();
		
		s2.Bullet();//subclass object calling subclass method
		
		s2.hardwork();//subclass object calling superclass method**

	}

}

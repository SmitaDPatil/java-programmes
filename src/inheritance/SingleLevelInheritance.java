package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	
	{
	Mother m=new Mother();//created object of superclass
	m.look();//calling method from superclass using superclass object
	Mother.nature();//calling static method from superclass using superclass ref
	
	Daughter d=new Daughter();//created object of subclass
	d.scooty();//calling method from subclass using subclass object
	d.look();//calling method from superclass using subclass object
	Daughter.laptop();//calling static method from subclass using subclass ref
	Daughter.nature();//calling static method from superclass using subclass ref

	}

}

package practiseDatatypes;

public class MultilevelInheritance {

	public static void main(String[] args) 
	{
	Grandmother gm= new Grandmother();
	
	gm.receipe();
	
	Mother m= new Mother();
	m.look();
	m.receipe();
	
	Daughter d= new Daughter();
	
	d.scooty();
	d.look();
	d.receipe();
	
	}

}

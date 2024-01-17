package inheritance;

public class MultiLevelInheritance {
	
	public static void main(String[] args)
	
	{
		GrandMother gm=new GrandMother();
		
		gm.receipe();//calling non static method from superMost class using object of superMost class
		 GrandMother.keys();//calling static method from superMost class using ref of superMost class
		 
		 Mother m=new Mother();
		 
		 m.look();//calling non static method from super class using object of super class
		 m.receipe();//calling non static method from superMost class using object of super class
		 
		 Mother.nature();//calling static method from super class using ref of super class
		 Mother.keys();//calling static method from superMost class using ref of super class**
		 
		 Daughter d=new Daughter();
		 
		 d.scooty();//calling non static method from sub class using object of sub class
		 d.look();//calling non static method from super class using object of sub class**
		 
		 d.receipe();//calling non static method from superMost class using object of sub class***
		 
		 Daughter.laptop();//calling static method from sub class using ref of sub class
		 
		 Daughter.nature();//calling static method from super class using ref of sub class**
		 
		 Daughter.keys();//calling static method from superMost class using ref of sub class
		 
		 
		
	}

}

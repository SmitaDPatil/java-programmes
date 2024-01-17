package interfaceStudy;

public interface Mother

{
	void look();
	void nature();
	
	 default void love()
	 {
		 System.out.println("Mothers love");
	}
	
	
		
		
	
	
	static void test()
	
	{
		System.out.println("Mothers test method");
		
	}

}

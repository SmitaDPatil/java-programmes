package interfaceStudy;

public interface Father 

{
	void hardware();
	void honey();
	 default void love()
	 
	 {
		 System.out.println("Fathers love");
	 }
	 
	
	 static void test ()
	 
	 {
		 System.out.println("Fathers test method");
	 }
	 

}

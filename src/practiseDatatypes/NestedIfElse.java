package practiseDatatypes;

public class NestedIfElse {

	public static void main(String[] args)
	
	{
		String un="Velocity";
		String pwd="123";
		
		if (un=="Velocity") {
			System.out.println("corect username plz enter password");
		
			if(pwd=="123") {
			System.out.println("login succesful");
			
			} else {
				
				System.out.println("wrong password plz check password" );
		}
	} 
		
	else {
		System.out.println("incorrect username unable to login");
	}
}
		
	}
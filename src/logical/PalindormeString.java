package logical;


public class PalindormeString {


	public static void main(String[] args) 
	{
		
		String org="JAVA";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev+org.charAt(i);
		}
		
		System.out.println("Original String is "+org);
		System.out.println("Reverse STring is "+rev);
	
		if (org.equals(rev))
		{
			System.out.println("Given String is Palindrome");
		}
		else {
			System.out.println("Given String is not Palindrome");


		}
			
	}


}

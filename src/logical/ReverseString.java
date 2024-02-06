package logical;


import java.util.Scanner;


public class ReverseString {


	public static void main(String[] args)
	{
		
		//String s ="Pune";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter String to be reversed");
		String s=sc.next();
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev=rev+s.charAt(i);
		}
		System.out.println("Original String is "+s);
		
		System.out.println("Reverse String is "+rev);


	}


}

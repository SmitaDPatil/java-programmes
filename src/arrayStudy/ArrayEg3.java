package arrayStudy;

import java.util.Arrays;

public class ArrayEg3 {

	public static void main(String[] args) 
	
	{
		int[]age= {7,8,1,9,6,4,5};
		
		// i want to print the age value as it is
		
		System.out.println("============same order==================");

		for (int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("============Revers orer==================");
		
		// i want to print the age value in reverse order
		
		for(int i=age.length-1;i>=0;i--)
			
		{
			System.out.println(age[i]);
			
		}
		System.out.println("==============Ascending order============");
		
		Arrays.sort(age);// using sort method of Arrays class
		
		
		for(int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("===============Descending order===================");
		
		for(int i=age.length-1;i>=0;i--)
		{
			System.out.println(age[i]);
		}
			
		String[]names= {"John","Navvaj","Salman","Akshay","Bobby"};
		
		Arrays.sort(names);// we have sorted array called as names
		
		System.out.println("=================Ascending order==================");
		
		for(int i=0;i<=names.length-1;i++)

	{
		System.out.println(names[i]);
	}
		System.out.println("===============Descending order==============");
		
		for(int i=names.length-1;i>=0;i--)
			
		{
			System.out.println(names[i]+" ");
		}

}
}

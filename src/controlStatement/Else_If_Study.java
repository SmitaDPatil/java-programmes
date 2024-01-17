package controlStatement;

public class Else_If_Study {
	
public static void main(String[] args)

{
//if my gender is M then I am male
	
//else if my gender is F i am female
	
//else please enter gender value either M or F
	
	char gender='F';
	if (gender=='M')
		
	{
		System.out.println("I am male");
		
	}
	
	else if(gender=='F')
		
	{
		System.out.println("I am female");
	
	}
	
	else
		
	{ 
		System.out.println("please enter gender value either M or F");
	}
	
	System.out.println("===============================================");
	
	// if my marks are  greater than or equal 80 and less than equal 100 -->I am dist
		
	//else if my marks are greater than equal to66 and less than 80 --> I am in 1st class
	
	// else if my marks are greater than or equal to 50 and less than 66 --> I am in 2nd class
	
	//else if my marks are greater than equal to 40 and less than 50 --> I am pass 
	
	// else I am fail
	
	int marks=66;
	if (marks>100)
	
	{
		System.out.println("please enter valid marks, should be less than 100");
	}
	
	else if (marks>=80 && marks<=100)
		
	{
		System.out.println("I am dist");
	}
	
	else if(marks>=66 && marks<80)
		
	{
		System.out.println("I am in 1st class");
	}
	else if (marks>=50 && marks<66)
		
	{
		System.out.println("I am in 2nd class");
	}
	else if (marks>=40 && marks<50)
		
	{ 
		System.out.println("I am just pass");
	}
	else
	{ 
		System.out.println("I am fail");
	}
	
	
	}
	

}

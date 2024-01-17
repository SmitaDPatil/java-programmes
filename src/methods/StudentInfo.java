package methods;

public class StudentInfo {

	public static void main(String[] args)
	{
		StudentInfo si=new StudentInfo();
		
		si.studentDetails();
		
		si.studentDetails();
		
		si.studentDetails();
		
		si.studentDetails("Shreeya" ,90,'F',99.9f);
		si.studentDetails("Rajveer",99,'M',99.9f);
	}
	
	public void studentDetails()// method without parameter
	
	{
		// name,rollNum , Gender, avg
		
		String name;
		int rollNum;
		char gender;
		float avg;
		
		
		name="Raj";
		rollNum=11;
		gender='M';
		avg=90.9f;
		
		System.out.println("===================================================");
		
		System.out.println("Myname is "+name);
		System.out.println("My roll number is "+rollNum);
		System.out.println("My gender is "+gender);
		System.out.println("My marks are "+avg);
		
		System.out.println("===================================================");
		
		
	}
	
	public void studentDetails(String name, int rollNum,char gender, float avg)
	// method with parameter
	
	{
		//name,rollNum,Gender,avg
		String team;
		team="IND";
		
		System.out.println("===================================================");
		
		System.out.println("Myname is "+name);
		System.out.println("My roll number is "+rollNum);
		System.out.println("My gender is "+gender);
		System.out.println("My marks are "+avg);
		System.out.println("My team is "+team);
		
		System.out.println("===================================================");
		
	}
}

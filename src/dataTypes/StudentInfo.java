package dataTypes;

public class StudentInfo {

	public static void main(String[] args) {
    // name ,gender,avg_result, mark,pass- fail status
		
		//1. Variable declaration
		String name;
		char gender;
		float avg_result;
		int marks;
		boolean result_status;
		
		// Variable initialize
		name="Mahesh";
		gender='M';
		avg_result=99.9f;
		marks=80;
		result_status=true;
		
		//Usage
		System.out.println("============================================");
		System.out.println("My name is "+name);
		System.out.println("My gender is "+gender);
		System.out.println("My avg result is "+ avg_result);
		System.out.println("My mark are "+marks);
		System.out.println("My passing status is "+result_status);
		System.out.println("============================================");
		
		
	}

}

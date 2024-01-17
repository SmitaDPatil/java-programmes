package controlStatement;

public class SwitchCase_Study {

	public static void main(String[] args)
	{
		// M--> Male
		//F-->Female
		//a-z-->please enter correct gender value-->default
		
		char gender='A'; 
		
		switch(gender)//M,F
		
		{
		case'M':System.out.println("I am male");
		break;
		case'F':System.out.println("I am female");
		break;
		default:System.out.println("please enter correct gender value");
		break;
		
		}
		System.out.println("=============================================");
		
		//1-7
		//1-->Monday 7-->Sunday
		
		int day=3;
		switch(day)
		
		{
		case 1:System.out.println("Today is Monday");
		break;
		case 2:System.out.println("Today is Tuesday");
		break;
		case 3:System.out.println("Today is Wednesday");
		break;
		case 4:System.out.println("Today is Thursday");
		break;
		case 5:System.out.println("Today is Friday");
		break;
		case 6:System.out.println("Today is saturday");
		break;
		case 7:System.out.println("Today is sunday");
		break;
		default:System.out.println("please enter daybetween 1-7");
		break;
		
		}
		
		System.out.println("================================================");
		//red-->stop
		//yellow-->wait
		//green-->go
		
		String colour="green";
		
		switch(colour)
		
		{
		case "green":System.out.println("Go");
		break;
		case "red":System.out.println("Stop");
		break;
		case "yellow":System.out.println("Wait");
		break;
		default:System.out.println("plase enter valid colour");
		break;
		
		}
				
	}
	
}
	
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	


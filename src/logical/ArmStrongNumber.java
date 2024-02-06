package logical;


public class ArmStrongNumber {


	public static void main(String[] args) {
		//153-->
		//1^3+5^3+3^3=1+125+27=153
		
		int num=159;
		int sum=0;
		
		for(int i=num;i>0;i=i/10)//153,15,1
		{
			
			int rem=i%10;//3,5,1
			sum=sum+(rem*rem*rem);
			//27=0+3*3*3
			//152=27+5*5*5
			//153=152+1
		}
		
		System.out.println(num);
		System.out.println(sum);
		
		
		if(num==sum)
		{
			System.out.println("Given number is armStrong Number");
		}
		
		else {
			System.out.println("Given number is not armStrong Number");


		}


	}


}


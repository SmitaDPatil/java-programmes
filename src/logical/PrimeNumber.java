package logical;


public class PrimeNumber {


	public static void main(String[] args) {
		// 12
		
		int num=13;
		int count=0;
		
		for(int i=2;i<num;i++)//2
		{
			if(num%i==0)//13%2=1
			{
				count++;//
				break;
			}
		}
		
		if(count==1)
		{
			System.out.println("Given number is not a prime number");
		}
		else {
			System.out.println("Given number is  a prime number");


		}
		
		


	}


}

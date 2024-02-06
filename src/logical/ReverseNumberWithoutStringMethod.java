package logical;


public class ReverseNumberWithoutStringMethod {


	public static void main(String[] args) {
		
		
		int num=1234;
		int revNum=0;
//		System.out.println(num%10);//1234-->4
//		System.out.println(num/10);
//		
//		System.out.println(123%10);//123-->3
		


		for(int i=num;i>0;i=i/10)//1234,123,12,1
		
		{
			int rem=i%10;//4,3,2,1
			revNum=revNum*10+rem;
			//     4=0+4
			//	   43=40+3
			//	   432=430+2
			//	   4321=4320+1
		}
		
		System.out.println(revNum);
	}


}

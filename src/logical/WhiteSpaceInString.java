package logical;


public class WhiteSpaceInString {


	public static void main(String[] args) {
		


		String s="Pun  e ";
		int counter=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			 char ch = s.charAt(i);//0,1,2,3,4,5,6
			 if(ch==' ')
			 {
				 counter++;//0,1,2,3
			 }
		}
		System.out.println("Number of white spaces are "+counter);
		
		
	}


}

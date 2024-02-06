package logical;

public class ChangeOrderOfString {

	public static void main(String[] args) {
		String s="This is MY INDIA";
		//odd positions -->rev
		//even positions-->rev
		
		String ar[]=s.split(" ");//{"This","is","INDIA"}-->{"This","si","INDIA"}
								//    0      1    2
		for(int i=0;i<=ar.length-1;i++)//0,1,2
		{
			if(i%2!=0)//even
			{
				String s1=ar[i];
				ar[i]=revString(s1);
			}
		}
		
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}

	}
	
	//we will write one method to reverse the String
	public static String revString(String input)
	{
		String rev="";
		for(int i=input.length()-1;i>=0;i--)
		{
			rev=rev+input.charAt(i);
		}
		return rev;
		
	}
	

}
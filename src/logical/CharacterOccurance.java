package logical;


public class CharacterOccurance {


	public static void main(String[] args) {
		
		String s="engineering";
		
		int counter=0;
		
		char character='n';// char to be counted
				
		for(int i=0;i<=s.length()-1;i++)
		{
			char t = s.charAt(i);
			if(t==character)
			{
				counter++;
			}
		}


		System.out.println("Occurance of "+character+" is "+counter);
	}


}

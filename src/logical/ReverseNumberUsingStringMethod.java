package logical;


public class ReverseNumberUsingStringMethod {


	public static void main(String[] args) {
	
		
		int orgNum=1234;
		int revNum;
		
		String orgNumString = Integer.toString(orgNum);
		String revNumString="";
		
		for(int i=orgNumString.length()-1;i>=0;i--)
		{
			revNumString=revNumString+orgNumString.charAt(i);
		}
		
		//System.out.println(revNumString); this is reverse Number but in String format
		//we need rev  num in int form;
		
		revNum=Integer.parseInt(revNumString);
		
		System.out.println("Original Number is "+orgNum);
		System.out.println("Reverse Number is "+revNum);
	}


}

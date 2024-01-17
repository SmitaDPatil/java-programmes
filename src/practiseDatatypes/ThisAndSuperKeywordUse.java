package practiseDatatypes;

public class ThisAndSuperKeywordUse {
	
	int a=100;
	int b=190;
	
	static int c=100;

	public static void main(String[] args) {
		
		ThisAndSuperKeywordUse t=new ThisAndSuperKeywordUse();
		
		t.test();
		t.test1();
	}
	
	public void test()
	
	{
		int a=101;
		int sum= a+10;
		System.out.println("sum is"+sum);
		
		int sum1=this.a+10;
		
		System.out.println("sum is"+sum1);
		
		int b=200;
		int sum3=b+10;
		System.out.println("sum is"+sum3);
		int sum2=this.b+20;
		System.out.println("sum is"+sum2);
		
		int div= c/10;
		System.out.println("div is"+div);
	}
	
	static void test1()
	
	{
		int mul1= c*100;
		
		System.out.println("mul is"+mul1);
	}

}

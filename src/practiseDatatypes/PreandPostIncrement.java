package practiseDatatypes;

public class PreandPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		System.out.println(a);
		int i;
		//postincrement
		
		i=a++;
		System.out.println(i);
		System.out.println(a);
		System.out.println("==========================================");
		
		
		int z=99;
		int y;
		
		System.out.println(z);
		y=z++;
		System.out.println(y);
		System.out.println(z++);
		System.out.println(z);
		System.out.println("==================================================");
		
		//postincrement
		
		int m=99;
		int n;
		n=++m;
		
		System.out.println(n);
		System.out.println(m);
		
		++m;
		System.out.println(m);
		++m;
		System.out.println(m);
		System.out.println(n);
		
		System.out.println("===============================================");
		
		int p=10;
		int q;
		
		q=p--;//post decrement
		System.out.println(q);
		System.out.println(p);
		System.out.println("=======================================");
		
		int w=10;
		int x;
		x=--w;
		System.out.println(x);
		System.out.println(w);
	}

}

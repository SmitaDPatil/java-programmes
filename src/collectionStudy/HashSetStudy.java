package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args) {
		
		HashSet<Object>hs=new HashSet<>();
		
		hs.add("Hi");
		hs.add('M');
		hs.add(4);
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(5);
		hs.add(4);
		hs.add(3);
		hs.add(null);
		hs.add(null);
		hs.add(true);
		hs.add(123.3f);
		
		System.out.println(hs);
		
		HashSet<String>hs1=new HashSet<>();
		hs1.add("GN");
		hs1.add("GE");
		hs1.add("bYE");
		hs1.add("hI");
		hs1.add(null);
		hs1.add(null);
		hs1.add("GN");
		
		System.out.println(hs1);
		
		System.out.println("=================================================");
		
		for(String h:hs1)
			
		{
			System.out.println(h);
			
		}
		Iterator<String> it = hs1.iterator();
		
	System.out.println("========================================");
	
		while(it.hasNext())
			
			{
			System.out.println(it.next());
			
			}
		}

	}

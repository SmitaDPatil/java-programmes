package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	
	{
		LinkedHashSet<String>lh=new LinkedHashSet<>();
		
		System.out.println(lh.size());
		
		lh.add("Pune");
		
		lh.add("Pune");
		
		lh.add(null);
		
		lh.add(null);
		
		lh.add("Mumbai");
		
		lh.add("Nagpur");
		
		System.out.println(lh);
		
		System.out.println("================for each loop================");
		for(String  l:lh)
			
		{
			System.out.println(l);
			
		}
		
		System.out.println("=============================================");
		
		Iterator<String> it = lh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

package logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIntro {

	public static void main(String[] args) 
	{
		
		HashMap<Integer, String> mp= new HashMap<>();
		
		System.out.println(mp);
		
		//put--> to add key and its values
		
		mp.put(1, "Mahesh");
		mp.put(2, "Dipika");
		mp.put(3, "Ranbir");
		mp.put(4, "Mahesh");
		mp.put(1, "Rajani");
		System.out.println(mp);
		
		System.out.println(mp.get(1));
		
		
		System.out.println(mp.containsKey(1));
		System.out.println(mp.containsValue("Ranbir123"));
		
		Set<Entry<Integer, String>> mySet = mp.entrySet();
		
		for(Entry<Integer, String> m:mySet)
		{
			//System.out.println(m);
			//System.out.println(m.getKey());
			//System.out.println(m.getValue());
		}
		

	}

}

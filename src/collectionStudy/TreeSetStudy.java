package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	
	{
	TreeSet<Object>ts=new TreeSet<>();
	
	ts.add("Pune");
	ts.add(123);
	ts.add(null);
	ts.add("mumbai");
	ts.add("Nagpur");
	ts.add("Amravati");
	ts.add("Yavatmal");
	ts.add("Dhule");
	
	System.out.println(ts);
	
	 TreeSet <Integer>ts1=new  TreeSet<>();
	 
	 ts1.add(10);
	 ts1.add(1);
	 ts1.add(3);
	 ts1.add(4);
	//ts1.add(2);
	 ts1.add(5);
	 ts1.add(7);
	 ts1.add(8);
	 ts1.add(6);
	 ts1.add(9);
	 
	 System.out.println(ts1);
	 System.out.println(ts1.ceiling(3));	
	 System.out.println(ts1.ceiling(2));	
	 System.out.println(ts1.floor(2));	
	 System.out.println(ts1.first());	
	 System.out.println(ts1.last());	
	 System.out.println(ts1.size());	
	 System.out.println(ts1.remove(9));	
	 System.out.println(ts1);	
	 System.out.println(ts1.remove(2));	
	 System.out.println(ts1.higher(3));	
	 System.out.println(ts1.lower(11));	
	 
	 //for?
	 //for each, Iterator
	 
	 System.out.println("=================for each=====================");
	 
	 for(Integer t:ts1)
	 {
		 System.out.println(t);
		 
	 }
	 System.out.println("========================Iterator================");
	 
	 Iterator<Integer> it = ts1.iterator();
	 while(it.hasNext())
		 
	 {
		 System.out.println(it.next());
		//it.remove(); 
	 }
	 System.out.println(ts1);
	 
	 System.out.println("===============Decending Iterator===================");
	 
	 Iterator<Integer> it1 = ts1.descendingIterator();
	 while(it1.hasNext())
		 
	 {
		 System.out.println(it.next());
		 
	 }
	 
	 
	 
		 
		 
	 }
	 
	}



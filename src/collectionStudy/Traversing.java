package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversing {

	public static void main(String[] args) 
	
	{
		ArrayList<Integer>al=new ArrayList<>();
		
		al.add(1);
		
		al.add(3);
		
		al.add(34);
		
		al.add(2);
		
		al.add(22);
		
		al.add(12);
		
		System.out.println(al);
		
		System.out.println("=================for loop===================");
		
		for(int i=0;i<al.size()-1;i++)
			
		{
			System.out.println(al.get(i));
			
		}
		
		System.out.println("==================for each loop====================");
		
		for ( Integer s:al)
			
		{
			System.out.println(s);
			
		}
		
		System.out.println("====================Iterater===================");
		
		Iterator<Integer>it=al.iterator();
		
		//System.out.println(it.());
			
		//System.out.println(it.next());
		
		//System.out.println(it.next());
		
		//System.out.println(it.next());
		
		//System.out.println(it.next());
		
		//System.out.println(it.next());
		
		while(it.hasNext())
	
		{	
			
			System.out.println(it.next());
			
			}
		
		System.out.println("=========List iterater==================");
		
		ListIterator<Integer> lit = al.listIterator();
		
		while(lit.hasNext())
			
		{
			System.out.println(lit.next());
		}
		
		System.out.println("=============using list iterater in revers direction======");
		
		while(lit.hasPrevious())
			
		{
			System.out.println(lit.previous());
		}
		

	}

}

package collectionStudy;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStudy {

	public static void main(String[] args)
	
	{
		LinkedList<Character>ll=new LinkedList<>();
		
		System.out.println(ll);
		
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('A');
		ll.add('B');
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		
		ll.addFirst('M');
		ll.addLast('Z');
		
		System.out.println(ll);
		
		System.out.println(ll.contains('Z'));
		
		System.out.println(ll.element());
		
		System.out.println(ll);
		
		System.out.println(ll.peek());
		
		System.out.println(ll.poll());
		
		System.out.println(ll);
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.getFirst());
		
		System.out.println(ll.getLast());
		
		ll.offer('X');
		
		
		System.out.println(ll);
		
		
		System.out.println(ll.offerFirst('L'));
		
		ll.offerLast('J');
		
		System.out.println(ll);
		
		System.out.println(ll.pop());
		
		System.out.println(ll);
		
		ll.push('M');
		
		System.out.println(ll);
		
		ll.remove();
		
		System.out.println(ll);
		
		System.out.println("=================Traversing=====================");
		
		System.out.println("=================for loop======================");
		
		for(int a=0;a<=ll.size()-1;a++)
			
		{
			System.out.println(ll.get(a));
			
		}
		
		System.out.println("=============List iterator==========================");
		
		ListIterator<Character> li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
			
		}
		
		}
		
		
		
	}



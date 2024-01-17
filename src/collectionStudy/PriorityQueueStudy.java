package collectionStudy;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueStudy {

	public static void main(String[] args) 
	
	{
		
		PriorityQueue<Object>pq=new PriorityQueue<>();
		
		pq.add(100);
		pq.add(90);
		pq.add(20);
		pq.add(80);
		//pq.add(null);//null not accepted
		//pq.add(null);
		pq.add(200);
		pq.add(400);
		pq.add(100);
		pq.add(600);
		
		System.out.println(pq);
		
		//duplicates are allowed but only homogeneous data is accepted
		
		System.out.println("==============================================");
		
		System.out.println(pq.contains(97));
		
		System.out.println("========================");
		
		
		System.out.println(pq.element());//insert element at first
		System.out.println(pq);
		System.out.println("==============================");
		
		
		
		System.out.println(pq.offer(400));
		System.out.println(pq);
		
		System.out.println("========traversing using Iterator==================");
		
		Iterator<Object> itpq = pq.iterator();
		
		while(itpq.hasNext())
		{
			System.out.println(itpq.next());
			
		}
		
		System.out.println("==============for each loop=================================");
		
		for(Object pri:pq)
		{
		
		System.out.println(pri);
		
		}
		
		System.out.println("==================List Iterator========================");
		
		System.out.println(pq);
		
		
		
		

	}

}

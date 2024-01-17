package collectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	
	{
		Vector<String> v=new Vector<>();
		
		v.add("MH");
		
		v.add("AP");
		
		v.add("TN");
		
		v.add("KA");
		
		v.add("PB");
		
		v.add("UP");
		
		v.add("DL");
		
		System.out.println(v.capacity());
		
		
		
		System.out.println(v.size());
		
		v.add("KA");
		
		v.add("PB");
		
		v.add(null);
		
		v.add(null);
		
         System.out.println(v.capacity());
		
		System.out.println(v.size());
		
		System.out.println(v);
		
		System.out.println(v.contains("XY"));
		
		System.out.println(v.get(0));
		
		System.out.println(v.elementAt(0));
		
		System.out.println(v.firstElement());
		
		System.out.println(v.lastElement());
		
		System.out.println(v);
		
		v.insertElementAt("KL", 1);//WORKING AS ADD (index ,element);
		
		System.out.println(v);
		
		System.out.println(v.remove(1));
		
		System.out.println(v.remove("GA"));
		
		
		v.setSize(16);
		
		System.out.println(v);
		
	System.out.println("=============Traversing though vector===================");
	
	//for loop,for each,iterator,list iterator,enumeration
	
      System.out.println(v);
      
      System.out.println("===============for each loop=====================");//works on collection
      
      for(String vect:v)
    	  
      {
    	  System.out.println(vect);//show all the elements present in list 
    	  
    	  
      }
      System.out.println("============iterator===========================");
      
      Iterator<String> it = v.iterator();
      
      while(it.hasNext())
    	  
      {
    	  System.out.println(it.next());//show all the elements present in list 
      }
		
      System.out.println("=============enumeration===============");
      
      Enumeration<String> ele = v.elements();
      
      while(ele.hasMoreElements())
    	  
      {
    	  System.out.println(ele.nextElement());
    	  
      }
      
	}

}

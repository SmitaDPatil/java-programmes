package logical;

import java.util.ArrayList;
import java.util.TreeSet;

public class Find_Second_LargestNumber_From_Array {

public static void main(String[] args)
{

int ar[]= {3,2,9,1,8,4,6,5,7};

TreeSet tr= new TreeSet();

for(int number:ar)//3,2,9,...
{
tr.add(number);//
}
System.out.println(ar);//complete tree set
ArrayList al= new ArrayList(tr);
System.out.println("Second lowest number "+al.get(1)); System.out.println("Second highest number "+al.get(al.size()-2));


}

}

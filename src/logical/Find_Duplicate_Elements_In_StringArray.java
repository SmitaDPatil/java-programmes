package logical;
public class Find_Duplicate_Elements_In_StringArray{

public static void main(String[]args)
{

String ar[]={"testing","java","webdriver","selenium","java","testing","software","selenium"};

System.out.println("Duplicate elements are");
for(int i=0;i<ar.length;i++)
{
for(int j=i+1;j<ar.length;j++)
{
if(ar[i].equals(ar[j]))
{
System.out.print(ar[j]+"");
}
}
}

}

}

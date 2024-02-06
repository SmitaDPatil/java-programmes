package logical;

public class Find_Duplicate_Elements_In_Array {
	
public static void main(String[] args)
{
int ar[]= {1,2,3,5,2,4,5,7,3,7,8,9};
System.out.println("Duplicate elements are");
for(int i=0;i<ar.length;i++)//i=0,1
{
for(int j=i+1;j<ar.length;j++)//j=1,2......9,j=2,3,4
{
if(ar[i]==ar[j])
//2==3?
//2==5?
//2==2
{
System.out.print(ar[j]+" ");
}
}
}
}
}
package pattern;
public class Equilateral_Up_WithSpace {
public static void main(String[] args) {
//	   * 
//	  * * 
//	 * * * 
//	* * * * 

//rows-->4 columns-->4
//1st row star-->1 1st row space-->3
int space=3;
int star=1;
//outer for loop--> rows
for(int i=1;i<=4;i++)
{
//inner for loop
//space
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
//inner for loop
//star
for(int k=1;k<=star;k++)
{
System.out.print("* ");
}
star++;
space--;
System.out.println();
}
}
}

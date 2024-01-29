package pattern;
public class Equilateral_Down_WithSpace {
public static void main(String[] args) {
//	* * * * 
//	 * * * 
//	  * * 
//	   * 

//rows-->4 columns-->4
//1st row star-->4 1st row space-->0
int star=4;
int space=0;
//outer for loop--> row
for(int i=1;i<=4;i++)
{
//inner for loop--> space
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
//inner for loop--> star
for(int k=1;k<=star;k++)
{
System.out.print("* ");
}
space++;
star--;
System.out.println();
}
}
}
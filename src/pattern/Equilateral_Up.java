package pattern;
public class Equilateral_Up {
public static void main(String[] args) {
//	   *
//	  ***
//	 *****
//	*******

//rows-->4 columns-->7
//1st row star-->1 1st row space-->3
int star=1;
int space=3;
//outer for -->rows
for(int i=1;i<=4;i++)
{
//inner for-->space
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
//inner for-->star
for(int k=1;k<=star;k++)
{
System.out.print("*");
}
star= star+2;
space--;
System.out.println();
}
}
}
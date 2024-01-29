package pattern;
public class Equilateral_Down {
public static void main(String[] args) {
//	*******
//	 *****
//	  ***
//	   *
// rows-->4 columns--> 7
// 1st row stars-->7 1st row space-->0
int star=7;
int space=0;
//outer for-->rows
for(int i=1;i<=4;i++)
{
//inner for loop--> spaces, stars
for(int j=1;j<=space;j++)
{
System.out.print(" ");
}
for(int k=1;k<=star;k++)
{
System.out.print("*");
}
star=star-2;
space++;
System.out.println();
}
}
}
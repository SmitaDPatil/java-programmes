package pattern;
public class Triangle_Right_Descending {
public static void main(String[] args) {
//	*****
//	 ****
//	  ***
//	   **
//	    *

// rows-->5 columns-->5
// 1st row stars-->5 1st row space-->0
int star=5;
int space=0;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=space;j++)// for space
{
System.out.print(" ");
}
for(int k=1;k<=star;k++)// for star
{
System.out.print("*");
}
star--;
space++;
System.out.println();
}
}
}
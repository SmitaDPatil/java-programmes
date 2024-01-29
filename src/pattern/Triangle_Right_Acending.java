package pattern;
public class Triangle_Right_Acending {
public static void main(String[] args) {
//	    *
//	   **
//	  ***
//	 ****
//	*****

//rows-->5; columns-->5
//1st row stars-->1; 1st row space-->4
int star=1;//write no of stars in first row
int space=4;
for(int i=1;i<=5;i++)//outer for loop used for  row
{
//for space
for(int j=1;j<=space;j++)// inner loop for coloumns
{
System.out.print(" ");
}
//for star
for(int k=1;k<=star;k++)
{
System.out.print("*");
}
star++; // increment in star
space--; // decrement in space
System.out.println();
}
}
}
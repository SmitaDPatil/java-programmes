package pattern;
public class Star_Box {
public static void main(String[] args) {
// *****
// *****
// ***** rows--> 3 Columns--> 5 how many stars in 1st row-->5
//row--> outer for loop
//columns-->inner for loop--> print in inner for loop
for(int i=1;i<=3;i++)
{
for(int j=1;j<=5;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
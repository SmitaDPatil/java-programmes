package pattern;
public class Triangle_Left_Ascending {
public static void main(String[] args) {
// *
// **
// ***
// ****
// ***** rows-->5 columns-->5 how many stars in 1st row-->1
int star=1;
for(int i=1;i<=5;i++)//1,2
{
for(int j=1;j<=star;j++)//1,2
{
System.out.print("*");
}
star++;//2
System.out.println();
}
}
}

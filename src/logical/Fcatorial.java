package logical;
import java.util.Scanner;
public class Fcatorial {
public static void main(String[] args)
{
//int number=3;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter number");
int number = sc.nextInt();
int fact=1;
//8*7*........1=?
for(int i=number;i>=1;i--)//8,7,6
{
//System.out.println(i);
fact=fact*i;
//8=8*1
//56=8*7
// =56*6
}
System.out.println("Factorial of "+number+" is "+fact);
}
}
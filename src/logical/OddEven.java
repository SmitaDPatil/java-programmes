package logical;
import java.util.Scanner;
public class OddEven {
public static void main(String[] args)
{
//int number=81;
Scanner sc= new Scanner(System.in);
System.out.println("Please enter number");
int number=sc.nextInt();
if(number%2==0)
{
System.out.println("Given number is Even");
}
else {
System.out.println("Given number is Odd");
}
}
}
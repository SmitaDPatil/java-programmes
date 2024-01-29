package logical;
import java.util.Scanner;
public class UserInput {
public static void main(String[] args)
{
// int a=5;
// int b=10;
// int sum=a+b;
// System.out.println("Sum is "+sum);
Scanner sc= new Scanner(System.in);
// System.out.println("Please enter value of a");
// int a=sc.nextInt();
//
// System.out.println("Please enter value of b");
// int b=sc.nextInt();
//
// int sum=a+b;
// System.out.println("Sum is "+sum);
//first name
//middle name
//last name
// your full name is
System.out.println("Please enter first name");
String firstName = sc.next();
System.out.println("Please enter middle name");
String middleName = sc.next();
System.out.println("Please enter last name");
String lastName = sc.next();
System.out.println("Your full name is "+firstName+" "+middleName+" "+lastName);



}
}
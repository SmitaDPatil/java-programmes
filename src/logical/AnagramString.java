package logical;
import java.util.Arrays;
public class AnagramString {
public static void main(String[] args)
{
String s="java";
String t="avaj";
char[] s1 = s.toCharArray();//['j','a','v','a']
char[] t1 = t.toCharArray();//['a','v','a','j']
Arrays.sort(s1);//['a','a','j','v']
Arrays.sort(t1);//['a','a','j','v']
boolean result = Arrays.equals(s1, t1);
if(result)
{
System.out.println("String is anagram");
}
else {
System.out.println("String is not anagram");
}
}
}
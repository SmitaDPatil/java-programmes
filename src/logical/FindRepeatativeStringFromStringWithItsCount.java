package logical;
import java.util.HashMap;
import java.util.Set;
public class FindRepeatativeStringFromStringWithItsCount {
public static void main(String[] args) {
String str="abc abc abq xyz lmn abc lmn xyz qwe";
HashMap<String, Integer> mp= new HashMap<>();
String[] ar = str.split(" ");//String ar[]={"abc "abc" "abq" "xyz" "lmn" "abc" "lmn" "xyz" "qwe"}

for(int i=0;i<=ar.length-1;i++)// traversing through array

{
String temp = ar[i];//0--> abc
if(mp.containsKey(temp))
{
mp.put(temp, mp.get(temp)+1);
}
else {
mp.put(temp, 1);
}
}
System.out.println(mp);
Set<String> keys = mp.keySet();
for(String k:keys)
{
System.out.println(k+" :"+mp.get(k));
}
}
}
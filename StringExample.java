public class StringExample
{
public static void main(String[]args)
{
String originalString="abcdcba";
StringBuilder  strBuilder=new StringBuilder(originalString);

String reverseString=strBuilder.reverse().toString();
boolean isPalindrame=originalString.equals(reverseString);

System.out.println(isPalindrame);
}
}
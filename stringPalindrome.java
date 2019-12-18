import java.io.*;
class stringPalindrome
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the string");
String str=br.readLine();
String temp =str;

StringBuffer sb=new StringBuffer(str);
sb.reverse();

str=sb.toString();
if(temp.equalsIgnoreCase(str))

System.out.println(temp+"is palindrome\n");
else System.out.println(temp+"is not a palindrome");
}
}
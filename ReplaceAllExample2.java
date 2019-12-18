import java.io.*;
public class ReplaceAllExample2
{
public static void main(String [] args)
{
String s1="My name is khan .My name is Bob.My name is Sonoo.";
//String replaceString=s1.replaceAll("is" ,"was");

String replaceString=s1.replaceAll("\\sx","");
System.out.println(replaceString);
}
}
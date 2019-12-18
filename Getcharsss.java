import  java.io.*;
public class Getcharsss
{
public static void main(String args[])
{
StringBuffer str=new StringBuffer("A SMOOTH SEA NEVER MAKES SKILLFULL");
System.out.println("Orange stringBuffer is:"+str);

char[]target=new char[15];
str.getChars(9,24,target,0);

String myString=new String (target);
StringBuffer alteredString=new StringBuffer(myString);

System.out.println("now altered StringBuffer is:"+alteredString);
}
} 
import java.io.*;
class ExceptionThrows
{
public static void main(String args[])throws IOException
{
String str="";
InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
System.out.println("Enter the text:");
while(!str.equals("quit"))
{
str=br.readLine();
System.out.println("Your input"+str);
}
}
}
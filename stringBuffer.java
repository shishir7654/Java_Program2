import java.io.*;
class stringBuffer
{
public static void main(String[] args)throws IOException
{
StringBuffer sb=new StringBuffer();
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.print("Enter surname:");
String sur=br.readLine();

System.out.println("Enter middlename");
String md=br.readLine();

System.out.println("Enter lastname");
String last=br.readLine();

sb.append(sur);
sb.append(last);

System.out.println("Name="+sb);
int n=sur.length();
sb.insert(n,md);

System.out.println("full name="+sb);
System.out.println("In reverse="+sb.reverse());
}
}
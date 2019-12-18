import java.io.*;
public class forexample6
{
public static void main(String[] args)throws IOException
{
 int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the table of n:");
n=Integer.parseInt(br.readLine());

	for(int i=1;i<=10;i++)
	{
	System.out.println("Table is:"+i*n);
}}}

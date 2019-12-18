import java.io.*;
public class forexample4
{
public static void main(String[] args)throws IOException
{
 int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the value of n:");
n=Integer.parseInt(br.readLine());

	for(int i=n;i>=1;i--)
	{
	System.out.println(i);
	}}}
import java.io.*;
public class forexample5
{
public static void main(String[] args)throws IOException
{
 int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the value of n:");
n=Integer.parseInt(br.readLine());

System.out.print("Even number from:" +n);
 for(int i=1;i<=n;i++)
{
if(i%2==0)
{
System.out.println("print" +i*i);
}}}}

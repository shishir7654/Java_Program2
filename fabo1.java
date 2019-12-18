import java.util.Scanner;
class fabo1
{ 
int n,i,k;
public
static int fibo(int n)
{
if(n==0||n==1)
return n;

else
return(fibo(n-2)+fibo(n-1));
}
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number ");
int k,i;
int n=sc.nextInt();
for(i=0;i<n;i++)
{
System.out.print(" "+fibo(i));
}
}}
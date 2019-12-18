import java.io.*;
class Larger
{
private
  int a,b;
public 
  void get()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the two value of a & b");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
}
 void larger1()
{
if (a>b)
 System.out.print(a);
else
System.out.print(b);
}
public static void main(String arge[])throws IOException
{
Larger r1=new Larger();
r1.get();
r1.larger1();
}
}
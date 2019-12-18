import java.io.*;
class ExceptionFinally
{
public static void main(String args[])
{
int a=(int)(Math.random()*5);
System.out.println("value of a is :"+a);
try
{
int b=50/a;
System.out.println("Value of b is"+b);
System.out.println("inside try......");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("catch block"+e.toString());
}
finally
{
System.out.println("inside finally");
}
}
}
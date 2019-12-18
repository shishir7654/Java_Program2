import java.io.*;
class Exceptionss8
{
public static void main(String args[])
{
int a='h';
System.out.println("value of a is:"+a);
try
{
int  b=50/a;
System.out.println("Value of b:"+b);
System.out.println("welcome back");
}
/*
catch(ArithmeticException e)
{
System.out.println("we r in catch block "+e.toString());
}
*/
catch(NumberFormatException e1)
{
System.out.println("Shishir"+e1);
}
}
}
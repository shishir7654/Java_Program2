class Exceptionss1
{
public static void main(String [] args)
{
try
{
 System.out.println("Open files");
//int n=args.length;
int n=5;

System.out.println("n="+n);
int a=45/n;

System.out.println("a="+a);
int b[]={10,20,30};
//b[50]=100;
b[2]=100;
}
catch(ArithmeticException ae)
{
 System.out.println(ae);
System.out.println("Please pass data while running this program");
}
catch(ArrayIndexOutOfBoundsException aie)
{
aie.printStackTrace();
System.out.println("please see that the array index is within the range:");
}
finally
{
System.out.println("Close files");
}
}
}
import java.util.Scanner;
class Input
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.print("Enter x & y");
int x,y,z;
x=sc.nextInt();
y=sc.nextInt();
z=x+y;
System.out.print("Addition is"+z );
}
}
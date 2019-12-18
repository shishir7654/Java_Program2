import java.util.Scanner;
 class Mark
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the three sub marks");
int m1,m2,m3,per;
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
per=(m1+m2+m3)*100/300;
System.out.print("Percentage is"+per);
}
}
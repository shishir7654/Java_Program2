class First
{
public
void disp()
{
System.out.print("This is first");
}
}
class Second extends First
{
public
void disp()
{
System.out.print("This is second");
}
public static void main(String arge[])
{
Second r1=new Second();
r1.disp();
}
} 
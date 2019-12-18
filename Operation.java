import java.io.*;     //call by value
class Operation
{
int data=50;
int change(int data)
{
data=data+100;
return data;
}
public static void main(String[]args)
{
Operation op=new Operation();
System.out.println("before change"+op.data);
int k=op.change(500);
System.out.println("after change"+k);
}
}
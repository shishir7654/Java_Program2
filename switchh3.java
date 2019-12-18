import java.io.*;
class switchh3
{
public static void main(String[]args)throws IOException
{
int num;
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the choice of mounth");
num=Integer.parseInt(br.readLine());

switch(num)
{
case 1:
System.out.print("January");
break;
case 2:
System.out.print("February");
break;
case 3:
System.out.print("March");
break;
default:
System.out.print("not exit");

}
}
}
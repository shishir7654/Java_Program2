import java.io.*;
class Maxarray
{
public static void main(String arge[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x[]=new int[10];
int i,max;
System.out.print("Enter data");
for(i=0;i<10;i++)
{

x[i]=Integer.parseInt(br.readLine());
}
max=x[0];
for(i=0;i<10;i++)
{
if(x[i]>max)
max=x[i];

}
System.out.print("Maximum data is"+max);
}
}

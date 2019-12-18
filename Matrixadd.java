import java.io.*;
class Matrixadd
{
public static void main(String arge[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x[][]=new int[3][3];
int i,j,sum=0;
System.out.print("Enter data");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{				
x[i][j]=Integer.parseInt(br.readLine());
//sum=sum+x[i][j];
}
}
System.out.println("Matrix of element is");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(" "+x[i][j]);
sum=sum+x[i][j];

}
System.out.println();
}
System.out.print("sum is"+sum);
}
}
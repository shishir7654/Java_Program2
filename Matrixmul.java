import java.io.*;
class Matrixmul
{
 public static void main(String arge[])throws IOException
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );

       int x[][]=new int[3][3];
       int y[][]=new int[3][3];
       int z[][]=new int[3][3];
      int i,j,k,sum=0;
      System.out.print("Enter data of  first matrix");
      for(i=0;i<3;i++)
       {
        for(j=0;j<3;j++)
          {				
           x[i][j]=Integer.parseInt(br.readLine());
          }
       }
      System.out.println("Matrix of first element is");
      for(i=0;i<3;i++)
        {
         for(j=0;j<3;j++)
          {
             System.out.print("  "+x[i][j]);
          }
         System.out.println();
        }
     System.out.print("Enter data of  second matrix");
     for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
          {				
            y[i][j]=Integer.parseInt(br.readLine());
          } 
        }
     System.out.println("Matrix of second element is");
     for(i=0;i<3;i++)
       {
        for(j=0;j<3;j++)
          {
     System.out.print("  "+y[i][j]);
       }
      System.out.println();
       }
       System.out.print("Mul of matrix\n");
     for(i=0;i<3;i++)
        {
     for(j=0;j<3;j++)
       {
       for(k=0;k<3;k++)
         {
       z[i][j]=x[i][k]*y[j][k];
         }
         System.out.print(" "+z[i][j]);
          }
         System.out.println(" ");}
       }}
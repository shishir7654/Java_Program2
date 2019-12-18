import java.io.*;
class Single
{
   private
   int x,y;
   public
   void get()throws IOException
      {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the value of x,y");
    x=Integer.parseInt(br.readLine());
    y=Integer.parseInt(br.readLine());
      }
   int larger() 
     {
     if(x>y)
     return x;
     else
     return y;
      }
	}
     class Single1 extends Single 
      {
       private
       int z;
       public
       void get1()throws IOException
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of z:");
       z=Integer.parseInt(br.readLine());
      }
      void larger1()
      {
     if(larger()>z)
       System.out.print("Largest number is"+larger());
	else
	System.out.print("Largest number is"+z);
	}
     public static void main(String arge[])throws IOException
     {
     Single1 d1=new Single1();
     d1.get();
     d1.get1();
     d1.larger1();
   }
   }
  

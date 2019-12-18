import java.io.*;
class First
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
     class Second extends First 
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
      int larger1()
      {
     if(larger()>z)
      return larger();
	else
	return z;
	}
	}
	class InheriThird extends Second
	{
	private
	int w;
        public
	void get2()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of w:");
       w=Integer.parseInt(br.readLine());
	}
	void larger2()
	{
	if(larger1()>w)
	System.out.print("Largest number is"+larger1());
	else
	System.out.print("Largest number is"+w);
	}
     public static void main(String arge[])throws IOException
     {
      	InheriThird d1=new InheriThird();
     d1.get();
     d1.get1();
	d1.get2();
     d1.larger2();
   }
   }
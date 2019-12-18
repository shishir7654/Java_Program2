import java.io.*;
class Rect
{
   private
   int len,bre,hei,a;
   public
   void get()throws IOException
      {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the value of l,b");
    len=Integer.parseInt(br.readLine());
    bre=Integer.parseInt(br.readLine());
      }
   int area() 
     {
     a=len*bre;
     return a;
     }}
     class Inheribox extends Rect 
      {
       private
       int hei,v;
       public
       void get1()throws IOException
      {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of hei:");
       hei=Integer.parseInt(br.readLine());
      }
      void volume()
       {
          v=area()*hei;
     System.out.println("Volume of box is\n"+v);
       }
     public static void main(String arge[])throws IOException
     {
     Inheribox d1=new Inheribox();
     d1.get();
	d1.get1();
     int k=d1.area();
        System.out.print("Area of rectangle is"+k);
          d1.volume();
         }
        }
	
import java.io.*;
class studid
{
   private
   int id;
   public
   void get()throws IOException
      {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the value of id");
    id=Integer.parseInt(br.readLine());
      }
	void display()
	{
	System.out.println("Student id is"+id);
	}
	}

     class stud1 extends studid 
      {
       private
       int p,c,m,per;
       public
       void get1()throws IOException
      {
	get();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of p,c,m:");
       p=Integer.parseInt(br.readLine());
	c=Integer.parseInt(br.readLine());
	m=Integer.parseInt(br.readLine());
      }
      void percent()
      {
	display();
	per=(p+c+m)*100/300;
	System.out.println("Student1 percentage is"+per);
	}
	}

	class stud2 extends studid
	{
	  int p,c,m,per;
       public
       void get2()throws IOException
      {
	get();
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       System.out.print("Enter the value of p,c,m:");
       p=Integer.parseInt(br.readLine());
	c=Integer.parseInt(br.readLine());
	m=Integer.parseInt(br.readLine());
      }
      void percent1()
      {
	display();
	per=(p+c+m)*100/300;
	System.out.println("Student1 percentage is"+per);
	}
	}

	class result
	{
     public static void main(String arge[])throws IOException
     {
      	stud1 d1=new stud1();
	stud2 s1=new stud2();
     d1.get1();
     s1.get2();
	d1.percent();
	s1.percent1();
}
}
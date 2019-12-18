import java.io.*;
class Rect
{
private
    int len,bre,ar;
public
  void get()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Enter len &bre");
len=Integer.parseInt(br.readLine());
bre=Integer.parseInt(br.readLine());
}
void show()
{
ar=len*bre;
System.out.print("Area is"+ar);
}
public static void main(String arge[])throws IOException
{
Rect r1=new Rect();
r1.get();
r1.show();
}
}
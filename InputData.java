import java.io.*;
class InputData
{
public static void main(String arge[])throws IOException

 {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int x,y,z;
System.out.print("Enter x & y");
x=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
  z=x+y;
System.out.print("Addition is"+z);
}
}


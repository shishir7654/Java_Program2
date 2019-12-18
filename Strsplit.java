class Strsplit
{
public static void main(String[] args)
{
String str="Hello,this is a book on java";
String s[];
s=str.split(" "); //split the space
for (int i=0;i<s.length;i++)
System.out.println(s[i]);
}
}
class stringall
{
public static void main(String[] args)
{
String s1="a book on java";
String s2=new String("i like it");
char arr[]={'d','r','e','a','m'};
String s3=new String(arr);
System.out.println(s1); 
System.out.println(s2); 
System.out.println(s3); 
System.out.println("length of s1="+s1.length()); 
System.out.println("s1 and s2 joined "+s1.concat(s2)); 
System.out.println(s1+"from "+s3);
boolean x=s1.startsWith("A");
if(x)
{
System.out.println("s1 starts with \'A\'");
}
else
{
System.out.println("s1 does not starts with\'a\'");
}
String p=s2.substring(0,7);
String q=s3.substring(0,5);
System.out.println(p+q);
System.out.println("Upper s1="+s1.toUpperCase());
System.out.println("lower s2="+s2.toLowerCase());	

}
}
 

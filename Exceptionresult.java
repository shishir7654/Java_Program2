class Exceptionss4
{
 public
	static void display()
	{
	try
	{
	System.out.println("This is message");
	throw new NullPointerException("it is my message");
	}
	catch(NullPointerException e)
	{
	System.out.println(e);
	}
	}
}
	class Exceptionresult
	{
	public static void main(String args[])
	{
	Exceptionss4.display();
	}
	}
package exceptionHandling;

public class MainClass2
{

	public static void main(String[] args)
	{
		fun1();

	}
	
	public static void fun1()
	{
		System.out.println("Before Calling");
		
		try
		{
			fun2();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" Danger Occured");
		}
		
		System.out.println("After Calling");
	}
	
	public static void fun2() throws ArithmeticException
	{
		// Throwing a exception
		boolean isdanger = true;
		if(isdanger)
		{
			throw new ArithmeticException("Write Message otherwise No Message");
		}
	}

}

package exceptionHandling;

public class MainClass
{

	public static void main(String[] args)
	{
		
		try
		{
			// Try commenting one paragraph
			
			int ar[] = new int[5];
			ar[6] = 5;            // IndexOutOfBounds Exception
			
			int a=5,b=0;
			int c = a/b;          // Arithetic Exception
			System.out.println(c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" : Arithmetic Exception");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println(ex.getClass()+":"+ex.getMessage());
		}
		catch(Exception e)             // If no exception match     default
		{
			System.out.println(e.getMessage()+" :Default Exception");
		}
		finally
		{
			System.out.println("Always Executed");
		}
		
		System.out.println("Remaining codes are working fine");

	}

}

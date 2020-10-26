package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		int a=4,b=10,c=5,result;
		
		if(a>b)
		{
			if(a>c)
			{
				result = a;
			}
			else
			{
				result = c;
			}
		}
		else
		{
			if(b>c)
				result = b;
			else
				result = c;
		}
		
		// Ternery Operator
		
		result = (a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("Largest number "+result);
}
}
package lambdaExpression;
import java.lang.FunctionalInterface;

@FunctionalInterface
interface MyInterface1
{
	double getPiValue();
}

@FunctionalInterface
interface MyInterface2
{
	String reverse(String s);
}

public class MainClass
{

	public static void main(String[] args)
	{
		MyInterface1 ref1;
		ref1 = () -> 3.1415;
		System.out.println("Pi Value: "+ref1.getPiValue());
		
		MyInterface2 ref2;
		ref2 = (str) -> {
			String res = "";
			for(int i = str.length() -1; i>=0; i--)
			{
				res += str.charAt(i);
			}
			return res; 
		};
		
		System.out.println("Reversed: "+ref2.reverse("Akash"));
	}

}

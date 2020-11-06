package methods;

public class Introduction
{

	public static void main(String[] args)
	{
		int a=10, b=20;
		
		// Max of two
		int result = maxOf(a,b);
		System.out.println(result);
		
		// Swapping numbers
		swap(a,b);
		System.out.println("In main"+ a+" "+ b);
		
		// void call
		sayHi();
		
		// Max of three
		int  r = maxOf(7,6,9);
		System.out.println("Max of three "+ r);
		
		// float typecasting
		float rf = maxOf(5);
		System.out.println("Float value "+rf);
	}
	
	static int maxOf(int a, int b)
	{
		if(a>b)
			return a;
		else
			return b;
	}
	
	static int maxOf(int a, int b, int c)
	{
		return (a>b)?(a>c?a:c):(b>c?b:c);
	}
	
	static float maxOf(float x)
	{
		return x;
	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("In swap method"+ a +" "+ b);
	}
	
	static void sayHi()
	{
		System.out.println("Hi Guys");
	}
}

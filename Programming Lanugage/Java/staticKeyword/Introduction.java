package staticKeyword;

import staticKeyword.A.B;
import staticKeyword.A.C;

public class Introduction
{
	static
	{
		System.out.println("In block 1");
	}
	
	static
	{
		System.out.println("In block 2");
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("In Main");
		System.out.println();
		System.out.println("Hello");
		
		
		A objA = new A();
		B objB = objA.new B();
		
		C objc = new C();
	}
	
	static
	{
		System.out.println("In block 3");
	}
}
package polymorphism;

public class MainClass
{

	public static void main(String[] args)
	{
		// Run-Time Polymorphism achieved through method overriding
		Dog d = new Dog();
		d.walk();
		// Child walk() method will be invoked
		Pet p = d;
		p.walk();
		
		// Overloading does not apply on variables
		System.out.println(d.name);
		System.out.println(p.name);
		
		
		
		// Compile-Time Polymorphism achieved through method overloading
		greet();
		greet("Code Hard");
		greet("Akash",3);

	}
	
	public static void greet()
	{
		System.out.println("Hi, There");
	}
	
	public static void greet(String msg)
	{
		System.out.println("Your msg: "+msg);
	}
	
	public static void greet(String name, int c)
	{
		for(int i = 0; i < c; i++)
		{
			System.out.println(name+" Good Morning");
		}
	}

}

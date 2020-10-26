package inheritance;

// Parent Class or Super Class
public class Person
{
	protected String name;
	
	// Constructor
	public Person(String name)
	{
		this.name = name;
	}
	
	public void walk()
	{
		System.out.println(name+" is walking");
	}
	
	
	public void eat()
	{
		System.out.println(name+" is eating");
	}
	
	
	// static methods can't be overriden in child class
	static void heat()
	{
		System.out.println("Static is heating");
	}

}

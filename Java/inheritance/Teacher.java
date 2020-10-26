package inheritance;

// Child class or Sub class
public class Teacher extends Person
{
	
	public Teacher(String name)
	{
		super(name);
	}
	
	public void teach()
	{
		System.out.println("Teacher is teaching");
	}
	
	
    //  Method overriding eat() is already available in parent class
	public void eat()
	{
		// super keyword is used to access parent variables and methods in child class
		super.eat();
		System.out.println("Teacher do not like to eat");
		
		super.name = "Hello";
	}
}

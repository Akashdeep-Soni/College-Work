package inheritance;

//Child class or Sub class
public class Singer extends Person
{
	// if the constructor is defined in parent class then it should also be defined in child class
	public Singer(String name)
	{
		super(name);
	}


	public void sing()
	{
		System.out.println("Person is singing");
	}
	
	
	// modifying protected data in subclass
	public void setName(String name)
	{
		this.name = name;
	}
}

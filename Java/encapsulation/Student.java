package encapsulation;

public class Student
{
	private int age;
	private String name;
	
	
	// setter
	public void setAge(int age)
	{
		if( age > 20)      // Condition
			System.out.println("You are very old to be in school");
		else
			this.age = age;
	}
	
	// getter
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

	

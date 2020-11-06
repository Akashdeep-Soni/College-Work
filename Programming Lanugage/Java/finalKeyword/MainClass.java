package finalKeyword;

public class MainClass extends Student
{
	// Blank final variable is not allowed under class
	final int ROLL_NO = 4;
	
	
//	Gives Error if we try to override using inheritence
//	public void getDetail()
//	{
//		System.out.println("Overriding I am Student");
//	}

	public static void main(String[] args)
	{
		// Blank final variable is allowed in method as local variable
		final String name;
		name = "Akash";
		System.out.println(name);
		
		final Student obj1 = new Student();
		obj1.getDetail();
		Student obj2 = new Student();	
		obj2.getDetail();
		
//		obj1.name = "Hello";              final obj1 variable attribute can be changed
//		obj1 = obj2;                      final obj1 variable can't be assigned
		
		MainClass mobj = new MainClass();
		mobj.getDetail();           // Accessing Student getDetail()
		

		
	}

}

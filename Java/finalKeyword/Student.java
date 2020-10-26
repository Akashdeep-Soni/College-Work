package finalKeyword;

// public final class Student
// Using final in class will not let other class extend (Not allowed to make subclass further)

public class Student
{
	// Blank final variable  (Without initialization)
	final int roll_no;
	String name;
	
	// Initializer Block        only block
	{
		roll_no = 4;
		name = "Akash";
	}
	
	// final method
	public final void getDetail()
	{
		System.out.println("I am Student "+name+" "+roll_no);
	}
}

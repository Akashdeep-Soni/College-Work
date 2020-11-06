package encapsulation;

public class Introduction
{

	public static void main(String[] args)
	{
		Student stud = new Student();
		
		stud.setAge(15);
		System.out.println(stud.getAge());
		
		stud.setName("Akash");
		System.out.println(stud.getName());

	}

}

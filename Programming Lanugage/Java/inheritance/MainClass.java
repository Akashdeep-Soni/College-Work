package inheritance;

public class MainClass
{

	public static void main(String[] args)
	{
		Teacher t = new Teacher("Harry");
		t.eat();
		t.walk();
		t.teach();
		System.out.println();
		
		Singer s = new Singer("Akash");
		s.eat();
		s.sing();
		s.setName("Bhuddu");
		s.walk();
		
	}

}

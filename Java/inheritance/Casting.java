package inheritance;

public class Casting
{

	public static void main(String[] args)
	{
		// Upcasting
		Teacher t = new Teacher("Akash");
		Person p = t;   
		
		
		// Downcasting will only happen if already upcasted in parent class
		Teacher t1 = new Teacher("Akash");
		Person pn = t1;
		Teacher tn = (Teacher)pn;
		
		// instanceof     returns boolean
		Singer s = new Singer("Akash");
		
		System.out.println(t instanceof Teacher);
		System.out.println(t instanceof Person);
		System.out.println(p instanceof Teacher);
		System.out.println(p instanceof Singer);
	}

}

package methods;

public class PassByValue
{

	public static void main(String[] args)
	{
		// Primitve Data Type
		int c = 34;
		int d = 12;
		
		swap(c,d);
		
		System.out.println("In main "+c+" "+d);
		
		// Non-Primitive Data Type
		Dog d1 = new Dog();
		d1.legs = 3;
		Dog d2 = new Dog();
		d2.legs = 4;
		
		swap(d1, d2);
		System.out.println("In Main "+d1.legs+" "+d2.legs);
		
		// Change value update
		Dog d3 = new Dog();
		changeLegs(d3);
		System.out.println("D1 legs "+d3.legs);
		
		// Dog
		Dog d4 = new Dog();
		d4.legs = 4;
		d4.leg();

	}
	
	static void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("In Swap "+a+" "+b);
	}
	
	// Method overloading
	static void swap(Dog a, Dog b)
	{
		Dog temp = a;
		a = b;
		b = temp;
		System.out.println("In Swap "+a.legs+" "+b.legs);
		a.legs=10;
		System.out.println("In Swap "+a.legs+" "+b.legs);
	}
	
	static void changeLegs(Dog x)
	{
		x.legs = 10;
	}

}

class Dog
{
	int legs;
	
	public void leg()
	{
		System.out.println("Total legs "+legs);
	}
}

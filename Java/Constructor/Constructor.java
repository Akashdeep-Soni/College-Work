package Constructor;
class table
{
	int height;
	// no need to create consturctor in case of default
}

class vehicle
{
	int wheels;
	vehicle()
	{
		wheels = 5;
	}
}

class desktop
{
	int ram;
	String cpu;

	desktop(int RandomAccessMemory)
	{
		ram = RandomAccessMemory;
	}
	
	// Constructor Overloading
	desktop(int RandomAccessMemory, String CentralProcessingUnit)
	{
		ram = RandomAccessMemory;
		cpu = CentralProcessingUnit;
	}
	
}

class smartphone
{
	boolean touch;
	int storage;
	int ram = 4;
	
	// Use this keyword for same variable name
	smartphone(boolean touch_screen, int storage)
	{
		touch = touch_screen;
		this.storage = storage;
	}
}

public class Constructor
{
	Constructor()
	{
		System.out.println("Hello, Welcome to the world of Java");
		System.out.println();
	}

	public static void main(String[] args)
	{
		// creating self class
		Constructor temp = new Constructor();
		
		/*
		 * Constructor are like method having no return type
		 * There are three types of constructor
		 * After creating a constructor there is no default constructor
		 * */
		
		
		// 1. Default Constructor   0 or null is assigned to class variables
		table table1 = new table();
		System.out.println("Before Assigning Height "+table1.height);
		table1.height = 10;
		System.out.println("After Assigning Height "+table1.height);
		System.out.println();
		
		// 2. No Argument Constructor
		vehicle car = new vehicle();
		System.out.println("Before modifying Wheels "+car.wheels);
		car.wheels = 15;
		System.out.println("After modifying Wheels "+car.wheels);
		System.out.println();
		
		// 3. Parameterized Constructor
		desktop pc1 = new desktop(4);
		System.out.println(pc1.ram + " " + pc1.cpu);
		desktop pc2 = new desktop(8,"Intel");
		System.out.println(pc2.ram + " " + pc2.cpu);
		System.out.println();
		
		// this keyword for using same variable name
		smartphone vivo = new smartphone(true,32);
		System.out.println("Touch Enabled: "+vivo.touch+"\nStorage Capacity: "+vivo.storage+"\nRam: "+vivo.ram+"GB");
		
		
	}

}

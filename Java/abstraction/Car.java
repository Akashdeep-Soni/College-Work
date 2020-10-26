package abstraction;

// Abstract Class
public abstract class Car
{
	// Abstract methods must be overridden in child class
	
	//Abstract methods (Without body)
	public abstract void acelerate();
	public abstract void breaking();
	
	
	// Concrete Method (Normal Method)
	public void honk()
	{
		System.out.println("Car is honking");
	}
}

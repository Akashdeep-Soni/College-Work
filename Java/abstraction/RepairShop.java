package abstraction;

public class RepairShop
{
	
	public static void repair(Car car)
	{
		car.acelerate();
		System.out.println("Car Repaired");
		car.honk();
		System.out.println();
	}
	

	public static void main(String[] args)
	{
		WagonR wagonR = new WagonR();
		Audi audi = new Audi();
		
		repair(wagonR);
		repair(audi);
		
//		Abstract classes can't be instantiated
//		Car c = new Car();
	}

}

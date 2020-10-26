package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		
//		Automatic Typecasting
		
		byte x = 4;
		
		int y = x;
		
		double z = x;
		
		System.out.println(x);
		System.out.println(z);
		
//		Manual Typecasting
		
		double myDouble = 3.13254;
		
		int myInt = (int)myDouble;
		
		System.out.println(myInt);
		
		System.out.println(myDouble);

	}

}

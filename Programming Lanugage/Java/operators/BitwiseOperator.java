package operators;

public class BitwiseOperator {

	public static void main(String[] args) {

		int a = 10;
		int b = 13;
		int c = a&b;
		int d = a|b;
		int e = a^b;
		int f = a<<1; //Multiplied by 2 one times
		int g = a>>1; //Divided by 2 one times
		
		System.out.println(f);
		System.out.println(g);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		//Assignment Operator
		a+=2;
		
		System.out.println(a);
	}

}

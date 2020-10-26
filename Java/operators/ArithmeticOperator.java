package operators;

public class ArithmeticOperator {

	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		
		int c = a * a + b * b + 2 * a * b;
		
		int d = (a+b) * (a+b);
		
		double e = (double)b/a;
		
		int f = b%a;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		int g = a++;
		
		int h = ++b;
		
		System.out.println(g+" "+a);
		System.out.println(h+" "+b);
		
		

	}

}

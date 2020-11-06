package loops;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,n;
		System.out.println("Enter number of fibonacci numbers:");
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		System.out.print(a+" "+b);
		for(int i=0; i<n-2; i++)
		{
			  c = a + b;
			  a = b;
			  b = c ;
			  System.out.print(" "+c);
			  
		}
		
	}

}

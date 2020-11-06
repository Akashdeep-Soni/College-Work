package whileLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		
		do
		{
			System.out.println("No. " + n);
			n = sc.nextInt();
		} while( n != 0);
		
		System.out.println("Happy Happy");

	}

}

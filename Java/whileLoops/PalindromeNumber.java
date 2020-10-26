package whileLoops;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int rev=0,temp,n = sc.nextInt();
		temp = n;
		while (temp > 0)
		{
			rev= rev*10 + temp%10;
			temp/=10;
		}
		if(n == rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
	}

}

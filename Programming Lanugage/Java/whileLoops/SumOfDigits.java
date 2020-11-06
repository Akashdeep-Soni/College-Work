package whileLoops;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int temp, r = 0;
		temp = n;
		while( n != 0)
		{
			r+=n%10;
			n/=10;
		}
		
		System.out.println("Sum of digits : "+r);
		
		int noOfDigits = (int)Math.log10(temp)+1;
		
		System.out.println("No. of digits "+noOfDigits);

	}

}

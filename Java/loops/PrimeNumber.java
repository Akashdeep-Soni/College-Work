package loops;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number n:");
		int n = sc.nextInt();
		
		boolean f = true;
		for(int i = 2; i * i <= n; i++)
		{
			if(n%i == 0)
			{
				f = false;
				break;
			}
		}
		if(n !=1 && f == true)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");
	}

}

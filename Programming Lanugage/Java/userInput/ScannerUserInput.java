package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		float y = sc.nextFloat();
		
		System.out.println(x);
		
		System.out.println(y);
		
		String hello = sc.nextLine();
		
		System.out.println(hello);

	}

}

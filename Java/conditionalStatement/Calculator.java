package conditionalStatement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b, result=0;
		System.out.println("Enter First Number:");
		a = sc.nextInt();
		System.out.println("Enter Second Number:");
		b = sc.nextInt();
		
		char operation = sc.nextLine().charAt(0);
		
		switch(operation)
		{
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
		default:
			System.out.println("Invalid Operation");
		}
	}

}

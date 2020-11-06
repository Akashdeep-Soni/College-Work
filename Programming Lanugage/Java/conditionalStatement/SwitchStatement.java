package conditionalStatement;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		System.out.print("Enter the day:");
		day = sc.nextInt();
		
		switch(day)
		{
		case 1:
		case 2:
			System.out.println("I'm on leave");
			break;
		case 3:
			System.out.println("I'm on vacation");
			break;
		default:
			System.out.println("I'm Vella");
		}
	}
}
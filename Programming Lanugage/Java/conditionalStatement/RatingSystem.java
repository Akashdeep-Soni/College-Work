package conditionalStatement;

import java.util.Scanner;

public class RatingSystem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rating:");
		int val = sc.nextInt();
		
		switch(val)
		{
		case 1:
		case 2:
			System.out.println("Bad Rating");
			break;
		case 3:
			System.out.println("Average Rating");
			break;
		case 4:
		case 5:
			System.out.println("Good Rating");
			break;
		default:
			System.out.println("Invalid Rating");
		}
	}

}

package array;

import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows and Cols :");
		int rows = sc.nextInt() , cols = sc.nextInt();
		
		int[][] a,b,c;
		a = new int[rows][cols];
		b = new int[rows][cols];
		c = new int[rows][cols];
		
		System.out.println("Enter first Matrix:");
		for(int i=0; i<rows; i++)
		for(int j=0; j<cols; j++)
			a[i][j] = sc.nextInt();
		
		System.out.println("Enter second Matrix:");
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				b[i][j] = sc.nextInt();
		
		for(int i=0; i<rows; i++)
			for(int j=0; j<cols; j++)
				c[i][j] = a[i][j] + b[i][j];
		
		System.out.println("Addition Matrix:");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

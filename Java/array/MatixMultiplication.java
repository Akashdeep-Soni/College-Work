package array;

import java.util.Scanner;

public class MatixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows and Cols for Matrix 1 :");
		int rows1 = sc.nextInt() , cols1 = sc.nextInt();
		
		System.out.println("Enter Rows and Cols for Marix 2:");
		int rows2 = sc.nextInt() , cols2 = sc.nextInt();
		
		if( cols1 == rows2)
		{
			int[][] a,b,c;
			a = new int[rows1][cols1];
			b = new int[rows2][cols2];
			c = new int[rows1][cols2];
			
			System.out.println("Enter first Matrix:");
			for(int i=0; i<rows1; i++)
			for(int j=0; j<cols1; j++)
				a[i][j] = sc.nextInt();
			
			System.out.println("Enter second Matrix:");
			for(int i=0; i<rows2; i++)
				for(int j=0; j<cols2; j++)
					b[i][j] = sc.nextInt();
			
			for(int i=0; i<rows1; i++)
				for(int j=0; j<cols2; j++)
				{
					int sum=0;
					for(int k=0; k<cols1; k++)
					{
						sum += a[i][k]*b[k][j];
					}
					c[i][j] = sum;
				}
					
			
			System.out.println("Multiplication Matrix:");
			for(int i=0; i<rows1; i++)
			{
				for(int j=0; j<cols2; j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("Invlaid Dimension");
		}
		
	}
}

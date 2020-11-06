package array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int b[][] = new int[2][3];
		
		int a[][] = {
				{1,2,3,4,5},
				{1,3,5},
				{2,1,4,3,5}
				};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
		System.out.println("Hello");
	}

}

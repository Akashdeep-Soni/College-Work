package patterns;

import java.util.Scanner;

public class InDePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int cols, rows = 2*n-1;
		
		for(int i=1; i<=rows; i++)
		{
			if(i<=n)
				cols=i;
			else
				cols=rows-i+1;
			for(int j=1; j<=cols; j++)
			{
				
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}

package array;

import java.util.Scanner;

public class StudentMarksAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size;
		
		System.out.println("How many students?");
		size = sc.nextInt();
		
		int sum_marks=0, stud_marks[] = new int[size];
		
		for(int i = 0; i<size; i++)
		{
			System.out.println("Enter "+(i+1)+" student marks: ");
			stud_marks[i] = sc.nextInt();
		}
		
		for(int i=0; i<stud_marks.length; i++)
		{
			sum_marks += stud_marks[i];
		}
		
		float avg = (float)sum_marks/size;
		
		System.out.println("Average Marks "+avg);

	}

}

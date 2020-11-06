package String;

import java.util.Scanner;

public class AnagramApproach3NTime2NSpace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array 1:");
		char ar1[] = sc.nextLine().toCharArray();
		
		System.out.println("Enter Array 2:");
		char ar2[] = sc.nextLine().toCharArray();
		
		if(ar1.length != ar2.length)
			System.out.println("Not Anagram");
		else
		{
			int[] ar1c = new int[256];
			int[] ar2c = new int[256];
			
			for(int i=0; i<ar1.length; i++)
			{
				int ix = (int) ar1[i];        // Converting char to int (ASCII)
				ar1c[ix]++;
			}
			
			for(int i=0; i<ar2.length; i++)
			{
				int ix = (int) ar2[i];        // Converting char to int (ASCII)
				ar2c[ix]++;
			}
			
			
			boolean isAnagram = true;
			for(int i=0; i<256; i++)
			{
				if(ar1c[i] != ar2c[i])
				{
					isAnagram = false;
					break;
				}
			}
			
			if(isAnagram == true)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}

	}

}

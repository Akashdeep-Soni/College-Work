package String;

import java.util.Scanner;

public class AnagramApproach2N2Time {

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
			boolean visited[] = new boolean[ar2.length];  // by default initialized with `false`
			for(int i=0; i<ar1.length; i++)
			{			
				for(int j=0; j<ar2.length; j++)
				{
					if(!visited[j] && ar1[i]==ar2[j])
					{
						visited[j]=true;
						break;
					}
				}
			}
			
			boolean isAnagram = true;
			for(boolean bool: visited)
			{
				if(!bool)
				{
					isAnagram = false;
					break;
				}
			}
			
			if( isAnagram)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}

	}

}

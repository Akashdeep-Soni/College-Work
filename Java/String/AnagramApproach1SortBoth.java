package String;
import java.util.Arrays;
import java.util.Scanner;
public class AnagramApproach1SortBoth {

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
			Arrays.sort(ar1);
			Arrays.sort(ar2);
			
			boolean isAnagram = true;
			
			for(int i=0; i<ar1.length; i++)
			{
				if(ar1[i] != ar2[i])
				{
					isAnagram = false;
					break;
				}
			}
			if(isAnagram)
				System.out.println("Anagram");
			else
				System.out.println("Not Anagram");
		}
	}

}

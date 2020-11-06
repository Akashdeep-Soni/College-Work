package String;

import java.util.Scanner;

public class StringBasic {

	public static void main(String[] args) {
		
		// Initializing already
		String s1[] = "Akash Hello World".split(" ");
		String s2 = "Akash";                                       // literals
		String s3[] = new String("Akash Deep Soni").split(" ");
		String s4 = new String("Akash");                           // objects
		
		// Indexing is not supported use `charAt`
		for(int i=0; i<s2.length(); i++)
			System.out.print(s2.charAt(i)+" ");
		
		System.out.println();
		for(String i: s3)
		System.out.println(i);
		
		
		// Taking input from console
		Scanner sc = new Scanner(System.in);
		String str[] = sc.nextLine().split(" ");
		
		for(String e: str)
			System.out.println(e);
		
		
		
	}

}

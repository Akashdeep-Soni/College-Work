package recursion;

import java.util.HashSet;
import java.util.Set;

public class StringPermutaion
{
	// To avoid duplicacy if same character in string
	static Set<String> present = new HashSet<>();
	
	public static void main(String[] args)
	{
		
		String s = "ABC";
		permute(s,0,s.length()-1);
	}
	
	public static void permute(String s,int l, int r)
	{
		if(l==r)
		{
			if(!present.contains(s))
			{
				present.add(s);
				System.out.println(s);
			}
		}
		else
		{
			for(int i=l; i<=r; i++)
			{
				s = swap(s,l,i);
				permute(s,l+1,r);
				s = swap(s,l,i);
			}
		}
		
	}
	
	public static String swap(String str,int i, int j)
	{
		char charAr[] = str.toCharArray();
		char temp = charAr[i];
		charAr[i] = charAr[j];
		charAr[j] = temp;
		return String.valueOf(charAr);
	}

}

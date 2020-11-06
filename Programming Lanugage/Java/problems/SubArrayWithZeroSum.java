package problems;

import java.util.HashSet;
import java.util.Set;

// Given an array, find if there exists a subarray with sum equals to zero.
public class SubArrayWithZeroSum
{

	public static void main(String[] args)
	{
		int a[] = {1,-2,1,3,2,4,2};
		int k = 5;      // k can be zero for equals to zero
		boolean found = false;
		
//      BruteForce		
//		for(int i=0; i<a.length; i++)
//		{
//			int sum = 0;
//			for(int j=i; j<a.length; j++)
//			{
//				sum += a[j];
//				System.out.println(i+" "+j+" "+sum);
//				if(sum == 0)
//				{
//					found = true;
//					break;
//				}
//			}
//			if(found)
//			{
//				System.out.println(found);
//				break;
//			}
//		}
		
		Set<Integer> s = new HashSet<>();
		int sum = 0;
		for(int e: a)
		{
			s.add(sum);
			sum += e;
			if(s.contains(sum-k))
			{
				System.out.println("Found");
				break;
			}
		}

	}

}

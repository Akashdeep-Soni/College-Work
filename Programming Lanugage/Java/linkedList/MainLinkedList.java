package linkedList;

import java.util.*;

public class MainLinkedList
{

	public static void main(String[] args)
	{
		List<Integer> l = new LinkedList<>();
		l.add(5);
		l.add(0,2);
		System.out.println(l);
		
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		// Easy Conversion using List<Integer>
		List<Integer>  temp;
		temp = ll;
		ll = al;
		al = temp;
		System.out.println(ll.getClass().getName());
		System.out.println(al.getClass().getName());
		
		getTimeDiff(ll);
		getTimeDiff(al);
		
	}
	
	public static void getTimeDiff(List<Integer> list)
	{
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 100000; i++)
		{
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() +" "+ (end - start));
	}
}

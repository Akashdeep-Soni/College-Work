package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MainQueue
{

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		System.out.println(q.peek());              // Returns Null if queue empty
		
		q.add(45);
		q.add(4);
		q.add(12);
		
		System.out.println(q);
		
		q.remove();
		
		System.out.println(q);
		System.out.println(q.element());          // Throws Exception if empty

	}

}

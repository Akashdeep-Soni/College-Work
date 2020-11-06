package priorityQueue;
import java.util.PriorityQueue;

public class MainPriorityQueue
{

	public static void main(String[] args)
	{
		// For String
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		
		System.out.println(pq.peek());
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
		
		
		// For Integer
		PriorityQueue<Integer> pqi = new PriorityQueue<>();
		pqi.add(45);
		pqi.add(100);
		pqi.add(12);
		pqi.add(1);
		
		System.out.println(pqi.peek());
		System.out.println(pqi);
		
		System.out.println(pqi.remove());
		System.out.println(pqi.remove());
		System.out.println(pqi.remove());
		System.out.println(pqi.remove());
	}

}

package deque;
import java.util.ArrayDeque;

public class MainDeque
{

	public static void main(String[] args)
	{
		// ArrayDeque as Stack
		ArrayDeque<Integer> ads = new ArrayDeque<>();
		ads.push(12);
		ads.push(23);
		ads.push(34);
		System.out.println(ads);
		System.out.println(ads.pop());
		System.out.println(ads.pop());
		System.out.println(ads.peek());
		
		
		// ArrayDeque as Doubly Ended Queue
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.addFirst(5);
		ad.addFirst(25);
		ad.addLast(100);
		ad.addLast(90);
		System.out.println(ad);
		System.out.println(ad.removeFirst()+" "+ad.removeFirst()+" "+ad.removeFirst());
		
		ad.addFirst(50);
		System.out.println(ad);
	}

}

package queue;

public class MyQueueTest
{

	public static void main(String[] args)
	{
		MyQueue<Integer> q = new MyQueue<>();
		
		q.enqueue(12);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		q.enqueue(45);
		q.enqueue(25);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}

}

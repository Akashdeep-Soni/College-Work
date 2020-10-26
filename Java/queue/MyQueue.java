package queue;

import linkedList.MyLinkedList;
import linkedList.MyLinkedList.Node;

public class MyQueue<G>
{
	private Node<G> head, rear;
	
	public void enqueue(G e)
	{
		Node<G> toAdd = new Node<>(e);
		
		if(head == null)
		{
			head = rear = toAdd;
			return;
		}

		rear.next = toAdd;
		rear = rear.next;
	}
	
	public G dequeue()
	{
		if(head == null)
		{
			return null;
		}
		
		Node<G> toRemove = head;
		head = head.next;
		
		if(head == null)
		{
			rear = null;
		}
		
		return toRemove.data;
		
	}
}

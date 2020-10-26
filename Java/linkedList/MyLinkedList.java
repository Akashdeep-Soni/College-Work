package linkedList;

// G for generic
public class MyLinkedList<G>
{

	Node<G> head = null;
	
	public static class Node<G>
	{
		public G data;
		public Node<G> next;
		public Node<G> prev;
		
		public Node(G data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public void insertNode(G data)
	{
		Node<G> toadd = new Node<G>(data);
		
		if(isEmpty())
		{
			head = toadd;
			return;
		}
		
		Node<G> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = toadd;
		
	}
	
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void print()
	{
		Node<G> temp = head;
		while(temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public G removeLast() throws Exception
	{
		
		Node<G> temp = head;
		
		if(isEmpty())
		{
			throw new Exception("List Is Empty No Pop Operation");
		}
		
		if(temp.next == null)
		{
			G val = temp.data;
			head = null;
			return val;
		}
		
		while(temp.next.next != null)
		{
			temp = temp.next;
		}
		Node<G> toRemove = temp.next;
		temp.next = null;
		return toRemove.data;
	}
	
	public G getLast() throws Exception
	{
		Node<G> temp = head;
		
		if(isEmpty())
		{
			throw new Exception("List Is Empty No Pop Operation");
		}
		
		while(temp.next != null)
		{
			temp = temp.next;
		}
		return temp.data;
	}

}

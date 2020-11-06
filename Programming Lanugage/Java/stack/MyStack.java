package stack;

import linkedList.MyLinkedList;

public class MyStack<E>
{
	MyLinkedList<E> sk = new MyLinkedList<>();
	
	void push(E data)
	{
		sk.insertNode(data);
	}
	
	E pop() throws Exception
	{
		if(sk.isEmpty())
		{
			throw new Exception("Stack is Empty No Pop Operation");
		}
		return sk.removeLast();
	}
	
	E peek() throws Exception
	{
		return sk.getLast();
	}
}

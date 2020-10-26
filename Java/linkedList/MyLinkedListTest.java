package linkedList;

public class MyLinkedListTest
{

	public static void main(String[] args)
	{
		MyLinkedList<String> ll = new MyLinkedList<>();
		ll.insertNode("20");
		ll.insertNode("Akash");
		
		for(int i = 0; i < 10 ; i++)
			ll.insertNode(i+"Hello");
		
		ll.print();

	}

}

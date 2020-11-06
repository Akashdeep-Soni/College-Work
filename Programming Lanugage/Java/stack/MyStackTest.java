package stack;

public class MyStackTest
{

	public static void main(String[] args) throws Exception
	{
		MyStack<Integer> stk = new MyStack<>();
		stk.push(45);
		stk.push(78);
		System.out.println(stk.pop());
		stk.push(100);
		System.out.println(stk.peek());
		
		System.out.println(stk.getClass().getName());
		

	}

}

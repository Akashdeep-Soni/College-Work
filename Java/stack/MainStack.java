package stack;

import java.util.Stack;
public class MainStack
{

	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack);
		
		System.out.println(stack.search(20));     // 1-based index from top of the stack
		System.out.println(stack.search(50));
		
		int popped = stack.pop();
		System.out.println(popped);
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		while(! stack.empty())
		{
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.empty());
		

	}

}
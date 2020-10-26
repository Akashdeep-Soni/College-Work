package lambdaExpression;

import java.util.List;
import java.util.ArrayList;

public class ForEach
{

	public static void main(String[] args)
	{
		List<Integer> a = new ArrayList<>();
		a.add(5);
		a.add(25);
		a.add(15);
		a.add(55);
		a.add(52);
		
		// Action to be applied on each element
		a.forEach((n) -> System.out.println(n));

	}

}

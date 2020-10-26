package stack;
import java.util.Vector;
public class MyVector
{

	public static void main(String[] args)
	{
		Vector<Integer> v = new Vector<>();
		v.add(45);
		v.add(2345);
		v.add(23);
		v.add(0,5);
		System.out.println(v+" Size "+v.size());
		
		v.remove(2);
		System.out.println(v);

	}

}

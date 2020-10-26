package set;
import java.util.*;
public class MainSet
{

	public static void main(String[] args)
	{
		// Original HashSet Constant Operation
		Set<String> s = new HashSet<>();
		s.add("Banana");
		s.add("Apple");
		s.add("Kiwi");
		System.out.println("HashSet "+s);
		
		// Ordered LinkedHashSet
		Set<String> sl = new LinkedHashSet<>();
		sl.add("Banana");
		sl.add("Apple");
		sl.add("Kiwi");
		System.out.println("LinkedHashSet "+sl);
		
		// Sorted TreeSet
		Set<String> st = new TreeSet<>();
		st.add("Banana");
		st.add("Apple");
		st.add("Kiwi");
		System.out.println("TreeSet "+st);
		System.out.println();
		
		
		Set<Integer> x = new HashSet<>();
		x.add(5);
		x.add(24);
		x.add(12);
		System.out.println(x.add(1));
		System.out.println(x.add(50));      // if added returns true
		System.out.println(x.add(24));      // if already present returns false
		System.out.println(x);
		x.remove(1);
		System.out.println("X Value "+ x);
		
		Set<Integer> y = new HashSet<>();
		y.add(7);
		y.add(24);
		y.add(12);
		y.add(34);
		y.add(78);
		System.out.println("Y Value "+ y);
		
		Set<Integer> z = new HashSet<>();
		z.add(7);
		z.add(24);
		System.out.println("Z Value "+ z);
		
		x.addAll(y);
		System.out.println("Union "+x);
		
		x.retainAll(z);
		System.out.println("Intersection "+x);
		
		System.out.println("Subset "+y.containsAll(z));
		System.out.println("Contains "+z.contains(24));
	}

}

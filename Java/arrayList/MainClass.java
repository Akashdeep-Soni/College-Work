package arrayList;

import java.util.ArrayList;
import java.util.List;

public class MainClass
{

	public static void main(String[] args)
	{
		// ArrayList
		ArrayList alltype = new ArrayList();
		alltype.add("Apple");
		alltype.add(25);
		alltype.add(10.52);
		System.out.println(alltype);
		
		// Generic Class      Class having general(any) data type while creation
		GenericPair<Integer, String> obj1 = new GenericPair<>(21,"Akash");
		GenericPair<Boolean, Float> obj2 = new GenericPair<>(true,45.2f);
		obj1.getDesc();
		obj2.getDesc();
		
		// Generic ArrayList
		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");     // Append Only data
		fruits.add(1,"Guava");    // Index with data
//		fruits.add(12);           Other than String datatype will not work
		System.out.println(fruits);
		
		
		// Assigning in List data type will help in conversion (ArrayList to LinkedList etc.)
		List<String> vegetables = new ArrayList<String>();  // Right Side String in Angular Bracket is Optional
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		System.out.println(vegetables);
		
		
		fruits.addAll(vegetables);    // Only Collection
		System.out.println(fruits);
		
		vegetables.addAll(1,fruits);  // Index with Collection
		System.out.println(vegetables);
		
		
		System.out.println(fruits.get(1));   // To Retrive with index
		fruits.set(1, "Lemon");              // To Overwrite with index
		System.out.println(fruits);
		
		System.out.println(fruits.remove(1));  // Removes and return giving index
		
		List<String> toRemove = new ArrayList<>();
		toRemove.add("Tomato");
		toRemove.add("Potato");
		vegetables.removeAll(toRemove);      // Removes all element which is in Collection toRemove
		System.out.println("After Removed:");
		System.out.println(vegetables);
		
		System.out.println(vegetables.size());              // Length of List
		System.out.println(vegetables.contains("Guava"));   // Membership Check
		System.out.println(vegetables.contains("Tomato"));
		
		fruits.clear();                   // Empty the list
		System.out.println(fruits);
		
		System.out.println(fruits.isEmpty());          // Empty Check
		System.out.println();
		
		String temp[] = new String[vegetables.size()];  // Converting in Array
		vegetables.toArray(temp);
		
		for(String t: vegetables)
		{
			System.out.println(t);
		}
		
		

	}

}

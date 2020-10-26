package hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainClass
{

	public static void main(String[] args)
	{
		Map<String, Integer> num = new HashMap<>();
		num.put("one", 1);
		num.put("three", 3);
		num.put("two", 2);
		num.put("four", 4);
		System.out.println(num);
		num.put("one", 10);
		System.out.println(num);
		num.putIfAbsent("five", 5);
		num.putIfAbsent("two", 20);
		System.out.println(num);
		num.remove("three");
		num.remove("one",1);
		System.out.println(num);
		num.remove("one",10);
		System.out.println(num.get("five"));
		System.out.println(num.get("six"));
		System.out.println(num.getOrDefault("ten",10));
		
		System.out.println("New "+num);
		System.out.println(num.containsKey("two"));
		System.out.println(num.containsKey("ten"));
		System.out.println(num.containsValue(5));
		System.out.println(num.containsValue(10));
		System.out.println(num.replace("four", 5));
		System.out.println(num);
		System.out.println(num.replace("two", 2, 4));
		System.out.println(num);
		
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		
		// either import Entry from map or use Map.Entry
		for(Entry<String, Integer> e: num.entrySet())
		{
			System.out.println(e+" "+e.getKey()+" "+e.getValue());
		}
		

	}

}

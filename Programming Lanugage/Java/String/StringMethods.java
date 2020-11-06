package String;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = "Akash";
		
		// charAt(index)    because s[index] does not work
		char c = s.charAt(3);
		System.out.println(c);
		
		// length()  for array length without parenthesis
		int len = s.length();
		System.out.println(len);
		
		// substring(begIndex)
		String sub_s_1 = s.substring(2);
		System.out.println(sub_s_1);
		
		// substring(begIndex, endIndex)
		String sub_s_2 = s.substring(1,4);
		System.out.println(sub_s_2);
		
		// contains(str)
		boolean flag= s.contains("as");
		System.out.println(flag);
		
		// equals(str)
		boolean equal = s.equals("Akash");
		System.out.println(equal);
		
		// equalsIgnoreCase(str)
		boolean equal_ic = s.equalsIgnoreCase("AkasH");
		System.out.println(equal_ic);
		
		// isEmpty()
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		// concat(str)
		String new_s = s.concat(" Deep");
		System.out.println(new_s);
		
		// concat using `+` operator
		String new_s_plus = s+" Soni";
		System.out.println(new_s_plus);
		
		// replace(old str, new str)
		s = "Akashdeep Soni Akashdeep Soni";
		s = s.replace("ash", "Hello");
		System.out.println(s);
		
		System.out.println(); // For creating a blank newline
		
		// split("Regex")
		s = "Akashdeep Soni Akashdeep Soni";
		String splited_s[] = s.split(" ");
		for(String str: splited_s)
			System.out.println(str);
		
		System.out.println(); // For creating a blank newline
		
		// indexOf(char or str)  both works
		s = "Akashdeep Soni";
		int ix = s.indexOf('e');
		System.out.println(ix);

		// toLowerCase()
		String lc = s.toLowerCase();
		System.out.println(lc);
		
		// toUpperCase()
		String uc = s.toUpperCase();
		System.out.println(uc);
		
		// trim() removes all whitespaces from both sides
		String sample = "   Hello  ";
		sample = sample.trim();
		System.out.println(sample);
		
		// toCharArray(str)   returns char array
		char ch[] = "Akashdeep Soni".toCharArray();
		for(char chr : ch)
			System.out.print(chr+" ");
	}

}

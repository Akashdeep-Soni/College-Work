package loops;

public class ForLoop {

	public static void main(String[] args) {
		
		int i,n=4;
		
		for(i = 1; i <= 10; i++)
		{
			System.out.println(n+"*"+i+"="+ n*i);
		}
		
		// Enhanced for loop
		long a[] = new long[4];   // int can be used instead of long
		for(long j: a)
		{
			System.out.println(j);
		}

	}

}

package recursion;

public class MainClass
{
	static int powstep = 0;
	static int fastpowstep = 0;
	
	public static void main(String[] args)
	{
		System.out.println("Sum "+sum(5));
		System.out.println("Pow "+pow(3,10)+" Step "+powstep);
		System.out.println("FastPow "+fastpow(3,10)+" Step "+fastpowstep);
		
		// r*c matrix can move only right or bottom. number of ways to reach end of matrix from start
		System.out.println("Matrix Path "+path(3,3));

	}
	
	public static int sum(int n)
	{
		if(n==1)
			return 1;
		else
			return sum(n-1) +n;
	}
	
	public static int pow(int n, int p)
	{
		powstep++;
		if(p == 0)
			return 1;
		return pow(n,p-1) * n;
	}
	
	public static int fastpow(int n, int p)
	{
		fastpowstep++;
		if(p == 0)
			return 1;
		else if(p%2==0)
			return fastpow(n*n, p/2);
		else
			return n*fastpow(n,p-1);
	}
	
	public static int path(int r, int c)
	{
		if(r==1 || c==1)
			return 1;
		
		return path(r,c-1) + path(r-1,c);
	}
}

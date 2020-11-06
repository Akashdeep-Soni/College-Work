package recursion;

public class CoinGame
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int l[] = {1,5,7,3,2,4};
		CoinGame cg = new CoinGame();
		System.out.println(cg.CoinGamePlay(l,0,l.length-1));

	}
	
	public int CoinGamePlay(int a[], int l, int r)
	{
		if(l+1 == r)
		{
			return Math.max(a[l], a[r]);
		}
		
		return Math.max(a[l] + Math.min(CoinGamePlay(a,l+2,r), CoinGamePlay(a,l+1,r-1)),
				a[r] + Math.min(CoinGamePlay(a,l+1,r-1), CoinGamePlay(a,l,r-2)));
		
	}

}

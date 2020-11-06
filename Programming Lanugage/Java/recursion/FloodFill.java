package recursion;

public class FloodFill
{

	public static void main(String[] args)
	{
		int a[][] = {
				{1,1,1,1,1,1,1,1},
				{1,1,1,1,1,1,0,0},
				{1,0,0,1,1,0,1,1},
				{1,2,2,2,2,0,1,0},
				{1,1,1,2,2,0,1,0},
				{1,1,1,2,2,2,2,0},
				{1,1,1,1,1,2,1,1},
				{1,1,1,1,1,2,2,1}
				};
		
		floodFill(a,3,4,3,2);
		
		for(int i=0; i<a.length; i++)
		{
			for(int j: a[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
	public static void floodFill(int a[][],int r, int c, int tofill, int prevfill)
	{
		if(r<0 || r>=a.length || c<0 || c>=a[0].length)
			return;
		else if(a[r][c]!=prevfill)
			return;
		else
		{
			a[r][c]=tofill;
			floodFill(a,r-1,c,tofill,prevfill);
			floodFill(a,r,c-1,tofill,prevfill);
			floodFill(a,r+1,c,tofill,prevfill);
			floodFill(a,r,c+1,tofill,prevfill);
		}
	}

}

package arrayList;

// Use Angular Bracket for defining generic after classname paramters should be in caps
public class GenericPair<X, Y>
{
	X x;
	Y y;
	
	public GenericPair(X x, Y y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void getDesc()
	{
		System.out.println(x+" "+y);
	}
}

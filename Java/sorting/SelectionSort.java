package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[] = {3,1,-2,7,4,0};
		int n = a.length;
		
		for(int i=0; i<n-1; i++)
		{
			int loc=i;
			for(int j=i+1; j<n;j++)
			{
				if(a[loc] > a[j])
				{
					loc = j;
				}
			}
			if(loc!=i)
			{
				int temp = a[i];
				a[i] = a[loc];
				a[loc] = temp;
			}
			
		}

		for(int i: a)
		{
			System.out.print(i+" ");
		}
		System.out.println("Sorted");
	}

}

#include<stdio.h>
int partition(int *a,int lb,int ub)
{
	int i,j,temp,pivot;
	pivot=a[lb];
	i=lb;
	j=ub;
	while(i<j)
	{
		while(a[i]<=pivot && i<ub)
		i++;
		
		while(a[j]>pivot)
		j--;
		
		if(i<j)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	
	temp=a[lb];
	a[lb]=a[j];
	a[j]=temp;
	
	return j;
}

int quicksort(int *a,int lb,int ub)
{
	int loc;
	if(lb<ub)
	{
		loc=partition(a,lb,ub);
		quicksort(a,lb,loc-1);
		quicksort(a,loc+1,ub);
	}
}

int main()
{
	int i,n,a[10];
	printf("Enter size of array ");
	scanf("%d",&n);
	printf("Enter array ");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	
	quicksort(a,0,n-1);
	
	printf("Sorted array ");
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
}

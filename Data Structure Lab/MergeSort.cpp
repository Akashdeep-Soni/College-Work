#include<stdio.h>
void Merge(int *a,int lb,int mid,int ub)
{
	int i,j,k=0,b[10];
	i=lb;
	j=mid+1;
	k=lb;
	while(i<=mid && j<=ub)
	{
		if(a[i]<a[j])
		{
			b[k]=a[i];
			i++;k++;
		}
		else
		{
			b[k]=a[j];
			j++;k++;
		}
	}
	if(i>mid)
	{
		while(j<=ub)
		{
			b[k]=a[j];
			j++;k++;
		}
	}
	else
	{
		while(i<=mid)
		{
			b[k]=a[i];
			i++;k++;
		}
	}
	for(i=lb;i<=ub;i++)
	a[i]=b[i];
	
}

void MergeSort(int *a,int lb,int ub)
{
	if (lb<ub)
	{
		int mid=(lb+ub)/2;
		MergeSort(a,lb,mid);
		MergeSort(a,mid+1,ub);
		Merge(a,lb,mid,ub);
	}
}

int main()
{
	int a[10],i,n;
	printf("Enter size of array ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	MergeSort(a,0,n-1);
	for(i=0;i<n;i++)
	printf("%d ",a[i]);
}

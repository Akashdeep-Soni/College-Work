#include<stdio.h>
void sort(int lb,int ub,int a[],int n)
{
	int i,j,temp;
	for(i=lb;i<ub;i++)
	{
		for(j=i+1;j<=ub;j++)
		{
			if(a[i] > a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}

int main()
{
	int i,a[6];
	for(i=0;i<6;i++)
	scanf("%d",&a[i]);
	
	sort(2,4,a,4);
	
	for(i=0;i<6;i++)
	printf("%d ",a[i]);
}

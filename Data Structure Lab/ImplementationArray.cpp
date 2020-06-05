#include<stdio.h>
int main()
{
	int temp,i,n,a[10];
	printf("Enter size ");
	scanf("%d",&n);
	printf("Enter array\n");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	
	int value=10;
	for(i=n-1;i>=0;i--)
	{
		a[i+1]=a[i];
	}
	a[0]=value;
	a[n+1]=13;
	for(i=0;i<n+2;i++)
	printf("%d ",a[i]);
	
}

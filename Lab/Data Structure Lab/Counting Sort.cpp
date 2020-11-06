#include<stdio.h>
int main()
{
	int i,n,max=0,a[10],b[10];
	printf("Enter size of array ");
	scanf("%d",&n);
	printf("Enter elements ");
	for(i=1;i<=n;i++)
	{
		scanf("%d",&a[i]);
		if(max<a[i])
		max=a[i];
	}
	
	int c[100]={0};
	for(i=1;i<=n;i++)
	{
		c[a[i]]+=1;
	}
	
	for(i=1;i<=max;i++)
	{
		c[i]+=c[i-1];
	}
	
	for(i=1;i<=n;i++)
	{
		b[c[a[i]]]=a[i];
		c[a[i]]-=1;
	}
	
	for(i=1;i<=n;i++)
	printf("%d ",b[i]);
}

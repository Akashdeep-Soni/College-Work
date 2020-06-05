#include<stdio.h>
int main()
{
	int i,j,n,s,a[n],b[n];
	scanf("%d%d",&n,&s);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=s-1,j=0;i<n;i++,j++)
	{
		b[j]=a[i];
	}
	for(i=0,j=s-1;i<s;i++,j++)
	{
		b[j]=a[i];
	}
	for(i=0;i<n;i++)
	printf("%d ",b[i]);
}

#include<stdio.h>
int main()
{
	int i,j,k,n,a[n];
	printf("Enter size of set ");
	scanf("%d",&n);
	printf("Enter set ");
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	printf("Power Set\n");
	
	printf("{{}, ");
	for(i=0;i<n;i++)
	printf("{%d}, ",a[i]);
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		printf("{%d,%d}, ",a[i],a[j]);
	}
	
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			for(k=j+1;k<n;k++)
			printf("{%d,%d,%d}, ",a[i],a[j],a[k]);
		}
	}
	
	printf("{");
	for(i=0;i<n;i++)
	printf("%d,",a[i]);
	printf("\b}}");
	
	printf("\n\nAkash Srivastava\nCS 2A 1816410035");
}

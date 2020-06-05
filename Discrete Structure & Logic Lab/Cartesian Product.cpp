#include<stdio.h>
int main()
{
	int m,n,i,j,a[10],b[10];
	printf("Enter size of first set ");
	scanf("%d",&m);
	printf("Enter size of second set ");
	scanf("%d",&n);
	
	printf("Enter type of set int or char");
	printf("Enter first set\n");
	for(i=0;i<m;i++)
	scanf("%d",&a[i]);
	printf("Enter second set\n");
	for(i=0;i<n;i++)
	scanf("%d",&b[i]);
	
	//logic
	printf("{");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			printf("(%d %d), ",a[i],b[j]);
		}
	}
	printf("\b\b}");
	
	printf("\n\nAkashdeep Soni\n");
	printf("CS 2A 1816410036");
}

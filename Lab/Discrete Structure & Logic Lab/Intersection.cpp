#include<stdio.h>
int main()
{
	int a[10],b[10],c[10],i,j,k=0,m,n;
	
	printf("Enter size of first set ");
	scanf("%d",&m);
	printf("Enter first set\n");
	for(i=0;i<m;i++)
	scanf("%d",&a[i]);
	
	printf("Enter size of Second set ");
	scanf("%d",&n);
	printf("Enter second set\n");
	for(i=0;i<n;i++)
	scanf("%d",&b[i]);
	
	//logic
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			if(b[i]==a[j])
			{
				c[k]=b[i];
				k++;
			}
		}
	}
	
	printf("Set after intersection\n");
	
	for(i=0;i<k;i++)
	printf("%d ",c[i]);
}

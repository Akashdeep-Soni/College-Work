#include<stdio.h>
int main()
{
	int a[10],b[10],c[10],i,j,k=0,m,n,flag=0;
	
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
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(a[i]==b[j])
			{
				flag=1;
			}
		}
		if(flag==0)
		{
			c[k]=a[i];
			k++;
		}
		flag=0;
	}
	
	printf("Set after difference\n");
	
	for(i=0;i<k;i++)
	printf("%d ",c[i]);
}

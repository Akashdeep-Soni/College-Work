#include<stdio.h>
int main()
{
	int i,j,m,n,a[10][10],temp,value=50;
	printf("Enter size of 2D array ");
	scanf("%d%d",&m,&n);
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		scanf("%d",&a[i][j]);
	}
	
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			temp=a[i][j];
			a[i][j]=value;
			value=temp;
		}
	}
	a[i][j+1]=value;


	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		printf("%d ",a[i][j]);
		printf("\n");
	}
	printf("%d",a[i][j+1]);

}

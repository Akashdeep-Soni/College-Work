#include<stdio.h>
int Diff(int *a,int *b,int *c,int m,int n)
{
	int i,j,k=0,flag=0;
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
	return k;
}

int Search(int *a,int m,int e)
{
    int i;
    for(i=0;i<m;i++)
    {
        if(e==a[i])
        {
            return 1;
        }
    }
    return 0;
}

int Union(int* a,int* b,int m,int n)
{
	int i,j,ct=0;
	for(i=m,j=0;j<n;j++)
    {
        if(!Search(a,m,b[j]))
        {
            a[i]=b[j];
            i++;
        }
        else ct++;

    }
    return ct;
}

int main()
{
	int a[10],b[10],dif1[10],dif2[10],i,j,k1,k2,ct,m,n,flag=0;
	
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
	
	k1=Diff(a,b,dif1,m,n);
	k2=Diff(b,a,dif2,m,n);
	ct=Union(dif1,dif2,k1,k2);
	
	printf("Set after Symmetric Difference\n");
	for(i=0;i<k1+k2-ct;i++)
	printf("%d ",dif1[i]);
	
	printf("\n\nAniket Dubey\n");
    printf("CS 2A 1816410051");
}

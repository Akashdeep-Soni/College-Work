#include<stdio.h>
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
void BS(int a[],int s)
{
    int n=s;
    int i,j,temp;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(a[j+1]<a[j])
            {
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
    }
}
int main()
{

    int a[100],b[100],i,j,m,n,ct=0;
    printf("Enter size of first set ");
    scanf("%d",&m);
    for(i=0;i<m;i++)
        scanf("%d",&a[i]);
    printf("Enter size of second array ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
        scanf("%d",&b[i]);
    int c[m+n];
    for(i=0;i<m;i++)
        c[i]=a[i];
    for(i=m,j=0;j<n;j++)
    {
        if(!Search(a,m,b[j]))
        {
            c[i]=b[j];
            i++;
        }
        else ct++;

    }
    BS(c,m+n-ct);
    for(i=0;i<m+n-ct;i++)
    {
        printf("%d ",c[i]);
    }
}

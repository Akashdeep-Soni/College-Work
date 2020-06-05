#include<stdio.h>
#include<string.h>
typedef struct student
{
	int sn,rn;
	char name[20];
	int m1,m2,total,rank;
}stud;

void s_total(stud ar[10],int n)
{
	for(int i=1;i<=n;i++)
	{
		ar[i].total=ar[i].m1 + ar[i].m2;
	}
}

void s_rank(stud ar[10],int n)
{
	int i,j=n;
	for(i=1;i<=n;i++)
	{
		ar[i].rank=j--;
	}
}

void s_sort(stud ar[10],int n,int ch)
{
	int i,j,k;
	stud temp;
	
		for(i=1;i<=n-1;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				if(ch==1)
				{
					if(ar[j].sn > ar[j+1].sn)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==2)
				{
					if(ar[j].rn > ar[j+1].rn)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==3)
				{
					if(strcmp(ar[j].name,ar[j+1].name)>0)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==4)
				{
					if(ar[j].m1 > ar[j+1].m1)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==5)
				{
					if(ar[j].m2 > ar[j+1].m2)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==6)
				{
					if(ar[j].total > ar[j+1].total)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				else if(ch==7)
				{
					if(ar[j].rank > ar[j+1].rank)
					{
						temp=ar[j];
						ar[j]=ar[j+1];
						ar[j+1]=temp;
					}
				}
				
			}
		}
}

int main()
{
	stud ar[10];
	int i,n,ch;
	printf("Enter number of students ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++)
	{
		printf("Enter record %d\n",i);
		ar[i].sn=i;
		printf("Enter Roll No.");
		scanf("%d",&ar[i].rn);
		fflush(stdin);
		printf("Enter Name");
		gets(ar[i].name);
		printf("Enter Sub1 and Sub2 marks");
		scanf("%d %d",&ar[i].m1,&ar[i].m2);
	}
	
	s_total(ar,n);
	s_sort(ar,n,6);
	s_rank(ar,n);
	
	do
	{
		printf("On which basis do you want to sort\n1.Serial Number\n2.Roll Number\n3.Name\n4.Marks 1\n5.Marks 2\n6.Total\n7.Rank\n8.Exit: ");
		scanf("%d",&ch);
		
		s_sort(ar,n,ch);
		
		printf("\n");
		for(i=1;i<=n;i++)
		printf("\n%d %d %s %d %d %d %d",ar[i].sn,ar[i].rn,ar[i].name,ar[i].m1,ar[i].m2,ar[i].total,ar[i].rank);
		printf("\n\n");
		
	}while(ch!=8);
}

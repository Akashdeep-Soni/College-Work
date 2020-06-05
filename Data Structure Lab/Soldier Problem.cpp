#include<stdio.h>
#include<stdlib.h>
struct soldier
{
	char name[20];
	struct soldier *next;
};
int main()
{
	struct soldier *start=NULL,*p,*q;
	int n,i;
	printf("Enter how many soldier ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		fflush(stdin);
		q=(struct soldier*)malloc(sizeof(struct soldier));
		printf("Enter name %d ",i+1);
		gets(q->name);
		q->next=start;
		if(start==NULL)
		p=start=q;
		else
		{
			p->next=q;
			p=q;
		}
	}
	
	//logic
	printf("Enter number ");
	scanf("%d",&n);
	p=start;
	while(p!=p->next)
	{
		for(i=0;i<n-2;i++)
		{
			p=p->next;
		}
		q=p->next;
		p->next=p->next->next;
		p=p->next;
		free(q);
	}
	printf("\n%s",p->name);
}

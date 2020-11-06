#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
};
int main()
{
	struct node *start=NULL,*p,*q,*l;
	int i,n,temp;
	printf("How many nodes ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		q=(struct node*)malloc(sizeof(struct node));
		q->next=NULL;
		printf("Enter data node %d ",i+1);
		scanf("%d",&q->data);
		if(start==NULL)
		p=start=q;
		else
		{
			p->next=q;
			p=q;
		}
	}
	p->next=start;
	
	p=start;
	do
	{
		printf("%d ",p->data);
		p=p->next;
	}while(p!=start);
}

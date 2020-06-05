#include<stdio.h>
#include<malloc.h>
struct node
{
	int data;
	struct node *next;
};
int main()
{
	struct node *start=NULL,*p,*q,*r;
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
	
	//Reverse link
	p=start;
	q=p->next;
	r=q->next;
	p->next=NULL;
	while(r!=NULL)
	{
		q->next=p;
		p=q;
		q=r;
		r=r->next;
	}
	q->next=p;
	start=q;
	
	
	p=start;
	for(i=0;i<n;i++)
	{
		printf("%d ",p->data);
		p=p->next;
	}
}

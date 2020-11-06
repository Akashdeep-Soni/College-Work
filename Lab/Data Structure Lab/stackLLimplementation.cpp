#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
}*q,*toss=NULL;

void push()
{
	q=(struct node *)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&q->data);
	q->next=toss;
	toss=q;
}

void pop()
{
	if(toss==NULL)
	printf("Stack is empty ");
	else
	{
		q=toss;
		printf("%d\n",q->data);
		toss=toss->next;
		free(q);
	}
}

void display()
{
	q=toss;
	while(q!=NULL)
	{
		printf("%d ",q->data);
		q=q->next;
	}
}

int main()
{
	int ch;
	do
	{
		printf("1.Push\n2.Pop\n3.Display\n4.Exit ");
		scanf("%d",&ch);
		if(ch==1)
		push();
		else if(ch==2)
		pop();
		else if(ch==3)
		display();
	}while(ch!=4);
}

#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};

struct node *front=NULL,*rear,*q;

void enqueue()
{
	q=(struct node *)malloc(sizeof(struct node));
	if (q==NULL)
	{
		printf("Memory Full");
		return;
	}
	else if (front == NULL)
	{
		front=rear=q;
	}
	else
	{
		rear->next=q;
		rear=q;
	}
	printf("Enter data ");
	scanf("%d",&q->data);
	q->next=NULL;
}

void dequeue()
{
	if(front == NULL)
	{
		printf("Underflow");
		return;
	}
	else 
	{
		printf("%d",front->data);
		q=front;
		front=front->next;
		free(q);
	}
}

void display()
{
	q=front;
	while(q != NULL)
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
		printf("Enter choice\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
		scanf("%d",&ch);
		if (ch==1)
		enqueue();
		else if (ch==2)
		dequeue();
		else if (ch==3)
		display();
	}while(ch!=4);
}

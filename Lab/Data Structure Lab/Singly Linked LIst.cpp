#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};

struct node *start=NULL,*p,*q;

void EnterNode()
{
	char choice;
	do
	{
		q=(struct node*)malloc(sizeof(struct node));
		q->next=NULL;
		printf("Enter data ");
		scanf("%d",&q->data);
		if(start==NULL)
		{
			p=start=q;
		}
		else
		{
			p->next=q;
			p=q;
		}	
		printf("Do you want to eneter more node ");
		scanf(" %c",&choice);		
	}while(choice=='y');
}

void InsertBeg()
{
	q=(struct node*)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&q->data);
	q->next=start;
	start=q;
	

}

void InsertNth()
{
	int n;
	printf("Enter node ");
	scanf("%d",&n);
	p=start;
	for(int i=0;i<n-1;i++)
	{
		p=p->next;
	}
	q=(struct node*)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&q->data);
	q->next=p->next;
	p->next=q;
}

void InsertEnd()
{
	q=(struct node*)malloc(sizeof(struct node));
	printf("Enter data ");
	scanf("%d",&q->data);
	p=start;
	while(p->next!=NULL)
	{
		p=p->next;
	}
	p->next=q;
	q->next=NULL;
}

void DeleteBeg()
{
	q=start;
	start=start->next;
	free(q);
}

void DeleteNth()
{
	int n;
	printf("Enter node ");
	scanf("%d",&n);
	p=start;
	for(int i=0;i<n-1;i++)
	{
		p=p->next;
	}
	q=(struct node*)malloc(sizeof(struct node));
	q=p->next;
	p->next=p->next->next;
	free(q);
}

void DeleteEnd()
{
	p=start;
	while(p->next->next!=NULL)
	{
		p=p->next;
	}
	q=p->next;
	p->next=NULL;
	free(q);
}
void Display()
{
	p=start;
	while(p!=NULL)
	{
		printf("%d ",p->data);
		p=p->next;
	}
}
int main()
{
	int i,j;
	char choice;
	
	do
	{
		printf("1.To enter node\n2.To Insert at begining\n3.To insert after nth node\n4.To insert at the end\n5.To delete from begining\n6.To delete after nth node\n7.To delete at the end\n8.To display ");
		scanf(" %c",&choice);
		switch(choice)
		{
			case '1':
				EnterNode();
				break;
			case '2':
				InsertBeg();
				break;
			case '3':
				InsertNth();
				break;
			case '4':
				InsertEnd();
				break;
			case '5':
				DeleteBeg();
				break;
			case '6':
				DeleteNth();
				break;
			case '7':
				DeleteEnd();
				break;
			case '8':
				Display();
				break;
		}
	printf("\nGo to previous menu press 'y' ");
	scanf(" %c",&choice);
	}while(choice=='y');	

}

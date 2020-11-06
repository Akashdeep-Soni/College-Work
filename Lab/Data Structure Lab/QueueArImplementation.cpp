#include<stdio.h>
#define size 100
int q[size],f=-1,r=-1,item;

void enqueue()
{
	if (r==size-1)
	{
		printf("Overflow");
		return;
	}
	else if (f==-1 && r==-1)
	{
		f++;r++;
	}
	else
	r++;
	
	printf("Enter data ");
	scanf("%d",&item);
	
	q[r]=item;
}

void dequeue()
{
	if (f==-1 and r==-1)
	{
		printf("Underflow");
		return;
	}
	else if (f>r)
	{
		f=r=-1;
		printf("Underflow");
		return;
	}
	else
	{
		item=q[f];
		printf("%d",item);
		f++;
	}
}

void display()
{
	int t=f;
	while(t <= r)
	{
		printf("%d ",q[t]);
		t++;
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

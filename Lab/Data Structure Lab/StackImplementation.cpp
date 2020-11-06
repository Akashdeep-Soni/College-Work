#include<stdio.h>
#define max 100
int stack[max],toss=-1,item;
void push();
void pop();
void display();

int main()
{
	char ch;
	do
	{
		printf("1.Push\n2.Pop\n3.Display\n4.Exit ");
		scanf(" %c",&ch);
		switch(ch)
		{	
			case '1':push();break;
			case '2':pop();break;
			case '3':display();break;
		}
	}while(ch!='4');
}

void push()
{
	printf("Enter item to push ");
	scanf("%d",&item);
	if(toss==max-1)
	{
		printf("Stack is full\n");
	}
	else
	{
		stack[++toss]=item;
		printf("Toss %d Pushed item %d\n",toss,stack[toss]);
	}
}

void pop()
{
	if(toss==-1)
	printf("Stack is empty\n");
	else
	{
		item=stack[toss--];
		printf("Popped item %d\n",item);
	}
}

void display()
{
	item=toss;
	while(toss>-1)
	{
		printf("%d ",stack[toss--]);
	}
	toss=item;
}

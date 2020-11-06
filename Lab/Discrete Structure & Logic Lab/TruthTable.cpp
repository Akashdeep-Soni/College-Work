#include<stdio.h>
#include<stdlib.h>
void AND()
{
	puts("AND");
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d %d %d\n",i,j,i&j);
		}
	}
}

void OR()
{
	puts("OR");
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d %d %d\n",i,j,i|j);
		}
	}
}

void NOT()
{
	puts("NOT");
	int i;
	for(i=0;i<2;i++)
	printf("%d %d\n",i,!i);
}

void NAND()
{
	puts("NAND");
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d %d %d\n",i,j,!(i&j));
		}
	}
}

void NOR()
{
	puts("NOR");
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d %d %d\n",i,j,!(i|j));
		}
	}
}

void XOR()
{
	puts("XOR");
	int i,j;
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			printf("%d %d %d\n",i,j,i^j);
		}
	}
}

int main()
{
	char ch;
	printf("Truth Table\n1.AND\n2.OR\n3.NOT\n4.NAND\n5.NOR\n6.XOR\nEnter choice ");
	scanf("%c",&ch);
	
	do
	{
		switch(ch)
		{
			case '1':AND();break;
			case '2':OR();break;
			case '3':NOT();break;
			case '4':NAND();break;
			case '5':NOR();break;
			case '6':XOR();break;
		}
		printf("Enter choice ");
		scanf(" %c",&ch);	
	}while(ch!='n');
	
	printf("\n\nAkashdeep Soni\nCS 2A 1816410036");
}

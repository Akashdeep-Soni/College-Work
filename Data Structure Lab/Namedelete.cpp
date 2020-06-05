#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct soldier
{
	char name[20];
	struct soldier *pre,*next;
};
int main()
{
	struct soldier *start=NULL,*p,*q;
	int n,i;
	char str[20];
	printf("Enter how many soldier ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		fflush(stdin);
		q=(struct soldier*)malloc(sizeof(struct soldier));
		printf("Enter name %d ",i+1);
		gets(q->name);
		q->next=q->pre=NULL;
		if(start==NULL)
		p=start=q;
		else
		{
			p->next=q;
			q->pre=p;
			p=q;
		}
	}
	
	puts("Enter name");
	gets(str);
	
	while(p!=NULL)
	{
		if(strcmpi(str,p->name))
		break;
		p=p->next;
	}
	q=p;
	p->pre->next=p->next;
	p->next->pre=p->pre;
	free(q);
	
	p=start;
	while(p!=NULL)
	{
		printf("%s ",p->name);
		p=p->next;
	}
}

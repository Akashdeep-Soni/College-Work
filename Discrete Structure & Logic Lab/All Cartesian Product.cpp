#include<stdio.h>
int main()
{
	int i=0,j=0;
	char a[10],b[10];
	
	printf("Enter first set ");
	gets(a);
	printf("Enter second set ");
	gets(b);
	printf("{");
	while(a[i]!=NULL)
	{
		if(a[i]==' ') i++;
		while(b[j]!=NULL)
		{
			if(b[j]==' ') j++;
			printf("(%c %c), ",a[i],b[j]);
			j++;
		}
		i++;
		j=0;
	}
	printf("\b\b}");
}

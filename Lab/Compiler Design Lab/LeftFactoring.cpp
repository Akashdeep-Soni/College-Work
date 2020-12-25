#include<stdio.h>
#include<string.h>
int main()
{
	char s[50],temp[50];
	int i,j,k,l,f;
	printf("Enter Production A--> ");
	gets(s);
	char r[10][50];
	
	
	i = j = k = 0;
	int ml=999;
	while(s[i]!='\0')
	{
		if (s[i]=='|')
		{
			temp[j] = '\0';
			strcpy(r[k++],temp);
			if (j-1<ml)
			{
				ml = j-1;
			}
			j = 0;
			i++;
		}
		
		temp[j] = s[i];
		j++;
		i++;
		
	}
	temp[j] = '\0';
	strcpy(r[k++],temp);
	
	// Debugging
//	for(i= 0; i < k; i++)
//	{
//		printf("%d",i);
//		puts(r[i]);
//	}
	
	char as[50]="";
	i = j = l= 0;
	for(i=0;i<=ml;i++)
	{
		f = 1;
		char temp = r[0][i];
		for(j=1; j<k; j++)
		{
			if (r[j][i] != temp)
			{
				f=0;
				break;
			}
		}
		if(f)
		{
			as[l]=temp;
			l++;
		}
		else
		{
			break;
		}
	}
	printf("After Removal of left factoring\n A--> %sX\n X-->",as);
	
	l = i;
	int m,n;
	m = 0;
	for(i=0;i<k;i++)
	{
		char temp[50];
		for(j=l;r[i][j]!='\0';j++)
		{
			as[m] = r[i][j];
			m++;
		}
		as[m++]='|';
		
	}
	as[m-1]='\0';
	printf("%s",as);
}

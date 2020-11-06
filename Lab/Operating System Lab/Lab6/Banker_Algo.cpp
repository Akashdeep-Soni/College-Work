#include<stdio.h>
#include<stdlib.h>
int **read(int **process,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		*(process+i)=(int*)calloc(sizeof(int),10);
		*(*(process+i)+0)=i;
		printf("Process %d\n",i);
		printf("Enter Allocation: ");
		scanf("%d%d%d",(*(process+i)+1),(*(process+i)+2),(*(process+i)+3));
		printf("Enter Max: ");
		scanf("%d%d%d",(*(process+i)+4),(*(process+i)+5),(*(process+i)+6));
		*(*(process+i)+7)=*(*(process+i)+4)-*(*(process+i)+1);
		*(*(process+i)+8)=*(*(process+i)+5)-*(*(process+i)+2);
		*(*(process+i)+9)=*(*(process+i)+6)-*(*(process+i)+3);
	}
	return process;
}


int **write(int **process,int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		printf("\nProcess %d",*(*(process+i)+0));
		printf(" Allocation: %d %d %d",*(*(process+i)+1),*(*(process+i)+2),*(*(process+i)+3));
		printf(" Max: %d %d %d",*(*(process+i)+4),*(*(process+i)+5),*(*(process+i)+6));
		printf(" Need: %d %d %d",*(*(process+i)+7),*(*(process+i)+8),*(*(process+i)+9));
	}
	return process;
}

int *total_allocation(int **process,int n)
{
	int i,*s;
	s=(int *)calloc(sizeof(int),3);
	for(i=0;i<n;i++)
	{
		s[0]+=*(*(process+i)+1);
		s[1]+=*(*(process+i)+2);
		s[2]+=*(*(process+i)+3);			
	}
	return s;
}

int *cal_avail(int *instance,int *allocation)
{
	int *s;
	s=(int *)calloc(sizeof(int),3);
	s[0]=*(instance+0)-*(allocation+0);
	s[1]=*(instance+1)-*(allocation+1);
	s[2]=*(instance+2)-*(allocation+2);
	return s;
}

void banker_algo(int **pr,int *av,int n)
{
	int i,count=0,temp;
	int f[n]={0};
	while(count<n)
	{
		temp=count;
		for(i=0;i<n;i++)
		{
			if(f[i]!=1 && *(*(pr+i)+7)<=av[0] && *(*(pr+i)+8)<=av[1] && *(*(pr+i)+9)<=av[2])
			{
				av[0]+=*(*(pr+i)+1);
				av[1]+=*(*(pr+i)+2);
				av[2]+=*(*(pr+i)+3);
				count+=1;
				printf("Process %d->",i);
				f[i]=1;
			}
		}
		if(temp==count)
		{
			printf("Unsafe");
			exit(0);
		}	
	}
	return;
}

int main()
{
	int n,*instance,*available,*allocation,**process;
	printf("Enter number of process: ");
	scanf("%d",&n);
	instance=(int*)calloc(sizeof(int),3);
	printf("Enter Total Resources: ");
	scanf("%d%d%d",(instance+0),(instance+1),(instance+2));
	process=(int**)calloc(sizeof(int *),n);
	process=read(process,n);
	process=write(process,n);
	allocation=total_allocation(process,n);
	available=cal_avail(instance,allocation);
	printf("\nAvailable %d %d %d\n",*(available+0),*(available+1),*(available+2));
	banker_algo(process,available,n);
	free(*process);
	free(process);
	free(instance);
	free(available);
	free(allocation);
	free(process);
}

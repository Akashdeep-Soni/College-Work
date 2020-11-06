#include<stdio.h>
struct process
{
	int pr,at,bt,ct,tat,wt;
};
struct process p[10],temp;

void sort(int lb,int ub,int ch)
{
	// ch Based on 1.Arrival Time 2.Burst Time
	int i,j;
	for(i=lb;i<ub;i++)
	{
		for(j=i+1;j<=ub;j++)
		{
			if(ch==1)
			{
				if(p[i].at > p[j].at)
				{
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
			else if(ch==2)
			{
				if(p[i].bt > p[j].bt)
				{
					temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
	}
}

void read(int n)
{
	char ch;
	fflush(stdin);
	printf("Press 'y' if arrival time given: ");
	scanf("%c",&ch);
	for(int i=0;i<n;i++)
	{
		printf("Process %d\n",i+1);
		p[i].pr=i+1;
		if(ch=='y')
		{
			printf("Enter Arrival Time and Burst Time: ");
			scanf("%d%d",&p[i].at,&p[i].bt);
		}
		else
		{
			p[i].at=0;
			printf("Enter Burst Time: ");
			scanf("%d",&p[i].bt);
		}
	}
	if(ch=='y')
	sort(0,n-1,1);
}

void sjf_scheduling(int n)
{
	int rem=n,lb,ub,tet=0,flag=0;
	lb=ub=0;
	while(rem--)
	{
		while(ub<n && p[ub].at<=tet)
		{
			ub++;
			flag=1;
		}
		
		if(flag==1)
		{
			sort(lb,ub-1,2);
			flag=0;
		}
		
		tet+=p[lb].bt;
		p[lb].ct=tet;
		lb++;
	}
}

void cal_avg(float avg[],int n)
{
	int i;
	for(i=0;i<n;i++)
	{
		p[i].tat=p[i].ct-p[i].at;
		p[i].wt=p[i].tat-p[i].bt;
		avg[0]+=p[i].ct;
		avg[1]+=p[i].tat;
		avg[2]+=p[i].wt;
	}
	avg[0]/=n;
	avg[1]/=n;
	avg[2]/=n;
}

void write(int n,float avg[])
{
	printf("PR AT BT CT TAT WT\n");
	for(int i=0;i<n;i++)
	{
		printf("%d  %d  %d  %d  %d  %d\n",p[i].pr,p[i].at,p[i].bt,p[i].ct,p[i].tat,p[i].wt);
	}
	printf("Average Completion Time: %.2f\nAverage Turnaround Time: %.2f\nAverage Waiting Time: %.2f",avg[0],avg[1],avg[2]);
}

int main()
{
	int n;
	float avg[3]={0};
	printf("Enter number of process: ");
	scanf("%d",&n);
	read(n);
	sjf_scheduling(n);
	cal_avg(avg,n);
	write(n,avg);
}

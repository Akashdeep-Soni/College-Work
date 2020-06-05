#include<stdio.h>
#define max 10
struct process
{
	int pr,at,bt,ct,tat,wt,rem_bt;
};
struct process p[max],q[max],temp;
int f=0,r=0;

void sort(int n)
{
	int i,j;
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(p[i].at > p[j].at)
			{
				temp=p[i];
				p[i]=p[j];
				p[j]=temp;
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
		p[i].rem_bt=p[i].bt;
	}
	if(ch=='y')
	sort(n);
}

void round_robin(int n,int tq)
{
	int rem=n,i=0,j,tet=0,flag=0,temp_loc;
	
	while(rem!=0)
	{ 
		while(i<n && p[i].at<=tet)
		{
			q[r]=p[i];
			r++;i++;
		}
		
		if(flag==1)
		{
			q[r]=q[temp_loc];
			r++;
		}
		
		if(f<r)
		{
			if(q[f].rem_bt <= tq)
			{
				tet+=q[f].rem_bt;
				q[f].rem_bt=0;
				//Finding Index in process
				for(j=0;j<n;j++)
				{
					if(p[j].pr==q[f].pr)
					break;
				}
				p[j].ct=tet;
				rem--;
				flag=0;
			}
			else
			{
				q[f].rem_bt-=tq;
				tet+=tq;
				temp_loc=f;
				flag=1;
			}
			f++;
		}
	}
}

void cal_avg(int n,float avg[])
{
	int i;
	avg[3]={0};
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
	int n,tq;
	float avg[3];
	printf("Enter number of process and time quantum: ");
	scanf("%d%d",&n,&tq);
	read(n);
	round_robin(n,tq);
	cal_avg(n,avg);
	printf("%d",n);
	write(n,avg);
}

#include<stdio.h>
struct fcfs
{
	int pr,at,bt,ct,wt,tat;
};

void sort(struct fcfs sl[],int n)
{
	struct fcfs temp;
	int i,j;
	for(i=0;i<n-1;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(sl[j+1].at < sl[j].at)
			{
				temp=sl[j+1];
				sl[j+1]=sl[j];
				sl[j]=temp;
			}
		}
	}
}

void cal(struct fcfs sl[],int n)
{
	int i;
	sl[0].ct=sl[0].bt;
	sl[0].tat=sl[0].ct-sl[0].at;
	sl[0].wt=sl[0].tat-sl[0].bt;
	for(i=1;i<n;i++)
	{
		sl[i].ct=sl[i].bt+sl[i-1].ct;
		sl[i].tat=sl[i].ct-sl[i].at;
		sl[i].wt=sl[i].tat-sl[i].bt;
	}
}

void cal_avg(struct fcfs sl[],int n,float avg[])
{
	int i,j;
	float s_ct=0,s_tat=0,s_wt=0;
	for(i=0;i<n;i++)
	{
		s_ct+=sl[i].ct;
		s_tat+=sl[i].tat;
		s_wt+=sl[i].wt;
	}
	avg[0]=s_ct/n;
	avg[1]=s_tat/n;
	avg[2]=s_wt/n;
}

int main()
{
	int i,n;
	float avg[3];
	printf("Enter No. of process: ");
	scanf("%d",&n);
	struct fcfs sl[n];
	
	for(i=0;i<n;i++)
	{
		printf("Process %d\n",i+1);
		sl[i].pr=i+1;
		printf("Enter Arrival Time, Burst Time: ");
		scanf("%d%d",&sl[i].at,&sl[i].bt);
	}
	
	sort(sl,n);
	cal(sl,n);
	cal_avg(sl,n,avg);
	
	printf("\nPr AT BT CT TAT WT\n");
	for(i=0;i<n;i++)
	printf("%d  %d  %d  %d  %d  %d\n",sl[i].pr,sl[i].at,sl[i].bt,sl[i].ct,sl[i].tat,sl[i].wt);
	printf("Average CT: %.2f\nAverage TAT: %.2f\nAverage WT: %.2f",avg[0],avg[1],avg[2]);
}

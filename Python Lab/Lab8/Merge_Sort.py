def merge(l,lb,mid,ub):
    i=lb
    j=mid+1
    a=[0]*(ub+1)
    k=0
    while(i<=mid and j<=ub):
        if(l[i]<l[j]):
            a[k]=l[i]
            i+=1
        else:
            a[k]=l[j]
            j+=1
        k+=1
    while(i<=mid):
        a[k]=l[i]
        i+=1
        k+=1
    while(j<=ub):
        a[k]=l[j]
        j+=1
        k+=1

    k=0
    i=lb
    while(i<=ub):
        l[i]=a[k]
        i+=1
        k+=1
        


def merge_sort(l,lb,ub):
    if(lb<ub):
        mid=(lb+ub)//2
        merge_sort(l,lb,mid)
        merge_sort(l,mid+1,ub)
        merge(l,lb,mid,ub)


l=list(map(int,input("Enter Numbers: ").split()))
merge_sort(l,0,len(l)-1)
print(l)

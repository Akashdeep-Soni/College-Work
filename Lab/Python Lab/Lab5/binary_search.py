l=list(map(int,input("Enter the list").split()))
item=int(input("Enter Number"))


beg=0
end=len(l)-1
while beg < end:
    mid= (beg + end)//2
    if item==l[mid]:
        print("Item found at",mid)
        break
    elif item > l[mid]:
        beg=mid+1
    else:
        end=mid-1
    print(beg,end)

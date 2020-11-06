def binary_search(b,e):
    mid=(b+e)//2
    if item==l[mid]:
        return mid
    elif item > l[mid]:
        return binary_search(mid+1,e)
    else:
        return binary_search(b,mid-1)


l=list(map(int,input("Enter the list").split()))
item=int(input("Enter Number"))
print(binary_search(0,len(l)-1))
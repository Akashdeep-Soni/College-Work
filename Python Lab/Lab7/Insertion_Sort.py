l=list(map(int,input("Enter The List").split()))

for i in range(1,len(l)):
    temp=l[i]
    j=i-1
    while(j >= 0 and l[j]>temp):
        l[j+1]=l[j]
        j=j-1
    l[j+1]=temp

print("Sorted List",l)

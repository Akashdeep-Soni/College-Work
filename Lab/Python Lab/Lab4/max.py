l=list(map(int,input("Enter the list").split()))

max=l[0]
for i in l:
    if i>max:
        max=i
        index=l.index(i)
print(max,index)
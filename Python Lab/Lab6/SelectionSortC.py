l=[int(i) for i in input().split()]

for i in range(len(l)-1):
    min=l[i]
    index=i
    for j in range(i+1,len(l)):
        if l[j]<min:
            min=l[j]
            index=j
    l[i],l[index]=l[index],l[i]

print(l)

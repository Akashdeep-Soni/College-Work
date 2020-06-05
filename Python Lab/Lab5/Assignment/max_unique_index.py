n=int(input("Enter number of sublist "))
l=[set(map(int,input("Enter sublist").split())) for _ in range(n)]
print(max(l,key=len))
print(l.index(max(l,key=len)))

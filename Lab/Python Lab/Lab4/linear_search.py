l=list(map(int,input("Enter the list").split()))
item=int(input("Enter Number"))

for i in l:
    if item==i:
        print(l.index(i))
        break

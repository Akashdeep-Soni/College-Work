val = list(map(int,input("Enter Numbers: ").split()))
c=0
for i in range(1,len(val)):
    if val[i]==val[i-1]:
        c+=1

print("Occurrences:",c)
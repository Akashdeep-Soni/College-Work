n=int(input("Input Number"))
for i in range(1,n+1):
    temp=i
    sum=0
    c=0
    while i>0:
        i=i//10
        c+=1
    i=temp
    while i>0:
        d=i%10
        sum=sum+d**c
        i=i//10
    if temp==sum:
        print(temp)

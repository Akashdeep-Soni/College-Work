n=int(input("Enter Number "))
i=int(input("Enter time "))
sum=0
d=0
for j in range(i):
    sum=sum+n*10**j
    d=d+sum
print(d)

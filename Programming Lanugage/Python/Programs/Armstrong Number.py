n=int(input("Input Number"))
temp=n
sum=0
while n>0:
    d=n%10
    sum=sum+d**3
    n=n//10
    
if temp==sum:
    print("Armstrong")
else:
    print("Not Armstrong")

n=int(input("Input Number"))
c=0
for i in range(2,n):
    if n%i==0:
        c=1
        break
if c==0:
    print("Prime Number")
else:
    print("Not Prime")

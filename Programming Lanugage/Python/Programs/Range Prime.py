r=eval(input("Input Range "))
for j in range(1,r+1):
    n=j
    c=0
    for i in range(2,n):
        if n%i==0:
            c=1
            break
    if c==0 and n!=1:
        print(n)

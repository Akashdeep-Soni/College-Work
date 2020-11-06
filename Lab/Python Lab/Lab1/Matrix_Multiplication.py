m,n=map(int,input("Enter the size of first matrix").split())
p,q=map(int,input("Enter the size of second matrix").split())
if n==p:
    print("Enter first matrix")
    a=[list(map(int,input().split())) for _ in range(m)]
    print("Enter second matrix")
    b=[list(map(int,input().split())) for _ in range(p)]

    #logic
    c=[]
    for i in range(m):
        l=[]
        for j in range(q):
            r=0
            for k in range(p):
                r += a[i][k] * b[k][j]
            l.append(r)
        c.append(l)
    print(c)
    
else:
    print("Matrix Multiplication not possible")

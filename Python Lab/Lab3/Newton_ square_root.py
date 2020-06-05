def newton_sqrt(a,k):
    n=a
    for _ in range(k):
        n=0.5*(n + a/n)
    return n 


a,k=map(int,input("Enter number and frequency: ").split())
print("Square Root",newton_sqrt(a,k))
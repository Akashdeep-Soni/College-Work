def newton_sqrt(a):
    n0=a
    n1=0.5*(n0 + a/n0)
    while n0-n1 > 0.001 :
        n0=n1
        n1=0.5*(n1 + a/n1)
    return n1

a=float(input("Enter Number"))
print(newton_sqrt(a))
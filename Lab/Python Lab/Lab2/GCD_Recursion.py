def GCD(a,b):
    if a==0:
        return b
    else:
        return GCD(b%a,a)

a,b=map(int,input().split())
print(GCD(a,b))
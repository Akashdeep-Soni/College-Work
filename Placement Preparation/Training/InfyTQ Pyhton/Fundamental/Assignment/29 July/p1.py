def gcd(a,b):
    if a == 0:
        return b
    else:
        return gcd(b%a, a)


n1,n2 = map(int,input("Enter two numbers: ").split())
print("GCD: ",gcd(n1,n2))

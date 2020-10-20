def factorial(n):
    if n==0:
        return 1
    else:
        return n*factorial(n-1)

def strong(v):
    s = 0
    for i in str(v):
        s += factorial(int(i))
    return True if(s == v) else False

l = list(map(int,input("Enter numbers: ").split()))
sl = list(filter(strong,l))

print("Strong Numbers: ",*sl)
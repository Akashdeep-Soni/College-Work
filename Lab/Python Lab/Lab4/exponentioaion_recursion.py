def exp(x,y):
    if y==0:
        return 1
    else:
        return x*exp(x,y-1)

x,y=map(int,input("Enter number and power").split())
print(exp(x,y))
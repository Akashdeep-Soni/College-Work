x,y=map(int,input("Enter number and power").split())
t=1
for i in range(y-1):
    t*=x
print(t)
x,y=map(int,input().split())
m=min(x,y)
for i in range(m,0,-1):
    if x%i==0 and y%i==0:
        print(i)
        break
x,y=map(int,input().split())
m=min(x,y)

while(x%y!=0):
    x,y=y,x%y

print(y)

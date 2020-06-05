def prime_range(x,y):
    if x==0 or x==1:
        x=2
    for i in range(x,y+1):
        for j in range(2,i//2+1):
            if(i%j==0):
                break
        else:
            print("Prime",i)

x,y=map(int,input("Enter range in x and y: ").split())
prime_range(x,y)

def Prime(l,u):
    for i in range(l,u+1):
        flag=False
        for j in range(2,i//2+1):
            if(i%j==0):
                flag=True
                break
        if(flag==False and i!=1):
            print(i,end=" ")

x,y=map(int,input("Enter Range lower and upper ").split())
Prime(x,y)
            

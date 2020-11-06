def solve(h,l):
    r=(l-2*h)/2
    c=h-r
    if r-int(r)>0 or r<0 or c<0:
        return "No Solution"
    
    return c,r

h,l=map(int,input("Enter Head and Leg ").split())
print("Chicken and Rabbit",solve(h,l))

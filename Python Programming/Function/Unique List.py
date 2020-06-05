def UL(l):
    n=[]
    for i in l:
        if i not in n:
            n.append(i)
    return n


l=map(int,input("Enter List ").split())
print(UL(l))

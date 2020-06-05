def EL(l):
    n=[]
    for i in l:
        if i%2==0 and i not in n:
            n.append(i)
    return n

l=[int(i) for i in input("Enter List ").split()]
print(l)

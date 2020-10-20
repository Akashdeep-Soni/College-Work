def prod_list(l):
    if 7 in l:
        if l.index(7) == len(l)-1:
            return -1
        else:
            l = l[l.index(7)+1:]
    prod = 1
    for i in l:
        prod *= i
    return prod
    

l = list(map(int,input("Enter Three Numbers: ").split()))
print("Product",prod_list(l))
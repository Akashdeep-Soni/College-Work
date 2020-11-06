def flattening(l1,l2):
    for i in l1:
        if type(i)!=list:
            l2.append(i)
        else:
            flattening(i,l2)
    

il=[1,2,3,[4,5,[6,7,8]],9,[10,11],12]
ol=[]

flattening(il,ol)
print(ol)

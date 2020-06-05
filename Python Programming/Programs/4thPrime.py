l=list(range(2,101))
c=0
for i in l:
    c+=1
    for j in l[c:]:
        if j%i==0:
            l.remove(j)
print(l)

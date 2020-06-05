with open("Z:\\Python Lab\\Lab2\\abc.txt","r") as f:
    l=f.read()
    l=l.split()
    max=0
    str=""
    for i in l:
        l[l.index(i)]=i.strip('.')
    
    for i in l:
        if l.count(i) > max:
            max=l.count(i)
            str=i
    print(str)

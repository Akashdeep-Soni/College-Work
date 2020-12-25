f = open('p1abc.txt','r')
c = 0
for i in f:
    c += len(i.split())
print("Number of words",c)
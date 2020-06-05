l=input("Enter Words").split()
ln=[]
max=len([l[0]])
str=""
for i in l:
    ln.append(len(i))
    if max < len(i):
        max=len(i)
        str=i
print(ln,str,max)
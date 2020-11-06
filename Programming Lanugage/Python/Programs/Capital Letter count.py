import string
s="ABCDdEfG"
c=0
for i in s:
    if i in string.ascii_uppercase:
        c+=1
print(c)
    

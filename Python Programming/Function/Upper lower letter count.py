import string
def ULC(s):
    u=l=0
    for i in s:
        if i in string.ascii_uppercase:
            u+=1
        elif i in string.ascii_lowercase:
            l+=1
    print("Upper {} Lower {}".format(u,l))
    return u,l

s=input("Enter string ")
x,y=ULC(s)
print(x,y)
print(ULC(s))

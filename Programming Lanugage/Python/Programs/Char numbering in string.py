s="AABCCA"
c=0
s1=""
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        c=c+1
    else:
        s1+=str(c+1)+s[i]
        c=0
print(s1+str(c+1)+s[i+1])

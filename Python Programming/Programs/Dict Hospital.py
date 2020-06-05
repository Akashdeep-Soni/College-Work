s={"P":"pediatrics","O":"orthopedics","E":"ENT"}
#l=[ 101, 'P', 102, 'O', 302, 'P', 305, 'P']
l=[ 101, 'P', 102, 'E', 302, 'P', 305, 'P', 401, 'E', 656, 'O', 987, 'E']
li=[]
for i in "POE":
    li.append((l.count(i),i))
print(s[max(li)[1]])
    

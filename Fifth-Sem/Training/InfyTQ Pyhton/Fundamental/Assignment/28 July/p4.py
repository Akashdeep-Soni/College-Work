def find_max(a,b):
    l = []
    if a<10:
        a = 10
    for i in range(a,b+1):
        i = str(i)
        if len(i)==2 and int(i)%3 == 0:
            sod = int(i[0])+int(i[1])
            if sod%3 == 0:
                l.append(int(i))
    return l

n1, n2 = map(int,input("Enter num1 and num2:").split())
print("Maximum Number",find_max(n1,n2))
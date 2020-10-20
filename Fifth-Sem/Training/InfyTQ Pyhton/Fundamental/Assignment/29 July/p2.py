n = int(input("Enter number of student: "))
avg = 0

l = [(0,'Dummy')]
for i in range(n):
    a,b = input("Enter name and marks: ").split()
    b = float(b)
    avg += b
    j = len(l)-1
    while j>=0 and l[j][0]>b:
        j-=1
    l.insert(j+1,(b,a))

avg /= n
print("Top Three: ")
for i in l[-1:-4:-1]:
    print(i[1])
print("Average Marks: ",avg)

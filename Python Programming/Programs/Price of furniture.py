'''l=["SofaSet","DiningTable","TVStand","CupBoard"]
p=[2000,8500,4599,13920]
i=l.index(input("Eneter  Furniture "))
c=int(input("Enter Quantity "))
print("price",c*p[i])'''
#--------------------------------------------
li=["SofaSet","DiningTable","TVStand","CupBoard"]
p=[20000,8500,4599,13920]
fu=input("Enter furniture ")
ct=input("Enter number of furniture ")
l=fu.split(",")
c=ct.split(",")
sum=0
for i in range(len(l)):
    sum+=(int(c[i])*p[li.index(l[i])])
print(sum)
#----------------------------------

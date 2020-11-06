m=int(input("Input Mileage "))
a=int(input("Input Fuel "))
d=int(input("Input Distance "))
p=(d*2*a)/(4*m)
print(p)
if p%5==0:
    print("True")
else:
    print("False")

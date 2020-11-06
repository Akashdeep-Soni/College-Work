from math import factorial
sum=0
for i in range(1,8):
    sum=sum+(i/factorial(i))
print(sum)

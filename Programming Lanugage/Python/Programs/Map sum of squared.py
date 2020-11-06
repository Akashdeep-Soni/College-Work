from functools import reduce
L=[1,2,3,4,5,6,7,8,9]
L=list(map(lambda x: x**2,L))
print(reduce(lambda x,y: x+y,L))

#PF-Prac-32
from math import sqrt
def check_squares(number):
    #start writing your code here
    r = range(int(sqrt(number)))
    for i in r:
        for j in r:
            if i**2 + j**2 == number:
                return True
    return False

number=68
print(check_squares(number))
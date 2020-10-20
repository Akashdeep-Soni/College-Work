#PF-Prac-23
def divisible_by_sum(number):
    #start writing your code here
    t = number
    s = 0
    while t > 0:
        s += t%10
        t //= 10
    
    return number % s == 0

    
number=42
print(divisible_by_sum(number))
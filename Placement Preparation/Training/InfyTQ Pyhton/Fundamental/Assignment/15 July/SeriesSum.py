import math

def series_sum(n):
    sum = 0
    for i in range(1,n+1):
        sum += i/math.factorial(i)
    return sum

if __name__ == "__main__":
    val = series_sum(7)
    print("Sum of seven terms",round(val,2))
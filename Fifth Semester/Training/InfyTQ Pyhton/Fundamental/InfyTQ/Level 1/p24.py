#PF-Prac-24
def find_gcd(num1,num2):
    #start writing your code here
    while num1!=0:
        num1, num2 = num2%num1, num1
    
    return num2
    

num1=45
num2=9
print(find_gcd(num1,num2))
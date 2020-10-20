#PF-Prac-13
def close_number(num1,num2,num3):
    #start writing your code here
    if abs(num1 - num2) <= 1:
        if abs(num1 - num3) >= 2 and abs(num2 - num3) >= 2:
            return True
    elif abs(num2 - num3) <= 1:
        if abs(num2 - num1) >= 2 and abs(num3 - num1) >= 2:
            return True
    elif abs(num1 - num3) <= 1:
        if abs(num1 - num2) >= 2 and abs(num3 - num2) >= 2:
            return True
            
    return False
        
        
    
print(close_number(5,4,2))
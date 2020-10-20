#PF-Prac-15
def check_22(num_list):
    #start writing your code here
    f = 0
    for i in num_list:
        if i == 2:
            f += 1
        else:
            f = 0
        
        if f == 2:
            return True
        
    return False
        
print(check_22([3,2,5,1,2,1,2,2]))
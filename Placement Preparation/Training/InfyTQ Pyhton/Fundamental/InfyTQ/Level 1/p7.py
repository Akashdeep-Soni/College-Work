#PF-Prac-7
def seed_no(number,ref_no):
    #start writing your code here
    sm = number
    for i in str(number):
        sm *= int(i)
    
    return True if sm == ref_no else False
    
    
number=123
ref_no=738
print(seed_no(number,ref_no))
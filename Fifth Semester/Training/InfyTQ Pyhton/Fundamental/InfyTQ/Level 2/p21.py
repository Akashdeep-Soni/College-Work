#PF-Prac-21
def check_numbers(num1,num2):
    #start writing your code here
    num_list = set()
    for i in range(num1,num2+1):
        for j in range(num1,i):
            if i%j == 0:
                num_list.add(i)
    count = len(num_list)
    
    return [num_list,count]

num1=2
num2=20
print(check_numbers(num1, num2))

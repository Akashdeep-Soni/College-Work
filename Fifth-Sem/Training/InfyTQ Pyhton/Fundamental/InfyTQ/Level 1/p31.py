#PF-Prac-31
def sum_of_elements(num_list,number):
    
    result_sum = 0
    if num_list[0] != number and num_list[1] != number:
        result_sum += num_list[0]
            
        
    for i in range(1,len(num_list)-1):
        if num_list[i-1] != number and num_list[i] != number and num_list[i+1] != number:
            result_sum += num_list[i]
    
    if num_list[-1] != number and num_list[-2] != number:
        result_sum += num_list[-1]
        
    return result_sum
      
num_list=[1,7,3,4,1,7,10,5]
number=7
print(sum_of_elements(num_list, number))
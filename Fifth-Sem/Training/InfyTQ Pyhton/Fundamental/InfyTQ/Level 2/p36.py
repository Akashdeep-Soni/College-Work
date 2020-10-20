#PF-Prac-36
import re
def find_target_positions(input_string, target_word):
    target_list=[]
    #Start writing your code here
    ix = 0
    for i in input_string.split():
        if target_word == i:
            target_list.append(ix)
        ix += 1

    return target_list

def find_inverted_index(input_string):
    target_dict={}
    #Start writing your code here
    for i in set(input_string.split()):
        target_dict[i] = find_target_positions(input_string,i)

    return target_dict
    
    
input_string="we dont need no education we dont need no thought control no we dont"
result_dict=find_inverted_index(input_string)
print(result_dict)
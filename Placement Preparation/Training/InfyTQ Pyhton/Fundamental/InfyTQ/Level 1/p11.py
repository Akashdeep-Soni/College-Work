#PF-Prac-11
def find_upper_and_lower(sentence):
    #start writing your code here
    result_list  = [0]*2
    for i in sentence:
        if i.islower():
            result_list[1] += 1
        elif i.isupper():
            result_list[0] += 1
       
    return result_list

sentence="Come Here"
print(find_upper_and_lower(sentence))
#PF-Prac-47
def list_rotate(uniquecode_list):
    rotated_list=[]
    #Write your code here
    for i in uniquecode_list:
        c = 2 if i[1].isalpha() else 1
        
        if c == 2:
            rotated_list.append(i[:2]+i[-2:]+i[-4:-2])
        else:
            rotated_list.append(i[0]+i[-3:]+i[-4])
    return rotated_list

#You may modify the below code for testing
uniquecode_list=["AZ01-1234",'HR05-2941',"R137-8714"]
rotated_list = list_rotate(uniquecode_list)
print(rotated_list)
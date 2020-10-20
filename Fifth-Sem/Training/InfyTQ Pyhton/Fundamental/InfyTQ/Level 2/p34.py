#PF-Prac-34
def check_well_formatted(input_item,list_label):
    #Start writing your code here
    if type(input_item) == list and len(input_item) >= 2 and input_item[0] in list_label:
        for i in input_item[1:]:
            if type(i) == str:
                pass
            elif type(i) == list:
                if not check_well_formatted(i,list_label):
                    return False
            else:
                return False
    else:
        return False
        
    return True


input_list1=['VP', ['V', 'eat']]
list_label1=['VP', 'V']
result=check_well_formatted(input_list1,list_label1)
if result is True:
    print("Well formatted")
else:
    print("Not Well formatted")
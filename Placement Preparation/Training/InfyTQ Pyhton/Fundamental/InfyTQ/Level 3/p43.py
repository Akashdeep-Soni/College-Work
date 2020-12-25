#PF-Prac-43

def find_promoted_vp(presidents_dict):
    #start writing your code here
    promoted_vp_list = []
    vp_list = [i['vp'] for i in presidents_dict]
    for i in presidents_dict:
        if i['name'] in vp_list and i['name'] not in promoted_vp_list:
            promoted_vp_list.append(i['name'])
    return promoted_vp_list

def find_presidents_vp(presidents_dict,duration):
    #start writing your code here
    isbelong_duration = lambda d1,d2: d1[:4] <= d2[:4] and d2[-4:] <= d1[-4:]
    vp_list = [i['vp'] for i in presidents_dict if isbelong_duration(duration,i['period'])]
    
    promoted_vp_list = []
    for i in presidents_dict:
        if i['name'] in vp_list and i['name'] not in promoted_vp_list:
            promoted_vp_list.append(i['name'])
        
    return promoted_vp_list


presidents_dict=[{'name':'George Washington', 'vp':'John Adams','period':'1990-1993'}, 
                 {'name':'John Adams', 'vp':'Thomas Jefferson','period':'1994-1996'}, 
                 {'name':'Zachary Taylor', 'vp':'Millard Fillmore','period':'1997-1999'}, 
                 {'name':'Dwight D. Eisenhower', 'vp':'Richard Nixon','period':'1999-2001'}, 
                 {'name':'Richard Nixon', 'vp':'Spiro Agnew','period':'2001-2002'}, 
                 {'name':'Richard Nixon', 'vp':'Gerald Ford','period':'2002-2004'}] 

print("The president and vice president details:",presidents_dict)
output=find_promoted_vp(presidents_dict)
print("The list of vice presidents who also got promoted as presidents:",output)
duration='1999-2005'
print("The president and vice president details:",presidents_dict)
print("Given duration:",duration)
output1=find_presidents_vp(presidents_dict, duration)
print("The list of vice presidents who also got promoted as presidents in the given duration:",output1)
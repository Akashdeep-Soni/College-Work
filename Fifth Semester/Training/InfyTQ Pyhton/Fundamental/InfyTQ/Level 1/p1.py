#PF-Prac-1
def add_string(str1):
    #start writing your code here
    if len(str1) < 3:
        pass
    elif str1[-3:] == 'ing':
        str1 += 'ly'
    else:
        str1 += 'ing'
  
    return str1

str1="com"
print(add_string(str1))
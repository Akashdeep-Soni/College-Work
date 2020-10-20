#PF-Prac-2
def bracket_pattern(input_str):
    #Remove pass and write your code here
	if input_str[0] == ')' or input_str[-1] == '(':
	    return False
	else:
	    c = 0
	    for i in input_str:
	        if i == '(':
	            c += 1
	        else:
	            c -= 1
	    return True if c == 0 else False
    
input_str="(())("
print(bracket_pattern(input_str))
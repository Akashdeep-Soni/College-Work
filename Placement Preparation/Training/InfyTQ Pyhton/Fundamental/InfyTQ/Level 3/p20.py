#PF-Prac-20
def ducci_sequence(test_list,n):
    #start writing your code here
    final_list = [test_list]
    for i in range(n+1):
        l = []
        for j in range(len(final_list[i])):
            if j == len(final_list[i])-1:
                l.append(abs(final_list[i][j] - final_list[i][0]))
            else:
                l.append(abs(final_list[i][j] - final_list[i][j+1]))
        final_list.append(l)
    
    return final_list[n+1]

ducci_element=ducci_sequence([0, 653, 1854, 4063] , 3)
print(ducci_element)
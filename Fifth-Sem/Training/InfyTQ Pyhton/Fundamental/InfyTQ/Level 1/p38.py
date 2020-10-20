#PF-Prac-38
def build_index_grid(rows, columns):
    result_list = [[str(i)+','+str(j) for j in range(columns)] for i in range(rows)]
    return result_list

rows=4
columns=3
result=build_index_grid(rows,columns)
print("Rows:",rows,"Columns:",columns)
print("The matrix is:",result)
for i in result:
    print(i)
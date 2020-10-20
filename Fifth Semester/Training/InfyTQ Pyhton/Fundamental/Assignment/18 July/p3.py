from re import sub

s = input("Enter String: ")

n = s.find("not")
print("Index of 'not':",n)

p = s.index("poor")
print("Index of 'poor':",p)

s = sub("not|poor",'good',s)

print("Resulting String:",s,sep="\n")
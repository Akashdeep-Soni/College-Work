s = input("Enter the string: ")
i = -2 if len(s)%2==0 else -1

print("Result: ",s[i::-2])
s1 = input("Enter First String: ")
s2 = input("Enter Second String: ")

s3 = s2[:2] + s1[2:] + " "+ s1[:2] + s2[2:]

print("Combined String: ",s3)
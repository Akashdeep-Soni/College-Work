def stud_qualify(a, b):
    if a>=55 and b>=45:
        print("Passed")
    elif a>=45 and b>=55:
        print("Passed")
    elif a>=65 and b<45:
        print("Allowed to reappear in B")
    else:
        print("Failed")


a = float(input("Enter percent in A: "))
b = float(input("Enter percent in B: "))

stud_qualify(a, b)
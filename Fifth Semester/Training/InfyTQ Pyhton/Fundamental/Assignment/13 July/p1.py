while True:
    number = input("Enter four digit number: ")
    if len(number) !=4:
        print("Invalid input. Try again")
    else:
        break

first_last_digitsum = int(number[0]) + int(number[-1])
print("Sum of the first and last digit number is:",first_last_digitsum)

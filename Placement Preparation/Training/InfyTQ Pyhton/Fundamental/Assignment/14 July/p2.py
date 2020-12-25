while True:
    money = int(input("Enter Money in hundreds: "))
    if money < 100 or money % 10 != 0 :
        print("Invalid input. Try again.")
    else:
        break


hundred_count = money//100

money %= 100

fifty_count = money//50

money %= 50

ten_count = money//10

print("Hundred Currency:", hundred_count)
print("Fifty Currency:", fifty_count)
print("Ten Currency:", ten_count)

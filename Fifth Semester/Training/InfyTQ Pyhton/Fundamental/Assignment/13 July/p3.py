while True:
    word = input("Enter a word: ")
    if " " in word:
        print("Invalid input. Try again")
    else:
        break

print("Reversed Word:", word[::-1])

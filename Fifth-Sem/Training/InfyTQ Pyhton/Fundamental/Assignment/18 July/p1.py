from collections import Counter

charstr = input("Enter String: ")

print("Character Count:")
print(*sorted(Counter(charstr).items()),sep="\n")
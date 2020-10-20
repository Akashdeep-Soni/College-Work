from collections import Counter

s = input("Enter String: ")
s = s.upper()

for i in Counter(s).items():
    print(*i[::-1],sep="")
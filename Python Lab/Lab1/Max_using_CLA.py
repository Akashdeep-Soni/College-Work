import sys
max=-999
for v in map(int,sys.argv[1:]):
    if v>max:
        max=v
print(max)

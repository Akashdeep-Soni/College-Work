import re
st = "thing is like someotherthing you know"
m=re.search('some', st) # matches
print(m)
print(m.start())
print(m.end())
print(m.span())
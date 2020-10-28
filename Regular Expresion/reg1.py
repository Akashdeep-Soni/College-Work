import re
st = "something is like someotherthing you know"
m=re.match('some', st) # matches
print(m)
print(m.start())
print(m.end())
print(m.span())

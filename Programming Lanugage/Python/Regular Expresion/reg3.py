import re
st = """Something is like 
someotherthing you know"""
m=re.search('some', st) # matches
print(m)
print (re.search('^someother', st))# won't match
print (re.search('^someother', st,re.MULTILINE))# matches
print (re.search('know$', st)) # also finds something
print (re.search('like$', st)) # also finds something
print (re.search('like$', st,re.MULTILINE)) # also finds something

# Assignment 1
import re
s1="""John is 15 years old, Mohan is currently 25 years
old.Edvard is 57, and his grand father Michael is 
now 102 years old"""
l=re.findall("([A-Z]\w+)[a-z ]+(\d{1,3})",s1)
print(l)

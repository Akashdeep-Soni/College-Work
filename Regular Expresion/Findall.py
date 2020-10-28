'''Find list of all words starting with d or p'''
import re
s1 = "abc 123 def 456 dot map pat"
l = re.findall("[dp]\w+", s1)
print(l)









'''string = "computer science dean@psit.in, dept dr.harsh_dev@gmail.com professor PSIT"
print(re.findall(r'[\w._]+@[\w]+\.[\w]+', string))'''
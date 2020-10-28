# Assignment 2
import re
s1 = '''computer science dean@psit.in, dept cs@psit.in
dr.harsh_dev@gmail.com professor PSIT drharshdev@yahoo.com'''
l=re.findall("[\w.]+@\w+.\w+",s1)
print(l)
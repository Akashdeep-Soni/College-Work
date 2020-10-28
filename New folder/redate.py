'''program for date extraction by match and search'''
import re
values = "banker sbi2009-11-17now 2019.340 Kanpur2016-12-11"
d=re.search('\d\d\d\d-\d\d-\d\d',values) #exactly matches the digits
print(d)
#print(d.groups())
#--------------------------------------
d1=re.search('(\d{4})-(\d{2})-(\d\d)',values)
print('year=',d1.group(1))
print('month=',d1.group(2))
print('date=',d1.group(3))
print('entire search in tuple',d1.group())

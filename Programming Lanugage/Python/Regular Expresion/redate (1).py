'''program for date extraction by match and search'''
import re
values = "banker sbi2009-11-17now 2019.340 Kanpur2016-12-11"
d=re.search('\d\d\d\d-\d\d-\d\d',values) #exactly matches the digits
print(d)
#print(d.groups())
#--------------------------------------



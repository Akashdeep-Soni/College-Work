import re
date="banker sbi2009-11-17now 2019.340 Kanpur2016-12-11 date 2019-08-13"
print(re.findall('\d{4}-\d{2}-\d{2}',date))
print(re.findall('(\d{4})-(\d{2})-(\d{2})',date))
print(re.search('\d{4}-\d{2}-\d{2}',date))

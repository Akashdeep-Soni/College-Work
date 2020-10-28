import re
st ='9-14-2017 and the 12345 11-12-2016 psit built in 8-12-2003'
#output: 14 Sep 2017 and the 12345 12 Nov 2016 psit built in 12 Aug 2003
def repdate(m):
    months={'1':'Jan','2':'Feb','3':'March','4':'Apr','5':'May','6':'June',
            '7':'July','8':'Aug','9':'Sep','10':'Oct','11':'Nov','12':'Dec'}
    return m.group(2)+" "+months[m.group(1)]+" "+m.group(3)

print(re.sub("(\d{1,2})-(\d{1,2})-(\d{4})",repdate,st))
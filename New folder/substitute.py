st="some of the some persons some the somesh"
s=st.replace('some','all')
print(s)
#-------------------------------------------
import re
st="some of the some persons some the somesh"
s=re.sub('some', "all",st)
print(s)
#----------------------------------------
st="some of the some persons some the somesh"
s=re.sub('some|the', "all",st)
print(s)
#----------------------------------------
st1="some of the some persons some somesh"
s1=re.subn('some', "all",st1,count=2)
print(s1)
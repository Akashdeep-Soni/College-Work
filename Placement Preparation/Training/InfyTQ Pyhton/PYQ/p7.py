def findsub(st):
   s = set()
   rs = ""
   rsl = 0
   ts = ""
   for i in st:
      if i in s:
         if rsl < len(ts):
            rs = ts
            rsl = len(ts)
         ts = i
         s = set(i)
      else:
         s.add(i)
         ts += i
   if rsl < len(ts):
            rs = ts
   return rs


s = input()
print(findsub(s))

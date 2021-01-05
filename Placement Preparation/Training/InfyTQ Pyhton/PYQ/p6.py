def finddigit(ss):
    v = 99
    for i in ss:
        if ord(i) >= 48 and ord(i) <=57:
            if int(i) < int(v) and int(i)%2 == 1:
                v = i
    rs = ""
    ts = ""
    s = set()
    f = 1
    while i < len(ss):
        if ss[i] == v and f:
            f = 0
            ts = ss[i]
            s.add(ss[i])
        else not f:
            if ss[i] not in s:
                ts += ss[i]
                s.add(ss[i])
            else:
                if len(rs) < len(ts):
                    rs = ts
                    
    return "H"



s = input()
print(finddigit(s))
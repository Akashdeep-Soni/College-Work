#PF-Prac-35

def rom_gen(num,less_sbl,mid_sbl,more_sbl,less_val,mid_val,more_val):
    if num == mid_val:
        return mid_sbl
    elif num < mid_val:
        if less_val == mid_val - num:
            return less_sbl+mid_sbl
        else:
            return less_sbl*(num//less_val)
    elif num > mid_val:
        if less_val == more_val - num:
            return less_sbl+more_sbl
        else:
            return mid_sbl + less_sbl * ((num- mid_val)//less_val)


def convert_to_roman(num):
    #Start writing your code here
    num = str(num)
    roman = ""
    d = {1:'I',5:'V',10:'X',50:'L',100:'C',500:'D',1000:'M'}
    size = len(num)
    if size == 4:
        roman += int(num[0])*d[1000]
        num = num[1:]
        size -= 1
    while size > 0:
        mlt = 10 ** (size - 1)
        roman += rom_gen(int(num[0])*mlt,d[1*mlt],d[5*mlt],d[10* mlt],1*mlt,5*mlt,10*mlt)
        num = num[1:]
        size -= 1
    return roman

for num in range(1,5000):    
    print(num," : ",convert_to_roman(num))

#PF-Tryout

def doublePreceding (values):
    if len(values) > 0:
        previous = values[1]
        values[0] = 0
        for idx in range(2, len(values)):
            values[idx] = 2 * previous
            previous = values[idx]
    return values
    
print(doublePreceding([3,8,2]))
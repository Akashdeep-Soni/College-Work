gem = {'Emerald':1760, "Ivory":2119, "Jasper":1599, "Ruby":3920, "Garnet":3999}
gem_list = input("Enter Gem List:").split()
qty_list = list(map(int,input("Enter Quantity List:").split()))

def gem_discount(gem):
    if gem == "Ivory":
        return 3
    elif gem == "Ruby":
        return 4
    else:
        return 6

bill_flag = 1
bill_amount = 0
discount_percent = 0
for g,q in zip(gem_list,qty_list):
    if q<=0:
        print("Bill Amount: -1")
        bill_flag = 0
    else:
        bill_amount += (q * gem[g])
        if discount_percent < gem_discount(g):
            discount_percent = gem_discount(g)
if bill_flag:
    bill_amount -= (bill_amount*discount_percent)/100
    print("Bill Amount: ",bill_amount)


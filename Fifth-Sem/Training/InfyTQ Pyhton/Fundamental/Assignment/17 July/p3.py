furniture = ["Sofa Set", "Dinning Table", "T.V. Stand", "Cupboard"]
cost = [20000, 8500, 4599, 13920]

sel_furniture =input("Enter Furniture: ")
qty = int(input("Enter Quantity: "))

if sel_furniture in furniture:
    if qty>0:
        bill_amount = cost[furniture.index(sel_furniture)] * qty
        print("Bill amount",bill_amount)
    else:
        print("Quantity should be greater than zero")
else:
    print("Furniture not available")


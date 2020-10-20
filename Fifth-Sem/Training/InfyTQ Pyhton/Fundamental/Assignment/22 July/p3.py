def calculate_bill(f,q,d):
    bill_amount = 0
    if f not in ['V','N'] or q<=1 or d<=0:
        return -1
    if f=="V":
        bill_amount = 120 * q
    else:
        bill_amount = 150 * q
    
    distance_charge = 0
    if d<4:
        distance_charge=0
    elif d>3 and d<7:
        distance_charge = d*3
    else:
        distance_charge = 9 + (d-6)*6

    bill_amount+=distance_charge
    return bill_amount

    
    

food_type = input("Enter Food Type ( V, N): ")
qty = int(input("Enter Quantity: "))
distance = int(input("Enter Distance"))

print("Bill Amount",calculate_bill(food_type,qty,distance))
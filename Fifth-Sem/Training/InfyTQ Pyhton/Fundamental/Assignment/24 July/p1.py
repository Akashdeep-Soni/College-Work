def bus_profit(distance, passangers):
    fuel_price = 70
    bus_mileage = 10
    ticket_price = 80

    profit = ticket_price * passangers - fuel_price * (distance/bus_mileage)
    return profit if(profit>=0) else -1

d = int(input("Enter distance: "))
p = int(input("No. of passenegers: "))

print(bus_profit(d,p))
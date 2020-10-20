def company_policy(stock,order,credit):
    if credit == 'True':
        if order<=stock:
            print("Customer order will be supplied")
        else:
            print(order,"Order will be supplied\nRemaining will be shipped soon")
    else:
        print("Credit is not OK. Not able to supply")

stock = int(input("Enter stock available: "))
order = int(input("Enter no. of orders: "))
credit = input("Is credit ok? 'True' or 'False' ")

company_policy(stock,order,credit)
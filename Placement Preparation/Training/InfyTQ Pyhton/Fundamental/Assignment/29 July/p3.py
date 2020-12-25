def ticket_cost(a,c,t):
    t = t*a + t/3 *c
    t += t * 0.07
    t -= t * 0.1
    return t

a,c = map(int,input("Enter Number of Adults and Children: ").split())
t = int(input("Enter Ticket Price: "))
print("Ticket Cost:",ticket_cost(a,c,t))
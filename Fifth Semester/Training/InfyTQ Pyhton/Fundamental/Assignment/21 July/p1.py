customer_details = {1001: 'John',1004:'Jill', 1005:'Joe',1003:'Jack'}

print("A. Customer Details:\n",customer_details)
print("B. Number of Customers:", len(customer_details))
print("C. Customer Names in Ascending order:\n",*sorted(customer_details.values()))
del customer_details[1005]
print("D. After Deletion:\n",customer_details)
customer_details[1003] = "Mary"
print("E. After Updation:\n",customer_details)
print("F. Exist") if 1002 in customer_details else print("F. Not Exist")
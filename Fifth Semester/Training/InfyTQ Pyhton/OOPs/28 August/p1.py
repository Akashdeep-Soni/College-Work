class customer:
    def __init__(self,cust_id,tel_no):
        self.cust_id = cust_id
        self.tel_no = tel_no
    
    def display(self):
        print("Customer Id:",self.cust_id,"\nTelephone No.",self.tel_no)

c1 = customer(1234, 9876543210)
c1.display()